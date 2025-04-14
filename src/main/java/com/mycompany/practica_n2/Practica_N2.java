/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_n2;

import java.util.Scanner;

public class Practica_N2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las 3 notas del Primer Ciclo.....");
        float[] notas1 = new float[3];
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingresa la nota N" + (i + 1));
            notas1[i] = teclado.nextFloat();
        }
        System.out.println("----------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("Estas son tus notas ingresadas:");
            System.out.println("Nota N" + (i + 1) + ": " + notas1[i] + " ");

        }
        System.out.println("--------------------------------");
        float suma1 = 0;
        float promedio1 = 0;
        for (int i = 0; i < 3; i++) {
            suma1 = suma1 + notas1[i];
        }

        promedio1 = suma1 / 3;
        System.out.println("Tu nota del Primer Ciclo es :" + promedio1);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("Ingrese las 3 notas del Segundo Ciclo.....");
        float[] notas2 = new float[3];
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingresa la nota N" + (i + 1));
            notas2[i] = teclado.nextFloat();
        }
        System.out.println("----------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("Estas son tus notas ingresadas:");
            System.out.println("Nota N" + (i + 1) + ": " + notas2[i] + " ");

        }
        System.out.println("--------------------------------");
        float suma2 = 0;
        float promedio2 = 0;
        for (int i = 0; i < 3; i++) {
            suma2 = suma2 + notas2[i];
        }

        promedio2 = suma2 / 3;
        System.out.println("Tu nota del Segundo Ciclo es :" + promedio2);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        float promedio = 0;
        promedio = promedio1 + promedio2;
        System.out.println("Tu promedio de los Tres Ciclos es :" + promedio);

        if (promedio < 14) {
            System.out.println("No alcansas la nota permitida Reprueba");
            System.out.println("-----------------------------------");
            System.out.println("Para poder acceder al examen de recuperacion debes tener una nota permitda");

            float noPermitida = (promedio / 2);
            float notaFinal = noPermitida;
            noPermitida = noPermitida + 10;

            float notaExam = 0;
            if (noPermitida < 8) {

                System.out.println("Con tu prodio actual no alcanzaras para aprobar la materia");
                System.out.println("---------------------------");
                System.out.println("Reprobado con tu promedio de " + promedio);
            } else {
                System.out.println("Puedes dar el Examen de Recuperacion");
                System.out.println("----------------------------");
                System.out.println("Ingresa la nota del Examen dado: ");
                notaExam = teclado.nextFloat();
                notaFinal = notaFinal + notaExam;
                if (notaFinal >= 14) {
                    System.out.println("Felicidades APREUBA LA MATERIA ");
                } else {
                    System.out.println("DESAPRUEBAS LA MATERIA");
                }
            }

        } else {
            System.out.println("Alcansas la nota permitida Aprueba");
        }
    }
}