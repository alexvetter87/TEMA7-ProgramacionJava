import java.util.Scanner;

public class AR8_2
 {
    public static void main(String[] args) throws Exception {
        HoraExacta r = new HoraExacta (11,15,  23);
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r);
        System.out.println("escriba los segundos");

        int segundos = new Scanner(System.in).nextInt();

        
        
        if (r.setSegundos(segundos)) {
            System.out.println(r);
        } else {
            System.out.println("no es posible cambiar los segundos");
        }
    }
}
