package ru.test.interviewtraining.arrays_and_hashtables

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class ShiftStringCheckerTest {

    /**
     * Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого.
     * Для двух строк sl и s2 напишите код, который проверяет, получена ли строка s2 циклическим сдвигом s1,
     * используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat).
     */

    private val tests = listOf(
        Triple("mama", "amam", true),
        Triple("mama", "maam", false),
        Triple("waterbottle", "erbottlewat", true),
        Triple("ab", "a", false)
    )

    @Test
    fun checkIfSubstring() {
        /**
         * Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого.
         * Для двух строк sl и s2 напишите код, который проверяет, получена ли строка s2 циклическим сдвигом s1,
         * используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat).
         */
        tests.forEach {
            val result = ShiftStringChecker.checkIfSubstring(it.first, it.second)
            assertEquals(
                "ShiftStringChecker str = ${it.first}, str2 = ${it.second}",
                result,
                it.third
            )
        }
    }
}