public class AR7_4
 {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c1,c2;
        c1= new CuentaCorriente("12345678-A", "Ana");
        c2= new CuentaCorriente("12345678-B", "Maria");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Banco Central");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Caja de Ahorros de Do-While");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
}
 }
