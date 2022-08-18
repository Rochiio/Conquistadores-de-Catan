package Tablero

import Jugadores.Humano
import Jugadores.Jugador


class Casillas {
    private lateinit var material: Materiales
    private var jugador: Jugador? =null
    private var number: Int = 0

    /**
     * Getter & Setter Jugador
     */
    fun setJugadorCasilla(jugador: Jugador) {
        this.jugador = jugador
    }

    fun getJugadorCasilla(): Jugador? {
        return jugador
    }

    fun setNumero(number: Int){
        this.number= number
    }

    fun getNumero(): Int {
        return number
    }

    fun setMaterial(material: Materiales){
        this.material = material
    }

    fun getMaterial(): Materiales {
        return material
    }


    override fun toString(): String {

        val sb: StringBuilder= StringBuilder()
        sb.append(material.toString()).append("  ").append(number.toString()).append("  ")
            when (jugador) {
                null -> {
                    sb.append(" VACIO ")
                }
                is Humano -> {
                    sb.append(" HUMANO ")
                }

                else -> {
                    sb.append(" ORDENADOR ")
                }
            }
        return sb.toString()
    }


}