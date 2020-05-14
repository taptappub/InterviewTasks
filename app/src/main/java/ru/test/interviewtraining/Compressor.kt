package ru.test.interviewtraining


//Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющихся символов.
//Например, строка ааЬсссссааа превращается в а2b1с5а3. Если сжатая строка не становится короче исходной,
//то метод возвращает исходную строку.
//Предполагается, что строка состоит только из букв верхнего и нижнего регистра (a-z).
object Compressor {
    val tests = listOf(
        Pair("aaa", "a3"),
        Pair("aabbcc", "aabbcc"),
        Pair("aaaab", "a4b1"),
        Pair("a", "a")
    )

    //case sensitive
    //O(n)
    fun compress(str: String): String {
        if (str.isEmpty()) return ""
        val stringBuilder = StringBuilder()
        var counter = 0
        var currentChar = str[0]
        for (i in 0 until str.length) {
            if (currentChar == str[i]) {
                counter++
            } else {
                stringBuilder.append(currentChar)
                stringBuilder.append(counter)
                counter = 1
                currentChar = str[i]
            }
            if (i == str.length - 1) {
                stringBuilder.append(currentChar)
                stringBuilder.append(counter)
            }
        }
        val result = stringBuilder.toString()
        return if (result.length >= str.length) {
            str
        } else {
            result
        }
    }
}