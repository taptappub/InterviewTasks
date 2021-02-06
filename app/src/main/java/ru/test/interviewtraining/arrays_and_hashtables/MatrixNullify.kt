package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Занулить матрицу по горизонтали и по вертикали по заданным координатам
 */
object MatrixNullify {

    fun nullify(N: Int, M: Int, matrix: MutableList<MutableList<Int>>) {
        val xset = HashSet<Int>()
        val yset = HashSet<Int>()

        //O(n^2)
        for (x in 0 until N) {
            for (y in 0 until M) {
                if (matrix[x][y] == 0) {
                    xset.add(x)
                    yset.add(y)
                }
            }
        }

        for (i in 0 until xset.size) {
            for (y in 0 until M) {
                matrix[xset.elementAt(i)][y] = 0
            }
        }

        for (i in 0 until yset.size) {
            for (x in 0 until N) {
                matrix[x][yset.elementAt(i)] = 0
            }
        }
    }

}