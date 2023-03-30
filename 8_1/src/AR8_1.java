import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class AR8_1 {
    public static void main(String[] args) throws Exception {
        Hora r = new Hora(11, 30);
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r);
        System.out.println("escriba una hora");

        int hora = new Scanner(System.in).nextInt();

        boolean cambio = r.setHora(hora);
        if (cambio) {
            System.out.println(r);
        } else {
            System.out.println("la hora no se pudo cambiar");
        }
    }
}