package org.example;

import org.example.java.Ejercicio02;
import org.example.java.Ejercicio04;
import org.example.java.Ejercicio06;
import org.example.kotlin.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Ejercicio01 ej01 = new Ejercicio01();
        Ejercicio02 ej02 = new Ejercicio02();
        Ejercicio03 ej03 = new Ejercicio03();
        Ejercicio04 ej04 = new Ejercicio04();
        Ejercicio05 ej05 = new Ejercicio05("Goku", 100, 50);
        Ejercicio06 ej06 = new Ejercicio06();
        Ejercicio07 ej07 = new Ejercicio07();
        Ejercicio08 ej08 = new Ejercicio08();

            Scanner scanner = new Scanner(System.in);
            int opcion = 0;

            while (opcion != 7) {
                System.out.println("Menú:");
                System.out.println("1. Ejercicio 1");
                System.out.println("2. Ejercicio 2");
                System.out.println("3. Ejercicio 3");
                System.out.println("4. Ejercicio 4");
                System.out.println("5. Ejercicio 5");
                System.out.println("6. Ejercicio 6");
                System.out.println("7. Ejercicio 7");
                System.out.println("8. Salir");
                System.out.print("Introduce una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        ej01.personaje();
                        break;
                    case 2:
                        ej02.fortaleza();
                        break;
                    case 3:
                        ej03.cofre();
                        break;
                    case 4:
                        ej04.rango();
                        break;
                    case 5:
                        System.out.println(ej05);
                        break;
                    case 6:
                        ej06.nulos();
                        break;
                    case 7:
                        System.out.println(ej07.multiplicar(5));
                        break;
                    case 8:
                        ej08.combate();
                        break;
                    case 9:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
            scanner.close();
    }
}