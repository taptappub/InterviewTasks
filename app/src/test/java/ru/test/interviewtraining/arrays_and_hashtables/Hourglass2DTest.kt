package ru.test.interviewtraining.arrays_and_hashtables

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class Hourglass2DTest {

    /*
     * Given a  2D Array, :
     * 1 1 1 0 0 0
     * 0 1 0 0 0 0
     * 1 1 1 0 0 0
     * 0 0 0 0 0 0
     * 0 0 0 0 0 0
     * 0 0 0 0 0 0
     * An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:
     * a b c
     *   d
     * e f g
     *
     * There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .
     */

    private val tests = listOf(
        Pair(
            arrayOf(
                arrayOf(-9, -9, -9,  1,  1,  1),
                arrayOf( 0, -9,  0,  4,  3,  2),
                arrayOf(-9, -9, -9,  1,  2,  3),
                arrayOf( 0,  0,  8,  6,  6,  0),
                arrayOf( 0,  0,  0, -2,  0,  0),
                arrayOf( 0,  0,  1,  2,  4,  0)
            ), 28
        ),
        Pair(
            arrayOf(
                arrayOf(1, 1, 1, 0, 0, 0),
                arrayOf(0, 1, 0, 0, 0, 0),
                arrayOf(1, 1, 1, 0, 0, 0),
                arrayOf(0, 0, 2, 4, 4, 0),
                arrayOf(0, 0, 0, 2, 0, 0),
                arrayOf(0, 0, 1, 2, 4, 0)
            ), 19
        )
    )

    @Test
    fun hourglassSum() {
        tests.forEach {
            val res = Hourglass2D.hourglassSum(it.first)
            assertEquals(
                "Hourglass2D",
                res,
                it.second
            )
        }
    }
}