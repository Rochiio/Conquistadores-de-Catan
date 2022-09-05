import DI.JuegoModule
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.GlobalContext.startKoin

class ConquistadoresApp : KoinComponent {
    private val game: Juego by inject()
    fun run() {
        game.init()
        game.startGame()
        game.finished()
    }
}

fun main() {

    startKoin {
        printLogger()
        modules(JuegoModule)
    }

    ConquistadoresApp().run()
}