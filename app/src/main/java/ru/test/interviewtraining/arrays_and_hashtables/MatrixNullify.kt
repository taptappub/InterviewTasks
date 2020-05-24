package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Имеется изображение, представленное матрицей NxN; каждый пиксел представлен 4 байтами. Напишите метод для поворота изображения на 90 градусов.
 * Удастся ли вам выполнить эту операцию «на месте»?
 */
object MatrixNullify {
    val tests = listOf(
        Pair(
            mutableListOf(
                mutableListOf(1, 2, 3, 4),
                mutableListOf(5, 0, 7, 8),
                mutableListOf(9, 10, 11, 12),
                mutableListOf(13, 14, 15, 16)
            ),
            mutableListOf(
                mutableListOf(1, 0, 3, 4),
                mutableListOf(0, 0, 0, 0),
                mutableListOf(9, 0, 11, 12),
                mutableListOf(13, 0, 15, 16)
            )
        )
    )


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