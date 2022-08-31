package DI.modules
import Tablero.Matriz.Matriz
import Tablero.Matriz.MatrizImpl

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface MatrizModule {
    @Singleton
    @Binds
    fun matrizBindeo(impl: MatrizImpl): Matriz
}