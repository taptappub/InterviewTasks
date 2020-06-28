package ru.test.interviewtraining.graphs

// Напишите алгоритм создания бинарного дерева поиска с минимальной
// высотой для отсортированного (по возрастанию) массива с уникальными
// целочисленными элементами
object BinaryTree {

    fun createTree(list: List<Int>): BinTreeNode? {
        val index = findMiddleItem(list)
        if (index == -1) return null

        val node = BinTreeNode(list[index])

        node.left = createTree(list.subList(0, index))
        node.right = if (index + 1 > list.size) {
            null
        } else {
            createTree(list.subList(index + 1, list.size))
        }
        return node
    }

    private fun findMiddleItem(list: List<Int>): Int {
        if (list.isEmpty()) return -1
        return list.size / 2
    }
}