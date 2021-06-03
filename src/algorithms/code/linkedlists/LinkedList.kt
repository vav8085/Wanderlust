package algorithms.code.linkedlists

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun push(value: T): LinkedList<T> {
        head = Node(value, head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }

    fun append(value: T) {
        if (isEmpty()){
            push(value)
            return
        }
        tail?.next = Node<T>(value,null)
        tail = tail?.next
        size++
    }

    fun nodeAt(position: Int): Node<T>?{
        var currentIndex = 0
        var currentNode = head
        while(currentNode!=null && currentIndex < position){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>){
       if (tail==afterNode){
           append(value)
           return
       }
        val nodeToInsert = Node(value)
        nodeToInsert.next = afterNode.next
        afterNode.next = nodeToInsert
        size++
    }
    fun pop(): T?{
        val current = head
        if(!isEmpty()) {
            head = head?.next
            current?.next = null
            size--
        }
        if(isEmpty())
            tail = null
        return current?.data
    }
    fun removeLast(): T?{
        if(!isEmpty()) {
            var current = head
            var previous = current
            while (current?.next != null) {
                previous = current
                current = current.next
            }
            tail = previous
            tail?.next = null
            return current?.data
        }
        return null
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty List!"
        } else {
            head.toString()
        }
    }
}