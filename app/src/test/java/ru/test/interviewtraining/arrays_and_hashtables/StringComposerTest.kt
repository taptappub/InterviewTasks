package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Test

import org.junit.Assert.*

/**
 * Вам даны две строки A и B.
 * Определите, существует ли непустая строка, которая встречается как подстрока и в A, и в B.
 */
class StringComposerTest {

    private val tests = listOf(
        Triple("hello", "world", "YES"),
        Triple("hi", "world", "NO")
    )

    @Test
    fun twoStrings() {
        tests.forEach {
            val result = StringComposer.twoStrings(it.first, it.second)
            assertEquals("StringComposer str1 = ${it.first}, str2 = ${it.second}", it.third, result)
        }
    }
}