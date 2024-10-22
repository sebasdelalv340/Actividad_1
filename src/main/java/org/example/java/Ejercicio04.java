package org.example.java;
/*
 Aquí veremos cómo usar break y continue en Kotlin y compararlo con su equivalente en
 Java.
 Explica la diferencia en cómo Kotlin maneja rangos y control de flujo frente a Java.

  fun main() {
 for (i in 1..5) {
 if (i == 3) {
 continue // Salta la iteración cuando i es 3
 }
 println("Número: $i")
 }
 }
 */

// En Kotlin no necesitas darle un valor a i, pues i cogerá el valor dentro del rango declarado.
// Mientras en Java, debemos darle un valor a i, declarar el rango y decirle cuanto suma a i para ir los steps dentro del bucle.
public class Ejercicio04 {
    public void rango(){
        for(int i = 1; i <=5; i ++){
            if(i == 3){
                continue;
            }
            System.out.println("Numero: " + i);
        }
    }
}
