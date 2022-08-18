package utils

import Tablero.Materiales

/**
 * Crear los aleatorios que se necesitan para el programa
 */
object Aleatories {

    /**
     * Devuelve un material aleatorio
     */
    fun getAleatoryMaterial(): Materiales{
        var material: Materiales? = null
        when((1..3).random()){
            1 -> material = Materiales.CARBON
            2 -> material = Materiales.MADERA
            3 -> material = Materiales.TRIGO
        }
        return material!!
    }

    /***
     * Devuelve un número aleatorio entre el 1 y el 6
     */
    fun getAleatoryDadoNumber():Int{
        return (1..6).random()
    }

    /***
     * Devuelve un número aleatorio entre el 1 y el 3
     */
    fun getAleatoryFil():Int{
        return (1..3).random()
    }

    /***
     * Devuelve un número aleatorio entre el 1 y el 4
     */
    fun getAleatoryCol():Int{
        return (1..4).random()
    }

}