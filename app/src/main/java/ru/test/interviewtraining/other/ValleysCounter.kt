package ru.test.interviewtraining.other

import ru.test.interviewtraining.linkedlist.Node

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */
object ValleysCounter {
    val tests = listOf(
        Pair("UDDDUDUU", 1),
        Pair("UD", 0),
        Pair("DU", 1),
        Pair("UUDD", 0)
    )

    // O(n)
    fun countingValleys(steps: Int, path: String): Int {
        // Write your code here
        var highCounter = 0
        var result = 0
        path.forEach {
            if (it == 'U') {
                highCounter++
                if (highCounter == 0) {
                    result++
                }
            } else {
                highCounter--
            }
        }
        return result
    }
}
