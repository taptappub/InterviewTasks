package ru.test.interviewtraining.other

/**
 * You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n]
 * without any duplicates. You are allowed to swap any two elements.
 * You need to find the minimum number of swaps required to sort the array in ascending order.
 */
object MinimumSwaps {
    val tests = listOf(
        Pair(arrayOf(3, 1, 2, 4), 2),
        Pair(arrayOf(4, 1, 2, 3), 3),
        Pair(arrayOf(1, 2, 3, 5, 4, 6, 7, 8, 9), 1)
    )

    // Complete the minimumSwaps function below.
    fun minimumSwaps(arr: Array<Int>): Int {
        var swaps = 0
        var i: Int = 0
        while (i < arr.size) {
            if (arr[i] != i + 1) {
                swaps++
                arr.swap(i, arr[i] - 1)
            } else {
                i++
            }
        }
        return swaps
    }

    private fun <T> Array<T>.swap(i1: Int, i2: Int) {
        val temp = this[i1]
        this[i1] = this[i2]
        this[i2] = temp
    }
}
