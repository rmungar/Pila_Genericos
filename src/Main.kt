fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev:List = reverse(numbers)
    val pila = Pila()
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

    //Realiza la misma prueba, pero con listas de otros tipos de datos...
    //por ejemplo una lista que combine valores numéricos Int, Float y Double

    //Otra con una lista de cualquier data class que te inventes.

    //Comprueba también si podemos hacerlo con una lista de tipos de datos distintos...
    //por ejemplo con una lista que contenga tipos de datos String, Int, Float, Usuario("Pepe", 30), Boolean...
    //¿Por qué es posible usarla si parece que la lista contiene tipos de datos diferentes?

}