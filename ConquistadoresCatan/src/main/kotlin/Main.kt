import Tablero.Matriz.MatrizImpl

fun main() {
   var game = Juego(MatrizImpl())

    game.init()
    game.startGame()
    game.finished()
}