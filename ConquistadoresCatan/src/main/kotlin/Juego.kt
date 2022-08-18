import Jugadores.Humano
import Jugadores.Ordenador
import Tablero.Matriz.Matriz
import utils.Aleatories
import utils.Input

class Juego(var tablero: Matriz) {
    private var persona = Humano()
    private var pc = Ordenador()

    /**
     * Inicio: Crear la matriz y mostrarla.
     */
    fun init(){
       tablero.initMatriz()
       tablero.show()
    }


    /**
     * Hacer que los jugadores elijan sus casillas.
     */
    fun startGame(){
        var ocupated =0
            do {
                pedirPersona()
                pedirOrdenador()
                ocupated+2
            }while (ocupated<12)
    }


    /**
     * Para uqe el ordenador elija sus casillas aleatoriamente.
     */
    private fun pedirOrdenador() {
        var fil=0
        var col=0
        do {
            println("El ordenador está eligiendo!🤖")
            fil = Aleatories.getAleatoryFil()
            col = Aleatories.getAleatoryCol()
        }while (tablero.getPlayer(fil,col)!=null)
        tablero.addPlayer(pc,fil,col)
    }


    /**
     * Para que la persona seleccione las casillas que quiere.
     */
    private fun pedirPersona() {
        var fil=0
        var col=0
            do {
                println("Jugador es su turno!🙋🏻‍")
                fil = Input.selectNumberFil()
                col = Input.selectNumberCol()
            }while (tablero.getPlayer(fil,col)!=null)
        tablero.addPlayer(persona,fil,col)
    }
}