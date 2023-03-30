import java.util.Arrays;
import java.util.Scanner;

public class AR8_12 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s;
        Caja c = new Caja(1, 2, 3, Unidad.cm);
        System.out.println("introduce valor de la etiqueta");
        s = sc.nextLine();
        c.etiqueta=s;
        System.out.println(c);
        CajaCarton cc= new CajaCarton(10, 10, 20, Unidad.cm,4);
        System.out.println("la superficie de la caja es: "+cc.superficieTotal());
    }
}
