import java.util.Scanner;

public class AR7_2 {
    
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int opcion;
            CuentaCorriente c = null;
            c = new CuentaCorriente("12345678A", "Pepe");
            do {
                //CuentaCorriente c;
                System.out.println("MENU");
                System.out.println("1-IDENTIFIQUISE \n2-RETIRAR DINERO \n3-INGRESAR DINERO \n4-SALIR");
                opcion = sc.nextInt();
    
                if (opcion == 1) {
                    c.mostrarInformacion();
    
                }
    
                if (opcion == 2) {
                    System.out.println("¿QUIERES RETIRAR EFECTIVO? DIME LA CANTIDAD");
                   
                    c.egreso(sc.nextInt());
                }
    
                if (opcion == 3) {
                    System.out.println("¿QUIERES REALIZAR UN DEPÓSITO? DÍGAME LA CANTIDAD");
                    c.ingreso(sc.nextInt());
                }
    
                if (opcion == 4) {
                    System.out.println("OPERACIÓN TERMINADA");
                }
                if (opcion > 4 || opcion < 1) {
                    System.out.println("prueba otra vez");
                }
    
            } while (opcion != 4);
    
            c = new CuentaCorriente("12345678A", "Pepe");
            c.ingreso(1000);
            c.egreso(300);
    
            c.mostrarInformacion();
            System.out.println("Puedo sacar 600 euros: " + c.egreso(600));
            c.mostrarInformacion();
            System.out.println("puedo sacar 500 euros: " + c.egreso(500));
            System.out.println("cuanto quieres ingresar?");
    
            c.ingreso(sc.nextInt());
    
            System.out.println("Puedo sacar 700 euros: " + c.egreso(700));
            System.out.println("puedo sacar 500 euros: " + c.egreso(500));
            c.mostrarInformacion();
    
            System.out.println("¿CUANTO QUIERES INGRESAR");
            System.out.println("Voy a ingresar: " + c.ingreso(sc.nextDouble()));
    
            System.out.println("¿CUANTO QUIERES RETIRAR");
            System.out.println("¿PUEDO SACAR ESE DINERO?" + c.egreso(sc.nextInt()));
            
            System.out.println("");

            c = new CuentaCorriente("445789456k", 1900);
            c.mostrarInformacion();
            
            System.out.println("");
            

            c = new CuentaCorriente("12345678b", "tete", 800);
            c.mostrarInformacion();


        }
    
    }
    
        
    
    
    


