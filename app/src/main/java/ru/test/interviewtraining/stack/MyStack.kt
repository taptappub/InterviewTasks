package ru.test.interviewtraining.stack

//1) Как реализовать стек, в котором кроме стандартных функций push и рор будет
//поддерживаться функция min, возвращающая минимальный элемент? Все
//операции - push, рор и min - должны выполняться за время 0( 1 ).
class MyStack {

    class Node(
        val min: Int,
        val value: Int
    )

    private val data = ArrayList<Node>()

    fun push(item: Int) {
        val node = when {
            data.isEmpty() -> Node(item, item)
            item < data[data.size - 1].min -> Node(item, item)
            else -> Node(data[data.size - 1].min, item)
        }

        data.add(node)
    }

    fun pop(): Int {
        val item = data[data.size - 1]
        data.removeAt(data.size - 1)
        return item.value
    }

    fun min(): Int? {
        return data[data.size - 1].min
    }

}