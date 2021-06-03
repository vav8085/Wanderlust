package algorithms.code.linkedlists

data class Node<T>(var data: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null){
            "$data -> ${next.toString()}"
        }else{
            "$data"
        }
    }
}