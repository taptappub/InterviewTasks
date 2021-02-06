package ru.test.interviewtraining.linkedlist

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class PalyndromeListTest {

    /**
     * Реализуйте функцию, проверяющую, является ли связный список палиндромом
     * abba -> true
     * aba -> true
     * abc -> false
     * Подсказки: 5, 13, 29, 6 1 , 1 0 1
     */
    private val tests = listOf(
        Pair(
            NodeInt(1, NodeInt(2, null)),
            false
        ),
        Pair(
            NodeInt(1, NodeInt(2, NodeInt(3, NodeInt(2, NodeInt(1, null))))),
            true
        )
    )

    @Test
    fun isPalyndrome() {
        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(3n). Данные скалдываются в хэштаблицу. Результат должен быть четным, либо 1 элемент должен быть нечетным
         */
        tests.forEach {
            val result = PalyndromeList.isPalyndrome(it.first)
            assertEquals("Palindrom str1 = ${it.first}", it.second, result)
        }
    }
}