package ru.test.interviewtraining.other

import ru.test.interviewtraining.linkedlist.Node

/**
 * There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.
 * Example
 * The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.
 */
object RepeatedStrings {
    val tests = listOf(
        Triple("abcac", 10L, 4L),
        Triple("aba", 10L, 7L),
        Triple("a", 1000000000000L, 1000000000000L)
    )

    // Complete the repeatedString function below.
    fun repeatedString(s: String, n: Long): Long {
        val aCount = calcA(s)
        if (aCount == 0) {
            return 0L
        }
        val mod = n % s.length
        val result = n / s.length * aCount
        return result + calcA(s.substring(0, mod.toInt()))
    }

    private fun calcA(s: String): Int = s.count { it == 'a' }
}
