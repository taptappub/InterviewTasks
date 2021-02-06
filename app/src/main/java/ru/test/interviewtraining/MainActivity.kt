package ru.test.interviewtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.test.interviewtraining.arrays_and_hashtables.*
import ru.test.interviewtraining.graphs.BinaryTree
import ru.test.interviewtraining.graphs.Graph
import ru.test.interviewtraining.graphs.WayFinder
import ru.test.interviewtraining.linkedlist.*
import ru.test.interviewtraining.linkedlist.PalyndromeList
import ru.test.interviewtraining.other.*
import ru.test.interviewtraining.stack.MyQueue
import ru.test.interviewtraining.stack.MyStack
import ru.test.interviewtraining.stack.SetOfStack
import ru.test.interviewtraining.stack.SortedStack

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
         * Напишите код для удаления дубликатов из несортированного связного списка.
         * Дополнителыю
         * Как вы будете решать задачу, если использовать временный буфер запрещено?
         */
        DeleteDuplicates.tests.forEach {
            val result = DeleteDuplicates.deleteDuplicates(it.first)
            Log.i(
                "InterviewTraining",
                "DeleteDuplicates str = ${it.first}, result = $result, control result = ${it.second}"
            )
        }

        /*Реализуйте алгоритм для нахождения в односвязном списке k-го элемента с конца.*/
        IndexItemFromEnd.tests.forEach {
            val result = IndexItemFromEnd.find(it.first, it.second)
            Log.i(
                "InterviewTraining",
                "IndexItemFromEnd str = ${it.first}, number = ${it.second}, result = $result, control result = ${it.third}"
            )
        }

        /**
         * Реализуйте алгоритм, удаляющий узел из середины односвязного списка (то
         * есть узла, не являющегося ни начальным, ни конечным - не обязательно находящегося точно в середине). Доступ предоставляется только к этому узлу.
         * Пример:
         * Ввод: узел с из списка a - >b - > c - >d - >e - >f
         * Вывод: ничего не возвращается, но новый список имеет вид: a - >b - >d - >e- >f
         */
        RemoveNodeFromMiddle.tests.forEach {
            val result = RemoveNodeFromMiddle.remove(it.first, 3)
            Log.i(
                "InterviewTraining",
                "RemoveNodeFromMiddle str = ${it.first}, number = ${it.second}, result = $result, control result = ${it.third}"
            )
        }

        /**
         * Напишите код для разбиения связного списка вокруг значения х, так чтобы
         * все узлы, меньшие х, предшествовали узлам, большим или равным х. Если х
         * содержится в списке, то значения х должны следовать строго после элементов, меньших х (см. далее). Элемент разбивки х может находиться где угодно
         * в �правой части»; он не обязан располагаться между левой и правой частью.
         * Пример:
         * Ввод: 3 - > 5 - >8 - > 5 - >10 - > 2 - >1 [значение разбивки = 5]
         * Вывод: 3 - >1- >2- >10- >5- >5- >8
         */
        SplitNodesByData.tests.forEach {
            val result = SplitNodesByData.partition(it.first, it.second)
            Log.i(
                "InterviewTraining",
                "SplitNodesByData str = ${it.first}, number = ${it.second}, result = $result, control result = ${it.third}"
            )
        }

        /**
         * Напишите код для удаления дубликатов из несортированного связного списка.
         * Дополнителыю
         * Как вы будете решать задачу, если использовать временный буфер запрещено?
         */
        Sum.tests.forEach {
            val result = Sum.sum(it.first, it.second)
            Log.i(
                "InterviewTraining",
                "Sum str1 = ${it.first}, str2 = ${it.second}, result = $result, control result = ${it.third}"
            )
        }

        /**
         * Для кольцевого связного списка реализуйте алгоритм, возвращающий начальный узел петли.
         * Определение
         * Кольцевой связный список - это связный список, в котором указатель следующего узла ссылается на более ранний узел, образуя петлю.
         * Пример:
         * Ввод: A- >B- >C- >D- > E - >C (предыдущий узел с)
         * Вывод: C
         * Подсказки: 50, 69, 83, 90
         */
        FindCircle.tests.forEach {
            val result = FindCircle.findBeginning(it.first)
            Log.i(
                "InterviewTraining",
                "FindCircle str = ${it.first}, result = $result, control result = ${it.second}"
            )
        }

        /**
         * Как реализовать стек, в котором кроме стандартных функций push и рор будет
         * поддерживаться функция min, возвращающая минимальный элемент? Все
         * операции - push, рор и min - должны выполняться за время 0( 1 ).
         */
        val stack = MyStack()
        stack.apply {
            push(3)
            push(1)
            push(2)
            push(3)
            push(4)
            push(0)
            push(9)
            push(2)
            push(4)
        }
        var min = stack.min()
        stack.apply {
            pop()
            pop()
            pop()
            pop()
            pop()
        }
        min = stack.min()

        /*Как известно, слишком высокая стопка тарелок может развалиться. Следовательно, в реальной жизни, когда высота стопки превысила бы некоторое
        пороговое значение, мы начали бы складывать тарелки в новую стопку. Реализуйте структуру данных SetOfStacks, имитирующую реальную ситуацию.
        Структура SetOfStack должна состоять из нескольких стеков, новый стек
        создается, как только предыдущий достигнет порогового значения. Методы
        SetOfStacks . push ( ) и SetOfStacks . рор ( ) должны вести себя так же, как при
        работе с одним стеком (то есть метод рор( ) должен возвращать те же значения, которые бы он возвращал при использовании одного большого стека).
        Дополнительно
        Реализуйте функцию popAt ( int index ) , которая осуществляет операцию рор
        с заданным внутренним стеком*/
        val mySetOfStack = SetOfStack(3)
        mySetOfStack.apply {
            push(1)
            push(2)
            push(3)
            push(4)
            push(5)
            push(6)
            push(7)
            push(8)
            push(9)
        }
        val qwe1 = mySetOfStack.pop()
        val qwe2 = mySetOfStack.popAt(0)

        /* Напишите класс MyQueue, который реализует очередь с использованием двух стеков */
        val myQueue = MyQueue<Int>()
        myQueue.apply {
            push(1)
            push(2)
            push(3)
            push(4)
            push(5)
            push(6)
            push(7)
            push(8)
            push(9)
        }
        val asa1 = myQueue.pop()

        /*
         * Напишите программу сортировки стека, в результате которой наименьший
         * элемент оказывается на вершине стека. Вы можете использовать дополнительный временный стек, но элементы не должны копироваться в другие
         * структуры данных (например, в массив). Стек должен поддерживать следующие операции: push, рор, peek, isEmpty.
         */
        val sortedStack = SortedStack()
        sortedStack.apply {
            push(2)
            push(8)
            push(3)
            push(4)
            push(6)
            push(1)
            push(7)
            push(5)
            push(9)
        }
        val sortedStackPop = sortedStack.pop()


        ////////////////////////////////////////// ГРАФЫ //////////////////////////////////////////////////

        /*
         * Для заданного направленного графа разработайте алгоритм, проверяющий
         * существование маршрута между двумя узлами.
         */
        val graph = Graph.init()
        val res1 = WayFinder.hasWay(Graph.node1, Graph.node6)
        val res2 = WayFinder.hasWay(Graph.node2, Graph.node3)

        /**
         * Напишите алгоритм создания бинарного дерева поиска с минимальной
         * высотой для отсортированного (по возрастанию) массива с уникальными
         * целочисленными элементами
         */
        val res = BinaryTree.createTree(listOf(1,2,3,4,5,6,7,8,9))

        ////////////////////////////////////////// ДРУГОЕ //////////////////////////////////////////////////
        /*
         * Почитать пары чисел в массиве
         */
        DuplicatesCounter.tests.forEach {
            val res = DuplicatesCounter.findPairsCount(it.first.size, it.first.toTypedArray())
            Log.i(
                "InterviewTraining",
                "DuplicatesCounter res = $res, needed = ${it.second}"
            )
        }

        /*
         * Посчитать прыжки через облака, которые
         */
        FindTheShortestWay.tests.forEach {
            val res = FindTheShortestWay.jumpingOnClouds(it.first.toTypedArray())
            Log.i(
                "InterviewTraining",
                "FindTheShortestWay res = $res, needed = ${it.second}"
            )
        }

        /**
         * There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.
         * Example
         * The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.
         */
        RepeatedStrings.tests.forEach {
            val res = RepeatedStrings.repeatedString(it.first, it.second)
            Log.i(
                "InterviewTraining",
                "RepeatedStrings res = $res, needed = ${it.third}"
            )
        }

        /*
         * Complete the 'countingValleys' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER steps
         *  2. STRING path
         */
        ValleysCounter.tests.forEach {
            val res = ValleysCounter.countingValleys(it.first.length, it.first)
            Log.i(
                "InterviewTraining",
                "ValleysCounter res = $res, needed = ${it.second}"
            )
        }

        QueueBribes.tests.forEach {
            val res = QueueBribes.myMinimumBribes(it.first)
            Log.i(
                "InterviewTraining",
                "QueueBribes res = $res, needed = ${it.second}"
            )
        }

        MinimumSwaps.tests.forEach {
            val res = MinimumSwaps.minimumSwaps(it.first)
            Log.i(
                "InterviewTraining",
                "MinimumSwaps res = $res, needed = ${it.second}"
            )
        }

        ArrayManipulation.tests.forEach {
            val res = ArrayManipulation.arrayManipulation(it.first, it.second)
            Log.i(
                "InterviewTraining",
                "ArrayManipulation res = $res, needed = ${it.third}"
            )
        }
    }
}
