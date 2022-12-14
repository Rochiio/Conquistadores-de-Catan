package Tablero.Matriz

import Jugadores.Jugador
import Tablero.Casillas
import utils.Aleatories

/**
 * Clase de implementación de la matriz
 */
class MatrizImpl(): Matriz() {

    private val COLS = 4
    private val FILS = 3


    /**
     * Devuelve la casilla elegida.
     */
    override fun getCasilla(fil: Int, col: Int): Casillas {
        return this[fil][col]
    }


    /**
     * Te devuelve el jugador o no que hay en la casilla pedida.
     */
    override fun getPlayer(fil: Int, col: Int): Jugador? {
        return this[fil][col].getJugadorCasilla()
    }


    /**
     * Mostrar la matriz
     */
    override fun show() {
        for (juego: ArrayList<Casillas> in this) {
            for (casillas: Casillas in juego) {
                print("[ $casillas ] ")
            }
            println()
        }
    }


    /**
     * Añadir al jugador que le toque la casilla
     */
    override fun addPlayer(player: Jugador, fil: Int, col: Int) {
        this[fil][col].setJugadorCasilla(player)
    }


    /**
     * Inicializar la matriz con los numeros y materiales aleatorios
     */
    override fun initMatriz() {
        for (i in 0 until FILS) {
            val column = ArrayList<Casillas>()
            for (j in 0 until COLS) {
                column.add(Casillas())
                column[j].setNumero(Aleatories.getAleatoryDadoNumber())
                column[j].setMaterial(Aleatories.getAleatoryMaterial())
            }
            this.add(column)
        }
    }


}