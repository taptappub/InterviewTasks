package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Test

import org.junit.Assert.*

/**
 * Вам предоставляется строка S. Найдите количество неупорядоченных анаграммных пар подстрок.
 */
class SherlockAndAnagramsTest {

    private val tests = listOf(
        Pair("abba", 4),
        Pair("abcd", 0),
        Pair("ifailuhkqq", 0),
        Pair("kkkk", 0)
    )

    @Test
    fun sherlockAndAnagrams() {
        tests.forEach {
            val result = SherlockAndAnagrams.sherlockAndAnagrams(it.first)
            assertEquals("SherlockAndAnagrams ${it.first}", it.second, result)
        }
    }
}