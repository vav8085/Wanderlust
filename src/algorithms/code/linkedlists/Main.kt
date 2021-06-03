package algorithms.code.linkedlists

fun main(){
    val node1 = Node(1,null)
    val node2 = Node(2,null)
    val node3 = Node<Int>(3,null)
    node1.next = node2
    node2.next = node3
    println(node1)
    val linkedList = LinkedList<Int>()
    linkedList.push(1).push(4)
    linkedList.push(2)
    linkedList.push(5)
    println(linkedList.toString())
    linkedList.pop()
    println(linkedList.toString())
    linkedList.removeLast()
    println(linkedList.toString())

    val linkedList2 = LinkedList<Int>()
    linkedList2.append(1)
    linkedList2.append(2)
    linkedList2.append(3)
    linkedList2.nodeAt(0)?.let { linkedList2.insert(10, it) }
    println(linkedList2.nodeAt(1))
    println(linkedList2.toString())

}