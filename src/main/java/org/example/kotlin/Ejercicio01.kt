package org.example.kotlin;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

/*En este ejercicio, compararemos cómo se declaran variables en ambos lenguajes y las
diferencias en cuanto a la inferencia de tipos.
Explica las diferencias entre el uso de var y val en Kotlin frente a las variables en Java.

public class Main {
 public static void main(String[] args) {
 int vida = 100;
 String personaje = "Naruto";
 System.out.println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
 }
 }
 */

// En Java declaramos el tipo delante de la variable y en kotlin después, además declaramos como var para variables mutables y val para inmutables.
class Ejercicio01(){
    fun personaje() {
        val vida: Int = 100
        val personaje: String = "Naruto"
        println("El personaje $personaje tiene $vida puntos de vida.")
    }
}
