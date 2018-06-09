package net.println.kotlin.chapter5.tailrecursive


data class ListNode(val value: Int, var next: ListNode? = null)

//尾递归
tailrec fun findListNode(head: ListNode?, value: Int): ListNode?{
    head?: return  null
    if(head.value == value) return head
    return findListNode(head.next, value)
}

fun main(args: Array<String>) {
    val MAX_NODE_COUNT = 10
    val head = ListNode(0)
    var p = head
    for(i in 1.. MAX_NODE_COUNT){
        p.next = ListNode(i)
        p = p.next!!
    }

    println(findListNode(head, MAX_NODE_COUNT - 2)?.value) //找到就打印值,没找到为null
}

//不是尾递归 有n*factorial
fun factorial(n: Long): Long{
    return n * factorial(n - 1)
}


data class TreeNode(val value: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null
}

// 不是尾递归
fun findTreeNode(root: TreeNode?, value: Int): TreeNode?{
    root?: return null
    if(root.value == value) return root
    return findTreeNode(root.left, value)?: return findTreeNode(root.right, value)
}