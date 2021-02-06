package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Assert.assertEquals
import org.junit.Test

class PalyndromeArrayTest {

    /**
     * Напишите функцию, которая проверяет, является ли заданная строка перестановкой палиндрома. (Палиндром - слово или фраза, одинаково читающиеся
     * в прямом и обратном направлении; перестановка - строка, содержащая те
     * же символы в другом порядке.) Палиндром не ограничивается словами из
     * словаря.
     * Пример:
     * Ввод: Tact Соа
     * Вывод: True ( перестановки : "taco cat " , "atco cta " , и т . д . )
     * Подсказки: 1 06, 1 2 1 , 1 34, 1 36
     */

    private val tests = listOf(
        "Tact Coa" to true,
        "" to true,
        "ababab bababa" to true,
        "ababab" to false,
        "abcba" to true
    )

    @Test
    fun isPalindrom() {
        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(2n). Данные складываются в единственный Int, где 0 - это четное количество встреч, 1 - нечетное.
         * если нечетных встреч больше 1, то не палиндром
         */
        tests.forEach {
            val result = PalyndromeArray.isPalindrom(it.first)
            assertEquals("Palindrom str1 = ${it.first}", it.second, result)
        }
    }

    @Test
    fun isBinaryPalindrom() {
        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(2n). Данные складываются в единственный Int, где 0 - это четное количество встреч, 1 - нечетное.
         * если нечетных встреч больше 1, то не палиндром
         */
        tests.forEach {
            val result = PalyndromeArray.isBinaryPalindrom(it.first)
            assertEquals("Palindrom str1 = ${it.first}", it.second, result)
        }
    }
}