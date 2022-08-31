package DI.components

import DI.modules.MatrizModule
import Juego
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MatrizModule::class])
interface JuegoComponent {
     fun build(): Juego
}