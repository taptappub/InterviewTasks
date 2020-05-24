package ru.test.interviewtraining.linkedlist

/**Напишите код для разбиения связного списка вокруг значения х, так чтобы
 * все узлы, меньшие х, предшествовали узлам, большим или равным х. Если х
 * содержится в списке, то значения х должны следовать строго после элементов, меньших х (см. далее). Элемент разбивки х может находиться где угодно
 * в �правой части»; он не обязан располагаться между левой и правой частью.
 * Пример:
 * Ввод: 3 - > 5 - >8 - > 5 - >10 - > 2 - >1 [значение разбивки = 5]
 * Вывод: 3 - >1- >2- >10- >5- >5- >8
 * */
object SplitNodesByData {
    val tests = listOf(
        Triple(
            NodeInt(6, NodeInt(4, NodeInt(1, NodeInt(3, NodeInt(4, NodeInt(2, null)))))),
            4,
            NodeInt(1, NodeInt(2, NodeInt(3, NodeInt(4, NodeInt(4, NodeInt(6, null))))))
        )
    )

    fun partition(node: NodeInt?, x: Int): NodeInt? {
        var currentNode: NodeInt? = node
        var beforeStart: NodeInt? = null
        var beforeEnd: NodeInt? = null
        var afterStart: NodeInt? = null
        var afterEnd: NodeInt? = null

        /* Разбиваем список */
        while (currentNode != null) {
            val next = currentNode.next
            currentNode.next = null
            if (currentNode.data < x) {
                /* Вставляем узел в конец списка before*/
                if (beforeStart == null) {
                    beforeStart = currentNode
                    beforeEnd = beforeStart
                } else {
                    beforeEnd?.next = currentNode
                    beforeEnd = currentNode
                }
            } else {
                /* Вставляем узел в конец списка after */
                if (afterStart == null) {
                    afterStart = currentNode
                    afterEnd = afterStart
                } else {
                    afterEnd?.next = currentNode
                    afterEnd = currentNode
                }
            }
            currentNode = next
        }

        if (beforeStart == null) {
            return afterStart
        }

/* Слияние списков before и after */
        beforeEnd?.next = afterStart
        return beforeStart
    }
}