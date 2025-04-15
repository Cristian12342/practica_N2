/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_n2;

import java.util.Scanner;

public class Practica_N2 {

    public static void main(String[] args) {

        Scanner teclado = new  Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("--ESCUELA SUPERIOR POLITECNICA DE CHIMBORAZO--");
        System.out.println("----------------------------------------");
        System.out.println("--------------Bienvenido----------------");

        System.out.println("-----------------------------------------");
        
        System.out.println("Ingrese las 3 notas del Primer Ciclo.....");
        float [ ] notas1 = new float[3];        
        for(int i=0 ; i<3 ; i++){
            
            System.out.println("Ingresa la nota N"+ (i+1));
            String entrada=teclado.nextLine();
            notas1 [i]= Float.parseFloat(entrada.replace(",","."));
        }
        System.out.println("----------------------------------------");

        System.out.println("Estas son tus notas ingresadas:");
        for(int i=0 ; i<3 ; i++){
        System.out.println("Nota N"+(i+1)+": "+notas1[i]+" ");

        }
        System.out.println("--------------------------------");
        float suma1=0;
        float promedio1=0;
        for(int i=0; i<3;i++){
        suma1= suma1 + notas1[i];
        }

        promedio1= suma1/3;
        
        System.out.printf("Este es tu Promedio del Primer Ciclo :"+" %.2f\n",promedio1);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("Ingrese las 3 notas del Segundo Ciclo.....");
        float [ ] notas2 = new float[3];        
        for(int i=0 ; i<3 ; i++){
            
            System.out.println("Ingresa la nota N"+ (i+1));
            String entrada=teclado.nextLine();
            notas2 [i]= Float.parseFloat(entrada.replace(",","."));
        }
        System.out.println("---------------------------------");

        System.out.println("Estas son tus notas ingresadas:");
        for(int i=0 ; i<3 ; i++){
            
        System.out.println("Nota N"+(i+1)+": "+notas2[i]+" ");

        }
        System.out.println("----------------------------------");
        float suma2=0;
        float promedio2=0;
        for(int i=0; i<3;i++){
        suma2= suma2 + notas2[i];
        }
        
        promedio2= suma2/3;
        
        System.out.printf("Este es tu Promedio del Segundo Ciclo :"+" %.2f\n",promedio2);

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        float promedio=0;
        promedio= promedio1+promedio2;

        System.out.printf("La sumatario de los Dos Ciclos es : "+" %.2f\n",promedio);

        if(promedio < 14){
            System.out.println("No alcansas la nota permitida Reprueba la Materia");
            System.out.println("--------------------------------");
            System.out.println("Para poder acceder al examen de recuperacion debes tener una nota permitda");
            System.out.println("--------------------------------");
            float noPermitida = (promedio/2);
            float notaFinal=noPermitida;
            noPermitida = noPermitida+10;

            
            if(noPermitida<8){

                System.out.println("Con tu promedio actual no alcanzaras para aprobar la materia");
                System.out.println("------------------------------");
                System.out.printf("NO APROBADO con tu promedio de : "+"  %.2f\n",promedio);
            }   
            if (promedio >10){
                    System.out.println("Felicidades tienes la nota permitida");
                    System.out.println("Puedes dar el Examen de Recuperacion");
                    System.out.println("---------------------------");
                    System.out.println("Ingresa la nota del Examen dado: ");

                    float notaExam=0;
                    notaExam= teclado.nextFloat();
                    notaFinal= notaFinal+notaExam;

                    if (notaFinal>=14){
                        System.out.println("Felicidades APRUEBA LA MATERIA ");
                        System.out.println("--------ESPOCH SEDE ORELLANA--------");
                    }
                    else{
                        System.out.println("NO APRUEBAS LA MATERIA");
                        System.out.println("--------ESPOCH SEDE ORELLANA--------");
                    }
            }
            else{
                System.out.println("----------------------------------");
                System.out.println("No Tines los puntos permitidos para acceder al examen de recupreacion");
                System.out.println("Buena Suerte a la proxima");
                System.out.println("--------ESPOCH SEDE ORELLANA--------");
            }
            
        }
        else{
            System.out.println("Alcanzas la nota permitida Aprueba");
            System.out.println("--------ESPOCH SEDE ORELLANA--------");
        }
}
}