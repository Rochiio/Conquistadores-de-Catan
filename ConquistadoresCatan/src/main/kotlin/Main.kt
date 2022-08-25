import Tablero.Matriz.MatrizImpl

fun main(args: Array<String>) {
   var game = Juego(MatrizImpl())

    game.init()
    game.startGame()
    game.finished()
}