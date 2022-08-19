package utils

import java.util.*

/**
 * Para la entrada de datos.
 */
object Input {
    var sc: Scanner = Scanner(System.`in`)

    /**
     * Pedir el número de fila.
     */
    fun selectNumberFil():Int{
        var fil=""
            do{
            println("Elige una fila")
            fil = sc.next()
            }while (!fil.matches(Regex("[1-3]")))
        return Integer.parseInt(fil)
    }


    /**
     * Pedir el número de columna
     */
    fun selectNumberCol():Int{
        var col=""
        do{
            println("Elige una columna")
            col = sc.next()
        }while (!col.matches(Regex("[1-4]")))
        return Integer.parseInt(col)
    }
}