/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Coche {

    private String matricula;
    private int tiempo;
    private float precio;
    private float cartosRecibidos;
    private float cartosDevoltos = cartosRecibidos - precio;
    Scanner sc = new Scanner(System.in);

    public void calcularPrecio() {
        System.out.println("Introduce o numero de horas");
        tiempo = sc.nextInt();
        if (tiempo <= 3) {
            precio = 1.50f;
        } else {
            int tiempo2 = tiempo - 3;
            precio = (tiempo2 * 0.2f) + 1.5f;
        }
        do {
            System.out.println("O precio é: " + precio + "\nIntroduce o diñeiro");
            cartosRecibidos = sc.nextInt();
            cartosDevoltos = cartosRecibidos - precio;
        } while (cartosRecibidos < precio);
    }

    public void pedirDatos() {
        System.out.println("Introduce a matricula");
        matricula = sc.next();
        calcularPrecio();
    }

    public void amosar() {
        System.out.println("Factura:\n" + "Matricula: " + matricula + "\nTiempo: " + tiempo + "\nPrecio: "
                + precio + "\ncartosRecibidos: " + cartosRecibidos + "\ncartosDevoltos: " + cartosDevoltos
                + "\nGRACIAS POR USAR O NOSO APARCADOIRO\n");
    }

}
