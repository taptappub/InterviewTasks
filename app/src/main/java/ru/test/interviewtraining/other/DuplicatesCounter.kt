package ru.test.interviewtraining.other

import ru.test.interviewtraining.linkedlist.Node

/**
 * Посчитайте количество пар
 */
object DuplicatesCounter {
    val tests = listOf(
        Pair(listOf(1, 1, 2), 1),
        Pair(listOf(1), 0),
        Pair(listOf(1, 1, 1, 2, 2), 2),
        Pair(listOf(1, 2, 3, 4, 5), 0)
    )

    fun findPairsCount(n: Int, ar: Array<Int>): Int {
        var counter = 0
        if (n == 1) {
            return counter
        }

        val pares = HashMap<Int, Boolean>(n)
        ar.forEachIndexed { i, value ->
            val hasPair = pares[value] ?: false
            if (!hasPair) {
                pares[value] = true
            } else {
                pares[value] = false
                counter++
            }
        }
        return counter
    }
}
