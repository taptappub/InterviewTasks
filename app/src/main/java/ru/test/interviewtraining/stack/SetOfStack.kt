package ru.test.interviewtraining.stack

/*Как известно, слишком высокая стопка тарелок может развалиться. Следовательно, в реальной жизни, когда высота стопки превысила бы некоторое
пороговое значение, мы начали бы складывать тарелки в новую стопку. Реализуйте структуру данных SetOfStacks, имитирующую реальную ситуацию.
Структура SetOfStack должна состоять из нескольких стеков, новый стек
создается, как только предыдущий достигнет порогового значения. Методы
SetOfStacks . push ( ) и SetOfStacks . рор ( ) должны вести себя так же, как при
работе с одним стеком (то есть метод рор( ) должен возвращать те же значения, которые бы он возвращал при использовании одного большого стека).
Дополнительно
Реализуйте функцию popAt ( int index ) , которая осуществляет операцию рор
с заданным внутренним стеком*/

class SetOfStack(val treshold: Int) {

    private val list: MutableList<MutableList<Int>> = mutableListOf(mutableListOf())
    private var currentIndex = 0

    fun push(value: Int) {
        if (list[currentIndex].size >= treshold) {
            currentIndex++
            list.add(mutableListOf())
        }
        list[currentIndex].add(value)
    }

    fun pop(): Int {
        while (currentIndex >= 0 && list[currentIndex].size == 0) {
            currentIndex--
        }
        return popAt(currentIndex).also {
            if (currentIndex > 0) {
                currentIndex--
            }
        }
    }

    private fun removeAt(index: Int, stackSize: Int) {
        list[index].removeAt(stackSize - 1)
        if (stackSize == 1) {
            list.removeAt(index)
        }
    }

    fun popAt(index: Int): Int {
        if (index < 0) {
            throw IllegalStateException("Лох")
        }
        val size = list[index].size
        val result = list[index][size - 1]
        removeAt(index, size)
        return result
    }
}