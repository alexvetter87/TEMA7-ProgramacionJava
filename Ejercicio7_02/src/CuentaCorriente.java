
public class CuentaCorriente {
    

        String dni;
        String nombre;
        double saldo;
    
        CuentaCorriente(String dni, String nombre) {
            this.dni = dni;
            this.nombre = nombre;
            saldo = 0;
        }

        CuentaCorriente(String dni, double saldo) {
            this.dni = dni;
            this.saldo = saldo;
            this.nombre = "sin asiganr";

        }
        CuentaCorriente(String dni, String nombre, double saldo) {
            this.dni = dni;
            this.nombre = nombre;
            this.saldo = saldo;
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
    
    
    

}
