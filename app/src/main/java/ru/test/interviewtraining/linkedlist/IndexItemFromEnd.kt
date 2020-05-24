package ru.test.interviewtraining.linkedlist

object IndexItemFromEnd {
    val tests = listOf(
        Triple(
            Node("a", Node("b", Node("c", Node("d", Node("e", Node("f", null)))))),
            3,
            Node("d", Node("e", Node("f", null)))
        ),
        Triple(
            Node("a", Node("b", null)),
            3,
            null
        )
    )

    fun find(firstNode: Node, number: Int): Node? {
        var tempNode: Node? = firstNode
        var resultNode: Node? = firstNode
        var count = 1
        while (tempNode?.next != null) {
            if (count >= number) {
                resultNode = resultNode?.next
            }
            count++
            tempNode = tempNode.next
        }
        return if (count < number) {
            return null
        } else {
            resultNode
        }
    }
}