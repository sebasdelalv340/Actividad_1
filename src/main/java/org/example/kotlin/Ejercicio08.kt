package org.example.kotlin

/*
Traduce el siguiente fragmento de código Java a Kotlin, que simula un pequeño combate
 entre dos personajes, donde ambos atacan hasta que uno de los dos quede sin vida.
 Java:
 public class Combate {
 public static void main(String[] args) {
 Personaje goku = new Personaje("Goku", 100, 20);
 Personaje vegeta = new Personaje("Vegeta", 80, 25);
 while (goku.vida > 0 && vegeta.vida > 0) {
 goku.vida-= vegeta.ataque;
 vegeta.vida-= goku.ataque;
 System.out.println("Vida de Goku: " + goku.vida);
 System.out.println("Vida de Vegeta: " + vegeta.vida);
 }
 if (goku.vida <= 0) {
 System.out.println("Vegeta ha ganado el combate.");
 } else {
 System.out.println("Goku ha ganado el combate.");
 }
 }
 }
 class Personaje {
 String nombre;
 int vida;
 int ataque;
 public Personaje(String nombre, int vida, int ataque) {
 this.nombre = nombre;
 this.vida = vida;
 this.ataque = ataque;
 }
 }
 */

class Personaje(val nombre: String, var vida: Int, val ataque: Int) {
    fun estaVivo() = vida >= 0

    fun recibirDamage(damage: Int) {
        vida -= damage
    }
}

class Ejercicio08 {
    private val goku = Personaje("Goku", 100, 20)
    private val vegeta = Personaje("Vegeta", 80, 25)

    fun combate() {
        while (goku.estaVivo() && vegeta.estaVivo()) {
            goku.recibirDamage(vegeta.ataque)
            vegeta.recibirDamage(goku.ataque)
            println("Vida de ${goku.nombre}: ${goku.vida}")
            println("Vida de ${vegeta.nombre}: ${vegeta.vida}")
        }
        comprobarVida()
    }

    private fun comprobarVida() {
        if (!goku.estaVivo()) {
            println("${vegeta.nombre} ha ganado el combate.")
        } else {
            println("${goku.nombre} ha ganado el combate.")
        }
    }

}



