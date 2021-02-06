package ru.test.interviewtraining.other

import ru.test.interviewtraining.linkedlist.Node

/**
 * Посчитайте количество пар
 */
object FindTheShortestWay {
    val tests = listOf(
        Pair(listOf(0, 0, 1, 0, 0, 1, 0), 4),
        Pair(listOf(0, 0, 0, 0, 0, 0), 3),
        Pair(listOf(0, 0), 1)
    )

    fun jumpingOnClouds(c: Array<Int>): Int {
        var i = 0
        var count = -1
        while (i < c.size) {
            if (i + 2 < c.size && c[i + 2] == 0) {
                i += 2
            } else {
                i++
            }
            count++
        }
        return count
    }
}
