public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }

    boolean egreso(double cant) {
        boolean operacionPosible;
        if (saldo >= cant) {
            saldo -= cant;
            operacionPosible = true;
        } else {
            System.out.println("no hay suficiente");
            operacionPosible = false;
        }
        return (operacionPosible);
    }

    double ingreso(double cant) {
        saldo += cant;
        System.out.println("Tu saldo es: " + saldo);
        return cant;
    }

    void mostrarInformacion() {
        System.out.println("Nombre:" + nombre  );
        System.out.println("Dni: " + dni);
        System.out.println("Saldo:" + saldo + "euros");

    }



    static private String nombreBanco="International Java Bank";

    
    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;

    }
    static String getBanco() {
        return nombreBanco;
    }
}
