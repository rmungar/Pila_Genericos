fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev:List<Any> = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev)) println("Error")
    else println("Correcto")
    println(numbersRev)

    //Realiza la misma prueba, pero con listas de otros tipos de datos...
    //por ejemplo una lista que combine valores numéricos Int, Float y Double

    println()
    val numeros = listOf<Number>(1, 12.0F, 98.00)
    val numerosReversa = reverse(numeros)
    if (!listOf(98.00, 12.0F, 1).equals(numerosReversa)) println("Error")
    else println("Correcto")
    println(numerosReversa)

    //Otra con una lista de cualquier data class que te inventes.

    println()
    val usuario1 = Usuario("Sibón", 10)
    val usuario2 = Usuario("Cano", 20)
    val usuario3 = Usuario("Diego", 30)
    val usuarios = listOf(usuario1,usuario2,usuario3)
    val usuariosReversa = reverse(usuarios)

    if (!listOf(usuario3,usuario2,usuario1).equals(usuariosReversa)) println("Error")
    else println("Correcto")
    println(usuariosReversa)

    //Comprueba también si podemos hacerlo con una lista de tipos de datos distintos...
    //por ejemplo con una lista que contenga tipos de datos String, Int, Float, Usuario("Pepe", 30), Boolean...
    //¿Por qué es posible usarla si parece que la lista contiene tipos de datos diferentes?

    println()
    val mezcla = listOf(1, "Hola", 89.0F, usuario3, 90.00)
    val mezclaReversa = reverse(mezcla)

    if (!listOf(90.00, usuario3, 89.0F, "Hola", 1).equals(mezclaReversa)) println("Error")
    else println("Correcto")
    println(mezclaReversa)
}