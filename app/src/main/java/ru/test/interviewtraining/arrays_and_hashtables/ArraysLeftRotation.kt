package ru.test.interviewtraining.arrays_and_hashtables

import kotlin.math.max

/*
 * A left rotation operation on an array shifts each of the array's elements  unit to the left.
 * For example, if  left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].
 * Note that the lowest index item moves to the highest index in a rotation.
 * This is called a circular array.
 * Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
 */
object ArraysLeftRotation {

    /**
     * Triple(arrayOf(1, 2, 3, 4, 5), 4, arrayOf(5, 1, 2, 3, 4)),
     * Triple(arrayOf(1, 2, 3, 4, 5), 6, arrayOf(2, 3, 4, 5, 1)),
     * Triple(arrayOf(1, 2, 3, 4, 5), 5, arrayOf(1, 2, 3, 4, 5))
     */

    // Complete the rotLeft function below.
    fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
        val result = a.clone()
        val realShift = d % a.size
        if (realShift == 0) {
            return a
        }
        for (i in a.indices) {
            result[i] = a[(i + realShift) % a.size]
        }
        return result
    }
}
