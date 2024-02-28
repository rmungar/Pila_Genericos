/**
 * Clase genérica que va a actuar como un stack con sus métodos característicos
 * @property contenido -> Contenido del stack
 */
class Pila <T>(){
    private val contenido = mutableListOf<T>()

    /**
     * Retorna el elemento superior del stack
     * @return T
     */
    fun top(): T {
        return contenido[contenido.size-1]
    }

    /**
     * Introduce un nuevo elemento en el stack
     * @param item -> Elemento a introducir en el stack
     */
    fun push(item: T){
        contenido.add(item)
    }

    /**
     * Retorna el elemento superior del stack
     * @return Null si no hay elemento
     * @return Dicho elemento
     */
    fun pop(): T?{
        return if (contenido.isEmpty()) null
        else contenido.removeAt(contenido.size - 1)
    }

    /**
     * Comprueba el contenido del stack y retorna true si contiene algo o false si esta vacío
     * @return Boolean
     */
    fun isEmpty(): Boolean{
        return contenido.isEmpty()
    }
}

/**
 * Recibe una lista y retorna dicha lista invertida mediante el uso de la clase Pila y los iterators
 * @param lista -> Lista que puede contener cualquier tipo de dato
 * @return la lista ingresada, pero invertida
 */
fun <T> reverse(lista: List<T>): List<Any> {
    val iteradorLista = lista.iterator()
    val stackLista = Pila<T>()
    val listaReversa = mutableListOf<Any>()

    while (iteradorLista.hasNext()){
        stackLista.push(iteradorLista.next())
    }

    while (!stackLista.isEmpty()){
        listaReversa.add(stackLista.pop()!!)
    }
    return listaReversa
}