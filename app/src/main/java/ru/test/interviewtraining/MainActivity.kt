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
            Log.i("InterviewTtaining", "OneTimeSymbol str = $it, isNotUniqueChars = $result")
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
    }
}
