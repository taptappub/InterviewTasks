package ru.test.interviewtraining.arrays_and_hashtables

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class MatrixNullifyTest {

    /**
     * Занулить матрицу по горизонтали и по вертикали по заданным координатам
     */

    private val tests = listOf(
        Pair(
            mutableListOf(
                mutableListOf(1, 2, 3, 4),
                mutableListOf(5, 0, 7, 8),
                mutableListOf(9, 10, 11, 12),
                mutableListOf(13, 14, 15, 16)
            ),
            mutableListOf(
                mutableListOf(1, 0, 3, 4),
                mutableListOf(0, 0, 0, 0),
                mutableListOf(9, 0, 11, 12),
                mutableListOf(13, 0, 15, 16)
            )
        )
    )

    @Test
    fun nullify() {
        /**
         * Напишите алгоритм, реализующий следующее условие: если элемент матрицы MxN равен О, то весь столбец и вся строка обнуляются.
         */
        tests.forEach {
            MatrixNullify.nullify(it.first.size, it.first[0].size, it.first)
            assertEquals("MatrixRotator", it.second, it.first)
        }
    }
}