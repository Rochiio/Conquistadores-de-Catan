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
    }


    /**
     * Hacer que los jugadores elijan sus casillas.
     */
    fun startGame(){
        var ocupated= 0
            do {
                tablero.show()
                pedirPersona()
                pedirOrdenador()
                ocupated+=2
            }while (ocupated<12)
    }


    /**
     * Para uqe el ordenador elija sus casillas aleatoriamente.
     */
    private fun pedirOrdenador() {
        var fil=0
        var col=0

        println("El ordenador está eligiendo!🤖")
        do {
            fil = Aleatories.getAleatoryFil()-1
            col = Aleatories.getAleatoryCol()-1
        }while (tablero.getPlayer(fil,col)!=null)
        tablero.addPlayer(pc,fil,col)
    }


    /**
     * Para que la persona seleccione las casillas que quiere.
     */
    private fun pedirPersona() {
        var fil=0
        var col=0

        println("Jugador es su turno!🙋🏻‍")
        do {
                fil = Input.selectNumberFil()-1
                col = Input.selectNumberCol()-1
            }while (tablero.getPlayer(fil,col)!=null)
        tablero.addPlayer(persona,fil,col)
    }
}