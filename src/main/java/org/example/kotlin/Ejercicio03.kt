package org.example.kotlin;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;
/*
 Vamos a practicar con bucles, que en ambos lenguajes se usan mucho, sobre todo en
 situaciones como recorrer inventarios o colecciones de objetos.
 Compara el uso del bucle for en ambos lenguajes, haciendo hincapié en cómo Kotlin
 simplifica la sintaxis.

 public class Ejercicio03 {
    public void cofre(){
        String[] cofres = {"Espada", "Escudo", "Poción"};
        for(String cofre: cofres){
            System.out.println("Has encontrado: " + cofre);
        }
    }
}
 */

// En java, debemos especificar que cada elemento de la lista que recorremos es el bucle es de tipo String.
// Mientras que kotlin entiende el tipo de cada elemento que cogemos en ese momento de la lista.

class Ejercicio03() {
    fun cofre(){
        val cofres = listOf("Espada", "Escudo", "Poción")
        for(cofre in cofres){
            println("Has encontrado: $cofre")
        }
    }
}

