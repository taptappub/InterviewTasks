package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Test

import org.junit.Assert.*

class ArraysLeftRotationTest {

    private val tests = listOf(
        Triple(arrayOf(1, 2, 3, 4, 5), 4, arrayOf(5, 1, 2, 3, 4)),
        Triple(arrayOf(1, 2, 3, 4, 5), 6, arrayOf(2, 3, 4, 5, 1)),
        Triple(arrayOf(1, 2, 3, 4, 5), 5, arrayOf(1, 2, 3, 4, 5))
    )

    @Test
    fun rotLeft() {
        tests.forEach {
            val result = ArraysLeftRotation.rotLeft(it.first, it.second)
            assertEquals("ArraysLeftRotation str = ${it.first}, d = ${it.second}", it.third, result)
        }
    }
}