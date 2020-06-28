package ru.test.interviewtraining.graphs

object Graph {

    val node1 = TreeNode("1", mutableListOf())
    val node2 = TreeNode("2", mutableListOf())
    val node3 = TreeNode("3", mutableListOf())
    val node4 = TreeNode("4", mutableListOf())
    val node5 = TreeNode("5", mutableListOf())
    val node6 = TreeNode("6", mutableListOf())

    fun init(): TreeNode {
        node1.childs.add(node2)
        node1.childs.add(node3)

        node2.childs.add(node4)
        node3.childs.add(node5)

        node4.childs.add(node6)
        node5.childs.add(node6)
        return node1
    }

}