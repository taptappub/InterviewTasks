package ru.test.interviewtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.test.interviewtraining.arrays_and_hashtables.*
import ru.test.interviewtraining.linkedlist.*
import ru.test.interviewtraining.linkedlist.PalyndromeList

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
    }
}
