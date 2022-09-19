package org.example;

import clase.Estudiaante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=100;
        Scanner lea = new Scanner(System.in);
        Estudiaante[] estudiaantes= new Estudiaante[5];

        System.out.println("***Menu***");
        System.out.println("1. Agregar un estudiante");
        System.out.println("2. Ver estudiantes");
        System.out.println("3. SALIR");

        while (opcion!=3){



            System.out.printf("Digite una opcion: ");
            opcion=lea.nextInt();


            switch (opcion){


                case 1:
                    System.out.println("Selecciono opcion 1");
                    for (int i=0; i<estudiaantes.length;i++){
                        Estudiaante prueba = new Estudiaante();
                        System.out.println("Digite el nombre del estudiante: ");
                        prueba.setNombre(lea.next());
                        estudiaantes[i]=prueba;

                    }
                    break;
                case 2:
                    System.out.printf("Seleccione opcion 2");
                    for (int i=0; i<estudiaantes.length;i++){
                        System.out.println(estudiaantes[i].getNombre());
                    }
                    break;
                case 3:
                    System.out.printf("Adios");
                    break;
                default:
                    System.out.printf("Seleccione opcion valida");

            }

        }
    }
}