package ru.test.interviewtraining.stack

import java.util.*

/* Напишите класс MyQueue, который реализует очередь с использованием двух стеков */
class MyQueue<T> {
    private val firstStack = Stack<T>()
    private val secondStack = Stack<T>()

    fun push(data: T) {
        firstStack.push(data)
    }

    fun pop(): T {
        while (firstStack.size != 0) {
            secondStack.push(firstStack.pop())
        }
        val result = secondStack.pop()
        firstStack.clear()
        while (secondStack.size != 0) {
            firstStack.push(secondStack.pop())
        }
        return result
    }
}