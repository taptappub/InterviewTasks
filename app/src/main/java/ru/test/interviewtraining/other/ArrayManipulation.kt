package ru.test.interviewtraining.other

/**
 * Starting with a 1-indexed array of zeros and a list of operations,
 * for each operation add a value to each the array element between two given indices, inclusive.
 * Once all operations have been performed, return the maximum value in the array.
 * Example
 * n = 10
 * queries = [[1, 5, 3], [4, 8, 7], [6, 9, 1]]
 */
object ArrayManipulation {
    val tests = listOf(
        Triple(10, arrayOf(arrayOf(1, 5, 3), arrayOf(4, 8, 7), arrayOf(6, 9, 1)), 10),
        Triple(10, arrayOf(arrayOf(1, 5, 3), arrayOf(4, 8, 7), arrayOf(5, 9, 1)), 11),
        Triple(10, arrayOf(arrayOf(1, 5, 3), arrayOf(4, 6, 7), arrayOf(8, 9, 100)), 100),
        Triple(5, arrayOf(arrayOf(1, 2, 100), arrayOf(2, 5, 100), arrayOf(3, 4, 100)), 200),
        Triple(
            10,
            arrayOf(arrayOf(2, 6, 8), arrayOf(3, 5, 7), arrayOf(1, 8, 1), arrayOf(5, 9, 15)),
            31
        )
    )

    private fun getMax(inputArray: LongArray): Long {
        var max = Long.MIN_VALUE
        var sum: Long = 0
        for (i in inputArray.indices) {
            sum += inputArray[i]
            max = Math.max(max, sum)
        }
        return max
    }

    fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
        val outputArray = LongArray(n + 1)
        for (i in queries.indices) {
            val a = queries[i][0] - 1
            val b = queries[i][1] - 1
            val k = queries[i][2]
            outputArray[a] += k.toLong()
            outputArray[b + 1] -= k.toLong()
        }
        return getMax(outputArray)
    }
}
