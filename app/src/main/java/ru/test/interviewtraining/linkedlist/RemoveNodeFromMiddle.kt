package ru.test.interviewtraining.linkedlist

/**
 * Реализуйте алгоритм, удаляющий узел из середины односвязного списка (то
 * есть узла, не являющегося ни начальным, ни конечным - не обязательно находящегося точно в середине). Доступ предоставляется только к этому узлу.
 * Пример:
 * Ввод: узел с из списка a - >b - > c - >d - >e - >f
 * Вывод: ничего не возвращается, но новый список имеет вид: a - >b - >d - >e- >f
 */
object RemoveNodeFromMiddle {
    val tests = listOf(
        Triple(
            Node("a", Node("b", Node("c", Node("d", Node("e", Node("f", null)))))),
            3,
            Node("a", Node("b", Node("d", Node("e", Node("f", null)))))
        )
    )

    fun remove(list: Node?, nodeNumber: Int): Boolean {
        var node: Node? = list
        for (x in 1 until nodeNumber) {
            node = node?.next
        }
        if (node?.next == null) {
            return false
        }
        val nxt = node.next
        node.data = nxt!!.data
        node.next = nxt.next
        return true
    }
}