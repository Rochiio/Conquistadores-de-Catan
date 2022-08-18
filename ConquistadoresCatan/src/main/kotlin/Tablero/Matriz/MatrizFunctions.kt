package Tablero.Matriz

import Jugadores.Jugador

/**
 * Funciones de la matriz
 */
interface MatrizFunctions {
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