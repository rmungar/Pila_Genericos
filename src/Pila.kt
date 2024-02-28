class Pila <T>{
    private val items = mutableListOf<T>()

    fun top(){
        return items[(items.size - 1)]
    }
    fun push(item: T){
        items.add(item)
    }
    fun pop(): T?{
        return if (items.isEmpty()) null
        else items.removeAt(items.size - 1)
    }
    fun isEmpty(): Boolean{
        return items.isEmpty()
    }
}

fun <T> reverse(lista: List<String>):List<String>{
    val iterador = lista.iterator()
    val listaReversa = mutableListOf<String>()
    while (iterador.hasNext()){
        listaReversa.add(iterador.next())
    }
    return listaReversa.toList()
}