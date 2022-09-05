package Jugadores

import Tablero.Materiales

/**
 * Clase base para los jugadores
 */
abstract class Jugador {
    private var madera = 0
    private var carbon = 0
    private var trigo = 0


    /**
     * Para saber si tiene todos sus recursos a 20 o mas
     * @return boolean
     */
    fun todoMasVeinte(): Boolean {
        return madera >= 20 && carbon >= 20 && trigo >= 20
    }


    /**
     * Para añadir 1 en el material.
     * @param material saber que material hay en esa casilla.
     */
    fun addValorNumero(material: Materiales) {
        if (material === Materiales.CARBON) {
            carbon++
        } else if (material === Materiales.TRIGO) {
            trigo++
        } else if (material === Materiales.MADERA) {
            madera++
        }
    }

}