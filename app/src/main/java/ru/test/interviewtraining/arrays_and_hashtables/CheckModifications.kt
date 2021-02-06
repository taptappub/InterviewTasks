package ru.test.interviewtraining.arrays_and_hashtables

import kotlin.math.abs


//Существуют три вида модифицирующих операций со строками: вставка
//символа, удаление символа и замена символа. Напишите функцию, которая
//проверяет, находятся ли две строки на расстоянии одной модификации (или
//нуля модификаций).
//Пример:
//pale, ple -> true
//pales, pale -> true
//pale, bale -> true
//pale, bake -> false
object CheckModifications {

    //case sensitive
    //O(n)
    fun checkModifications(str1: String, str2: String): Boolean {
        if (str1 == str2) return true //0 модификаций
        if (abs(str1.length - str2.length) > 1) {
            return false
        } else {
            val size = Math.max(str1.length, str2.length)
            var errorCounter = 1
            var i = 0
            var j = 0
            while(i < size && j < size) {
                val s1 = if (i < str1.length) {
                    str1[i]
                } else {
                    ""
                }
                val s2 = if (j < str2.length) {
                    str2[j]
                } else {
                    ""
                }
                if (s1 != s2) {
                    errorCounter--
                    if (str1.length == str2.length) {
                        i++
                        j++
                    } else if (str1.length > str2.length) {
                        i++
                    } else {
                        j++
                    }
                } else {
                    i++
                    j++
                }
                if (errorCounter < 0) {
                    return false
                }
            }

        }
        return true
    }
}