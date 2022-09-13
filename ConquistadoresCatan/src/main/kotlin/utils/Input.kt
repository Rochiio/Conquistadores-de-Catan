package utils


/**
 * Para la entrada de datos.
 */
object Input {

    /**
     * Pedir el número de fila.
     */
    fun selectNumberFil():Int{
        var fil: String
        do{
            println("Elige una fila")
            fil = readln()
            }while (!fil.matches(Regex("[1-3]")))
        return Integer.parseInt(fil)
    }


    /**
     * Pedir el número de columna
     */
    fun selectNumberCol():Int{
        var col: String
        do{
            println("Elige una columna")
            col = readln()
        }while (!col.matches(Regex("[1-4]")))
        return Integer.parseInt(col)
    }
}