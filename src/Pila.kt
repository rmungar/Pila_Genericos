
class Pila <T>(){
    private val contenido = mutableListOf<T>()

    fun top(): T {
        return contenido[contenido.size-1]
    }

    fun push(item: T){
        contenido.add(item)
    }
    fun pop(): T?{
        return if (contenido.isEmpty()) null
        else contenido.removeAt(contenido.size - 1)
    }
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