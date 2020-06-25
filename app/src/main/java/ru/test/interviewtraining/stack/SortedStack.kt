package ru.test.interviewtraining.stack

import java.util.*

/*
 * Напишите программу сортировки стека, в результате которой наименьший
 * элемент оказывается на вершине стека. Вы можете использовать дополнительный временный стек, но элементы не должны копироваться в другие
 * структуры данных (например, в массив). Стек должен поддерживать следующие операции: push, рор, peek, isEmpty.
 */
class SortedStack() {
    val stack = Stack<Int>()
    val tempStack = Stack<Int>()

    fun push(item: Int) {
        while (!stack.isEmpty() && item > stack.peek()) {
            tempStack.push(stack.pop())
        }
        stack.push(item)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop())
        }
    }

    fun pop(): Int {
        return stack.pop()
    }

    fun peek(): Int {
        return stack.peek()
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }
}