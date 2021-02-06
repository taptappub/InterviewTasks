package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Assert.assertEquals
import org.junit.Test

class StringsTranspositionTest {

    /**
     * Является ли одна строка перестановкой символов второй строки?
     *
     * Вычисляется hash от символа
     */

    private val tests = listOf(
        Triple("aaaab", "abaaa", true),
        Triple("sllls", "sdlll", false),
        Triple("aasd", "a", false)
    )

    @Test
    fun compare() {
        tests.forEach {
            val result = StringsTransposition.compare(it.first, it.second)
            assertEquals("StringsTransposition str1 = ${it.first}", it.third, result)
        }
    }
}