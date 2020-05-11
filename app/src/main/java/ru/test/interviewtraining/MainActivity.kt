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
            Log.i("InterviewTtaining", "OneTimeSymbolWithoutSet str = $it, isUniqueChars = $result")
        }

        /**
         * Является ли одна строка перестановкой символов второй строки?
         *
         * Вычисляется hash от символа
         */
        StringsTransposition.tests.forEach {
            val result = StringsTransposition.compare(it.first, it.second)
            Log.i("InterviewTtaining", "StringsTransposition str1 = ${it.first}, str2 = ${it.second}, equals = $result")
        }

        /**
         * Заменить пробел на %20
         *
         * 1) Можно использовать StringBuilder() - O(n)
         */
        SpaceReplacer.tests.forEach {
            val result = SpaceReplacer.replace(it.first.first, it.first.second)
            Log.i("InterviewTtaining", "SpaceReplacer str1 = ${it.first}, res = ${it.second}, str2 = $result")
        }

        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(3n). Данные скалдываются в хэштаблицу. Результат должен быть четным, либо 1 элемент должен быть нечетным
         */
        Palindrom.tests.forEach {
            val result = Palindrom.isPalindrom(it.first)
            Log.i("InterviewTtaining", "Palindrom str1 = ${it.first}, res = ${it.second}, str2 = $result")
        }

        /**
         * является ли заданная строка перестановкой палиндрома
         *
         * O(2n). Данные складываются в единственный Int, где 0 - это четное количество встреч, 1 - нечетное.
         * если нечетных встреч больше 1, то не палиндром
         */
        Palindrom.tests.forEach {
            val result = Palindrom.isBinaryPalindrom(it.first)
            Log.i("InterviewTtaining", "BinaryPalindrom str1 = ${it.first}, res = ${it.second}, str2 = $result")
        }
    }
}
