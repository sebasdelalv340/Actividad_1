package org.example.java;
/*
Kotlin tiene un sistema de tipos nulos más seguro que Java. Explica cómo funciona la
 seguridad de tipos nulos en Kotlin (String?), comparándola con Java.

 Kotlin:
 fun main() {
 var personaje: String? = null
 if (personaje != null) {
 println("El personaje es $personaje")
 } else {
 println("No hay personaje.")
 */

public class Ejercicio06 {
    public void nulos(){
        String personaje = null;
        if (personaje != null){
            System.out.println("El personaje es " + personaje);
        } else {
            System.out.println("No hay personaje");
        }
    }
}
