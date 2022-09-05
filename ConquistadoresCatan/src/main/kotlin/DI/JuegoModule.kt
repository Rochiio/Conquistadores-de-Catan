package DI

import Juego
import Tablero.Matriz.Matriz
import Tablero.Matriz.MatrizImpl
import org.koin.dsl.module

/**
 * Modulo para poder crear la DI con koin.
 */

val JuegoModule = module {
    single<Matriz> { MatrizImpl() }
    single { Juego(get()) }
}