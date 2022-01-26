

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;


import java.util.Scanner;

/**
 *
 * @author honrolse
 */
public class CarreraCaballos9de10 {

    public static void main(String[] args) throws InterruptedException {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un nombre de usuario:");

        String usuario = tec.next();

        int i = 0;

        int meta = 0;

        while (i < usuario.length()) {
            char c = usuario.charAt(i);
            meta = meta + c;

            i++;

        }
        System.out.println("la meta es: " + meta);

        System.out.println("");
        System.out.println("QUE EMPIECE LA CARRERA!");
        System.out.println("");

        int c1 = 0;
        int c2 = 0;
        int random;

        int turno = 0;

        while (c1 < meta && c2 < meta) {
            Thread.sleep(50);
            turno++;
            System.out.println("turno: " + turno);

            random = (int) (Math.random() * 2 + 1);

            if (random == 1) {
                c1++;
                for (int cont = 0; cont <= c1; cont++) {
                    System.out.print("1");
                }
                System.out.println("");
                for (int cont = 0; cont <= c2; cont++) {
                    System.out.print("2");
                }

            } else {
                c2++;
                for (int cont = 0; cont <= c1; cont++) {
                    System.out.print("1");
                }
                System.out.println("");
                for (int cont = 0; cont <= c2; cont++) {
                    System.out.print("2");
                }
            }
            System.out.println("");
        }
        if (c1 == meta) {
            System.out.println("GANADOR: CABALLO 1");
        } else if (c2 == meta) {
            System.out.println("GANADOR: CABALLO 2");
        }

    }

}
