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

        /**
         * Алгоритм, определяющий, все ли символы в строке встречаются только 1 раз
         *
         * @see Задача решается через HashSet
         */
        OneTimeSymbol.tests.forEach {
            val result = OneTimeSymbol.hasDuplicateSymbols(it)
            Log.i("InterviewTraining", "OneTimeSymbol str = $it, isNotUniqueChars = $result")
        }
        Log.i("InterviewTraining", " ")

        /**
         * Алгоритм, определяющий, все ли символы в строке встречаются только 1 раз
         *
         * @see Задача решается через HashSet
         */
        OneTimeSymbolWithoutSet.tests.forEach {
            val result = OneTimeSymbolWithoutSet.isUniqueChars(it)
            Log.i("InterviewTraining", "OneTimeSymbolWithoutSet str = $it, isUniqueChars = $result")
        }
        Log.i("InterviewTraining", " ")

        /**
         * Является ли одна строка перестановкой символов второй строки?
         *
         * Вычисляется hash от символа
         */
        StringsTransposition.tests.forEach {
            val result = StringsTransposition.compare(it.first, it.second)
            Log.i(
                "InterviewTraining",
                "StringsTransposition str1 = ${it.first}, str2 = ${it.second}, equals = $result"
            )
        }
        Log.i("InterviewTraining", " ")

        /**
         * Заменить пробел на %20
         *
         * 1) Можно использовать StringBuilder() - O(n)
         */
        SpaceReplacer.tests.forEach {
            val result = SpaceReplacer.replace(it.first.first, it.first.second)
            Log.i(
                "InterviewTraining",
                "SpaceReplacer str1 = ${it.first}, res = ${it.second}, str2 = $result"
            )
        }
        Log.i("InterviewTraining", " ")

        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(3n). Данные скалдываются в хэштаблицу. Результат должен быть четным, либо 1 элемент должен быть нечетным
         */
        PalyndromeList.tests.forEach {
            val result = PalyndromeList.isPalyndrome(it.first)
            Log.i(
                "InterviewTraining",
                "Palindrom str1 = ${it.first}, res = ${it.second}, str2 = $result"
            )
        }
        Log.i("InterviewTraining", " ")

        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(2n). Данные складываются в единственный Int, где 0 - это четное количество встреч, 1 - нечетное.
         * если нечетных встреч больше 1, то не палиндром
         */
        PalyndromeArray.tests.forEach {
            val result = PalyndromeArray.isBinaryPalindrom(it.first)
            Log.i(
                "InterviewTraining",
                "BinaryPalindrom str1 = ${it.first}, res = ${it.second}, str2 = $result"
            )
        }
        Log.i("InterviewTraining", " ")

        /**
         * Существуют три вида модифицирующих операций со строками: вставка
         * символа, удаление символа и замена символа. Напишите функцию, которая
         * проверяет, находятся ли две строки на расстоянии одной модификации (или
         * нуля модификаций).
         * Пример:
         * pale, ple -> true
         * pales, pale -> true
         * pale, bale -> true
         * pale, bake -> false
         */
        CheckModifications.tests.forEach {
            val result = CheckModifications.checkModifications(it.first.first, it.first.second)
            Log.i(
                "InterviewTraining",
                "CheckModifications str = ${it.first}, res = ${it.second}, res2 = $result"
            )
        }
        Log.i("InterviewTraining", " ")

        /**
         * Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющихся символов.
         * Например, строка ааЬсссссааа превращается в а2b1с5а3. Если сжатая строка не становится короче исходной,
         * то метод возвращает исходную строку.
         * Предполагается, что строка состоит только из букв верхнего и нижнего регистра (a-z).
         */
        Compressor.tests.forEach {
            val result = Compressor.compress(it.first)
            Log.i(
                "InterviewTraining",
                "Compressor str = ${it.first}, res = ${it.second}, res2 = $result"
            )
        }
        Log.i("InterviewTraining", " ")

        /**
         * Имеется изображение, представленное матрицей NxN; каждый пиксел представлен 4 байтами. Напишите метод для поворота изображения на 90 градусов.
         * Удастся ли вам выполнить эту операцию «на месте»?
         */
        MatrixRotator.tests.forEach {
            MatrixRotator.rotateMatrix(it.first.size, it.first)
            Log.i("InterviewTraining", "MatrixRotator str = ${it.first}, res = ${it.second}")
        }
        Log.i("InterviewTraining", " ")

        /**
         * Напишите алгоритм, реализующий следующее условие: если элемент матрицы MxN равен О, то весь столбец и вся строка обнуляются.
         */
        MatrixNullify.tests.forEach {
            MatrixNullify.nullify(it.first.size, it.first[0].size, it.first)
            Log.i("InterviewTraining", "MatrixNullify str = ${it.first}, res = ${it.second}")
        }
        Log.i("InterviewTraining", " ")

        /**
         * Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого.
         * Для двух строк sl и s2 напишите код, который проверяет, получена ли строка s2 циклическим сдвигом s1,
         * используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat).
         */
        ShiftStringChecker.tests.forEach {
            val result = ShiftStringChecker.checkIfSubstring(it.first, it.second)
            Log.i(
                "InterviewTraining",
                "ShiftStringChecker str = ${it.first}, str2 = ${it.second}, result = $result, control result = ${it.third}"
            )
        }
        Log.i("InterviewTraining", " ")

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
         * Реализуйте функцию, проверяющую, является ли связный список палиндромом
         * abba -> true
         * aba -> true
         * abc -> false
         * Подсказки: 5, 13, 29, 6 1 , 1 0 1
         */
        PalyndromeList.tests.forEach {
            val result = PalyndromeList.isPalyndrome(it.first)
            Log.i(
                "InterviewTraining",
                "Palindrom str = ${it.first}, result = $result, control result = ${it.second}"
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

        Hourglass2D.tests.forEach {
            val res = Hourglass2D.hourglassSum(it.first)
            Log.i(
                "InterviewTraining",
                "Hourglass2D res = $res, needed = ${it.second}"
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
