package ru.test.interviewtraining

/**
 * Имеется изображение, представленное матрицей NxN; каждый пиксел представлен 4 байтами. Напишите метод для поворота изображения на 90 градусов.
 * Удастся ли вам выполнить эту операцию «на месте»?
 */
object MatrixRotator {
    val tests = listOf(
        Pair(
            mutableListOf(
                mutableListOf(1L, 2L, 3L, 4L),
                mutableListOf(5L, 6L, 7L, 8L),
                mutableListOf(9L, 10L, 11L, 12L),
                mutableListOf(13L, 14L, 15L, 16L)
            ),
            mutableListOf(
                mutableListOf(4L, 8L, 12L, 16L),
                mutableListOf(3L, 7L, 11L, 15L),
                mutableListOf(2L, 6L, 10L, 14L),
                mutableListOf(1L, 5L, 9L, 13L)
            )
        )
    )

    // Задача сводится к тому, что надо менять местами 4 числа.
    // "На месте" - это значит применив
    //void xorSwap(int x, int y) {
    // x = x^y
    // y = y^x
    // x = x^y
    //}
    fun rotateMatrix(N: Int, mat: MutableList<MutableList<Long>>) {
        // Consider all squares one by one
        for (x in 0 until N / 2) {
            // Consider elements in group of 4 in
            // current square
            for (y in x until N - x - 1) {
                // store current cell in temp variable
                val temp = mat[x][y]

                // move values from right to top
                mat[x][y] = mat[y][N - 1 - x]

                // move values from bottom to right
                mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y]

                // move values from left to bottom
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x]

                // assign temp to left
                mat[N - 1 - y][x] = temp
            }
        }
    }

}