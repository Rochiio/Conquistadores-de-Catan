package Tablero.Matriz

import Jugadores.Jugador

/**
 * Funciones de la matriz
 */
interface MatrizFunctions {
    /**
     * Te devuelve el jugador que hay en esa casilla
     */
    fun getPlayer(fil:Int , col:Int):Jugador?

    /**
     * Mostrar la matriz
     */
    fun show()

    /**
     * Añadir al jugador
     */
    fun addPlayer(player: Jugador, fil: Int, col: Int)

    /**
     * Inicializar la matriz
     */
    fun initMatriz()
}