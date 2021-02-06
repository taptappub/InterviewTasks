package ru.test.interviewtraining.other

/**
 * It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from  to . Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.
 * Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
 * Example
 * If person  bribes person , the queue will look like this: . Only  bribe is required. Print 1.
 * Person  had to bribe  people to get to the current position. Print Too chaotic.
 */
object QueueBribes {
    val tests = listOf(
        Pair(arrayOf(3, 1, 2, 4), "2"),
        Pair(arrayOf(4, 1, 2, 3), "Too chaotic"),
        Pair(arrayOf(1, 2, 3, 5, 4, 6, 7, 8, 9), "1"),
        Pair(arrayOf(3, 1, 2, 4, 6, 5, 9, 7, 8), "5"),
        Pair(arrayOf(5, 1, 2, 3, 7, 8, 6, 4), "Too chaotic"),
        Pair(arrayOf(1, 2, 5, 3, 7, 8, 6, 4), "7")
    )

    // Complete the minimumBribes function below.
    fun minimumBribes(q: Array<Int>) {
        println(myMinimumBribes(q))
    }

    fun myMinimumBribes(q: Array<Int>): String {
        /**
         * Из-за того, что максимум 2 перехода, надо сделать 3 счетчика,
         * и если текущее значение выезжает за эти 3 значения, то ошибка
         */
        var totalBribes = 0

        var expectedFirst = 1
        var expectedSecond = 2
        var expectedThird = 3

        for (i in 0..q.size - 1) {
            when (q[i]) {
                expectedFirst -> {
                    expectedFirst = expectedSecond
                    expectedSecond = expectedThird
                    expectedThird++
                }
                expectedSecond -> {
                    totalBribes++
                    expectedSecond = expectedThird
                    expectedThird++
                }
                expectedThird -> {
                    totalBribes+=2
                    expectedThird++
                }
                else -> return "Too chaotic"
            }
        }
        return totalBribes.toString()
    }
}
