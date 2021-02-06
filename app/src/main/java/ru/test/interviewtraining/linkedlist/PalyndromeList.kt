package ru.test.interviewtraining.linkedlist

/**
 * Реализуйте функцию, проверяющую, является ли связный список палиндромом
 * abba -> true
 * aba -> true
 * abc -> false
 * Подсказки: 5, 13, 29, 6 1 , 1 0 1
 */
object PalyndromeList {

    // O(n), где n > m
    fun isPalyndrome(node: NodeInt): Boolean {
        val string1 = StringBuilder()
        val string2 = StringBuilder()
        var tempNode: NodeInt? = node
        while (tempNode != null) {
            string1.append(tempNode.data)
            string2.insert(0, tempNode.data)
            tempNode = tempNode.next
        }
        return string1.toString() == string2.toString()
    }
}