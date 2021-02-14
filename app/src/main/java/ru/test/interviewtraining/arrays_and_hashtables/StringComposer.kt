package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Вам даны две строки A и B.
 * Определите, существует ли непустая строка, которая встречается как подстрока и в A, и в B.
 */
object StringComposer {
    fun twoStrings(s1: String, s2: String): String {
        val intersect = s1.toSet().intersect(s2.toSet())
        return if (intersect.isEmpty()) {
            "NO"
        } else {
            "YES"
        }
    }
}
