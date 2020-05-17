package ru.test.interviewtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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

        /**
         * Алгоритм, определяющий, все ли символы в строке встречаются только 1 раз
         *
         * @see Задача решается через HashSet
         */
        OneTimeSymbolWithoutSet.tests.forEach {
            val result = OneTimeSymbolWithoutSet.isUniqueChars(it)
            Log.i("InterviewTraining", "OneTimeSymbolWithoutSet str = $it, isUniqueChars = $result")
        }

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

        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(3n). Данные скалдываются в хэштаблицу. Результат должен быть четным, либо 1 элемент должен быть нечетным
         */
        Palindrom.tests.forEach {
            val result = Palindrom.isPalindrom(it.first)
            Log.i(
                "InterviewTraining",
                "Palindrom str1 = ${it.first}, res = ${it.second}, str2 = $result"
            )
        }

        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(2n). Данные складываются в единственный Int, где 0 - это четное количество встреч, 1 - нечетное.
         * если нечетных встреч больше 1, то не палиндром
         */
        Palindrom.tests.forEach {
            val result = Palindrom.isBinaryPalindrom(it.first)
            Log.i(
                "InterviewTraining",
                "BinaryPalindrom str1 = ${it.first}, res = ${it.second}, str2 = $result"
            )
        }

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

        /**
         * Имеется изображение, представленное матрицей NxN; каждый пиксел представлен 4 байтами. Напишите метод для поворота изображения на 90 градусов.
         * Удастся ли вам выполнить эту операцию «на месте»?
         */
        MatrixRotator.tests.forEach {
            MatrixRotator.rotateMatrix(it.first.size, it.first)
            Log.i("InterviewTraining", "MatrixRotator str = ${it.first}, res = ${it.second}")
        }

        /**
         * Напишите алгоритм, реализующий следующее условие: если элемент матрицы MxN равен О, то весь столбец и вся строка обнуляются.
         */
        MatrixNullify.tests.forEach {
            MatrixNullify.nullify(it.first.size, it.first[0].size, it.first)
            Log.i("InterviewTraining", "MatrixNullify str = ${it.first}, res = ${it.second}")
        }

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
    }
}
