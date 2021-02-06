package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Assert.assertEquals
import org.junit.Test

class CheckModificationsTest {

    private val tests = listOf(
        Pair(Pair("pale", "ple"), true),
        Pair(Pair("pales", "pale"), true),
        Pair(Pair("pale", "bale"), true),
        Pair(Pair("pale", "bake"), false),
        Pair(Pair("pale", "paleee"), false)
    )

    /**
     * Существуют три вида модифицирующих операций со строками: вставка
     * символа, удаление символа и замена символа. Напишите функцию, которая
     * проверяет, находятся ли две строки на расстоянии одной модификации (или
     * нуля модификаций).
     * Пример:
     * pale, ple -> true
     * pales, pale -> true
     * pale, bale -> true
     * pale, bake -> false
     */
    @Test
    fun hasDuplicateSymbols() {
        tests.forEach {
            val result = CheckModifications.checkModifications(it.first.first, it.first.second)
            assertEquals("CheckModifications str = ${it.first}", it.second, result)
        }
    }
}