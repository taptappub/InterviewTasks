package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Assert.assertEquals
import org.junit.Test

class SpaceReplacerTest {

    /**
     * Напишите метод, заменяющий все пробелы в строке символами '%20 ' . Можете
     * считать, что длина строки позволяет сохранить дополнительные символы,
     * а фактическая длина строки известна заранее. (Примечание: при реализации
     * метода на java для выполнения операции •на месте• используйте символьный
     * массив.)
     * Пример:
     * Ввод: "Mr John Smith " , 13
     * Вывод: "Mr%20John%20Smith
     */

    private val tests = listOf(
        Pair("aaa ab", 6) to "aaa%20ab",
        Pair("aaa ab    ", 6) to "aaa%20ab",
        Pair(" ", 0) to ""
    )

    @Test
    fun replace() {
        /**
         * Заменить пробел на %20
         *
         * 1) Можно использовать StringBuilder() - O(n)
         */
        tests.forEach {
            val result = SpaceReplacer.replace(it.first.first, it.first.second)
            assertEquals("SpaceReplacer str1 = ${it.first}", it.second, result)
        }
    }
}