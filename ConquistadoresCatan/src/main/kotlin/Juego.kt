import Jugadores.Humano
import Jugadores.Ordenador
import Tablero.Matriz.Matriz

class Juego(var tablero: Matriz) {
    private var persona = Humano()
    private var pc = Ordenador()

    fun init(){
       tablero.initMatriz()
       tablero.show()
    }
}