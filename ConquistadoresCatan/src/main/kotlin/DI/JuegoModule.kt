package DI

import Juego
import Tablero.Matriz.Matriz
import Tablero.Matriz.MatrizImpl
import org.koin.dsl.module

val JuegoModule = module {
    single<Matriz> { MatrizImpl() }
    single { Juego(get()) }
}