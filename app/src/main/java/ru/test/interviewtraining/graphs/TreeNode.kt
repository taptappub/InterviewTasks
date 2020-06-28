package ru.test.interviewtraining.graphs

data class TreeNode (
    var data: String,
    val childs: MutableList<TreeNode>
)

data class BinTreeNode (
    var data: Int,
    var left: BinTreeNode? = null,
    var right: BinTreeNode? = null
)