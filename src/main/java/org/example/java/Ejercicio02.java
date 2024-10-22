package org.example.java;
/*Vamos a ver cómo traducir el operador ternario en Java a Kotlin, ya que Kotlin no tiene un
operador ternario explícito.
Explica cómo funciona la estructura if en Kotlin en comparación con el operador ternario en
Java.

fun main() {
 val energia = 80
 val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
 println(estado)
 }
 */

// En kotlin, necesitamos crear el condicional if, else aunque sin llaves porque lo asignamos directamente a una variable.
// En Java, eliminamos i, else; pero usamos ? después de la condición y : entre los posible resultados.
public class Ejercicio02 {
    public void fortaleza(){
        int energia = 80;
        String estado = (energia > 50) ? "Personaje fuerte." : "Personaje débil.";
        System.out.println(estado);
    }
}
