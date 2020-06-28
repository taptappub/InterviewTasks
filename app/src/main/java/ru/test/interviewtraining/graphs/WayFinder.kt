package ru.test.interviewtraining.graphs

/*
 * Для заданного направленного графа разработайте алгоритм, проверяющий
 * существование маршрута между двумя узлами.
 */

object WayFinder {

    fun hasWay(node1: TreeNode, node2: TreeNode): Boolean {
        if (node1 == node2) {
            return true
        }

        return node1.childs.any { node ->
            hasWay(node, node2)
        }
    }
}