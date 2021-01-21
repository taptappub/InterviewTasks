package ru.test.interviewtraining.linkedlist

/**
 * Напишите код для удаления дубликатов из несортированного связного списка.
 * Дополнителыю
 * Как вы будете решать задачу, если использовать временный буфер запрещено?
 */
object DeleteDuplicates {
    val tests = listOf(
        Pair(
            Node("a", Node("a", null)),
            Node("a", null)
        ),
        Pair(
            Node("a", Node("b", null)),
            Node("a", Node("b", null))
        ),
        Pair(
            Node("a", Node("b", Node("c", null))),
            Node("a", Node("b", Node("c", null)))
        ),
        Pair(
            Node("a", Node("b", Node("b", null))),
            Node("a", Node("b", null))
        )
    )

    //O(n)
    fun deleteDuplicates(firstNode: Node?): Node? {
        val set = mutableSetOf<String>()
        var tempNode = firstNode
        if (firstNode == null) {
            return null
        }
        val result = Node(firstNode.data, null)
        var resultTempNode: Node? = result
        var toggle = false

        while (tempNode != null) {
            if (set.add(tempNode.data) && toggle) {
                resultTempNode?.next = Node(tempNode.data, null)
                resultTempNode = resultTempNode?.next
            }
            toggle = true
            tempNode = tempNode.next
        }
        return result
    }
}