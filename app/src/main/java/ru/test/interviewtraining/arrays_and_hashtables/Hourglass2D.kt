package ru.test.interviewtraining.arrays_and_hashtables

import kotlin.math.max

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
object Hourglass2D {
    val tests = listOf(
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

    fun hourglassSum(arr: Array<Array<Int>>): Int {
        var max = -1000
        for (i in 0..arr.size - 3) { // -2 for pattern width
            for (j in 0..arr[i].size - 3) { // -2 for pattern height
                val res = max(calcHourglass(i, j, arr), max)
                max = max(res, max)
            }
        }
        return max
    }

    private fun calcHourglass(i: Int, j: Int, arr: Array<Array<Int>>): Int {
        var sum = 0
        for (x in i..i + 2) {
            for (y in j..j + 2) {
                if (y == j + 1) {
                    if (x == i + 1) {
                        sum += arr[y][x]
                    }
                } else {
                    sum += arr[y][x]
                }
            }
        }
        return sum
    }
}
