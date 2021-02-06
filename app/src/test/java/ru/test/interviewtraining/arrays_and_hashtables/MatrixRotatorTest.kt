package ru.test.interviewtraining.arrays_and_hashtables

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class MatrixRotatorTest {

    private val tests = listOf(
        Pair(
            mutableListOf(
                mutableListOf(1L, 2L, 3L, 4L),
                mutableListOf(5L, 6L, 7L, 8L),
                mutableListOf(9L, 10L, 11L, 12L),
                mutableListOf(13L, 14L, 15L, 16L)
            ),
            mutableListOf(
                mutableListOf(4L, 8L, 12L, 16L),
                mutableListOf(3L, 7L, 11L, 15L),
                mutableListOf(2L, 6L, 10L, 14L),
                mutableListOf(1L, 5L, 9L, 13L)
            )
        )
    )

    @Test
    fun rotateMatrix() {
        /**
         * Имеется изображение, представленное матрицей NxN; каждый пиксел представлен 4 байтами. Напишите метод для поворота изображения на 90 градусов.
         * Удастся ли вам выполнить эту операцию «на месте»?
         */
        tests.forEach {
            MatrixRotator.rotateMatrix(it.first.size, it.first)
            assertEquals("MatrixRotator", it.second, it.first)
        }
    }
}