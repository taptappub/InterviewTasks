package ru.test.interviewtraining.arrays_and_hashtables

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class CompressorTest {

    //Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющихся символов.
    //Например, строка ааЬсссссааа превращается в а2b1с5а3. Если сжатая строка не становится короче исходной,
    //то метод возвращает исходную строку.
    //Предполагается, что строка состоит только из букв верхнего и нижнего регистра (a-z).

    private val tests = listOf(
        Pair("aaa", "a3"),
        Pair("aabbcc", "aabbcc"),
        Pair("aaaab", "a4b1"),
        Pair("a", "a")
    )

    @Test
    fun compress() {
        /**
         * Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющихся символов.
         * Например, строка ааЬсссссааа превращается в а2b1с5а3. Если сжатая строка не становится короче исходной,
         * то метод возвращает исходную строку.
         * Предполагается, что строка состоит только из букв верхнего и нижнего регистра (a-z).
         */
        tests.forEach {
            val result = Compressor.compress(it.first)
            assertEquals("Compressor str = ${it.first}", it.second, result)
        }
    }
}