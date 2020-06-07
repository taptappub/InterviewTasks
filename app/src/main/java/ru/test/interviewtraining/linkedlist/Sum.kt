package ru.test.interviewtraining.linkedlist

/**
 * Напишите код для удаления дубликатов из несортированного связного списка.
 * Дополнителыю
 * Как вы будете решать задачу, если использовать временный буфер запрещено?
 */
object Sum {
    val tests = listOf(
        Triple(
            NodeInt(1, NodeInt(2, null)),
            NodeInt(5, null),
            NodeInt(6, NodeInt(2, null))
        ),
        Triple(
            NodeInt(7, NodeInt(7, NodeInt(7, null))),
            NodeInt(7, NodeInt(7, NodeInt(7, null))),
            NodeInt(4, NodeInt(5, NodeInt(5, NodeInt(1, null))))
        )
    )

    // O(n), где n > m
    fun sum(number1: NodeInt, number2: NodeInt): NodeInt? {
        var number1Node: NodeInt? = number1
        var number2Node: NodeInt? = number2
        val result: NodeInt = NodeInt()
        var resultTemp: NodeInt? = result
        var digit = 0

        while (number1Node != null || number2Node != null) {
            val num1 = number1Node?.data ?: 0
            val num2 = number2Node?.data ?: 0

            val sum = num1 + num2 + digit
            resultTemp?.data = sum % 10
            digit = (sum / 10).toInt()

            number1Node = number1Node?.next
            number2Node = number2Node?.next

            if (number1Node != null || number2Node != null) {
                resultTemp?.next = NodeInt()
                resultTemp = resultTemp?.next
            } else if (digit != 0) {
                resultTemp?.next = NodeInt(digit, null)
            }
        }
        return result
    }
}