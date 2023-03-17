/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7_1;

/**
 *
 * @author JAVA
 */
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

}
