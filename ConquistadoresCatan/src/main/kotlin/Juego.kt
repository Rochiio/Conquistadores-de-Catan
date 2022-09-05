import Jugadores.Humano
import Jugadores.Ordenador
import Tablero.Casillas
import Tablero.Matriz.Matriz
import utils.Aleatories
import utils.Input

class Juego(var tablero: Matriz) {

    private var persona = Humano()
    private var pc = Ordenador()
    private val COLS = 4
    private val FILS = 3


    /**
     * Inicio: Crear la matriz.
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
     * Para que el ordenador elija sus casillas aleatoriamente.
     */
    private fun pedirOrdenador() {
        var fil: Int
        var col: Int

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
        var fil: Int
        var col: Int

        println("Jugador es su turno!🙋🏻‍")
        do {
                fil = Input.selectNumberFil()-1
                col = Input.selectNumberCol()-1
            }while (tablero.getPlayer(fil,col)!=null)
        tablero.addPlayer(persona,fil,col)
    }


    /**
     * Método para saber cuando debe de acabar el programa
     */
    fun finished() {
        do{
            var number = Aleatories.getAleatoryDadoNumber()
            println("\nHa salido el número: $number🎲")
            getNumbersCasilla(number)
        }while (!persona.todoMasVeinte() && !pc.todoMasVeinte())
            println(getWinner())
    }


    /**
     * Método para saber quién es el ganado o si hay empate.
     */
    private fun getWinner():String {
        var returns = if (persona.todoMasVeinte() && !pc.todoMasVeinte()){
            "Ha ganado el humano🙋🏻!"
        }else if(pc.todoMasVeinte() && !persona.todoMasVeinte()){
            "Ha ganado el ordenador🤖!"
        }else{
            "Ha habido un empate!"
        }

        return returns
    }


    /**
     * Método para ver si cada casilla tiene el número del dado y hacer sus respectivas acciones.
     * @param number Número del dado
     */
    private fun getNumbersCasilla(number: Int) {
        for (i in 0 until FILS){
            for (j in 0 until  COLS){
                var casilla = tablero.getCasilla(i,j)
                results(number,casilla)
            }
        }
    }


    /**
     * Añadir materiales al jugador correspondiente en caso de que
     * la casilla tenga el mismo número que el dado.
     * @param number Número del dado.
     * @param casilla Casilla a mirar.
     */
    private fun results(number: Int, casilla: Casillas) {
        if (number == casilla.getNumero()){
            if (casilla.getJugadorCasilla() is Humano){
                persona.addValorNumero(casilla.getMaterial())
                println("1 item de ${casilla.getMaterial().name} para el jugador: Humano🙋🏻‍")
            }else{
                pc.addValorNumero(casilla.getMaterial())
                println("1 item de ${casilla.getMaterial().name} para el jugador: Ordenador🤖")
            }
        }
    }
}