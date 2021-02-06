package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого.
 * Для двух строк sl и s2 напишите код, который проверяет, получена ли строка s2 циклическим сдвигом s1,
 * используя только один вызов метода isSubstring (пример: слово waterbottle получено циклическим сдвигом erbottlewat).
 */
object ShiftStringChecker {

    fun checkIfSubstring(s1: String, s2: String) : Boolean {
        return if (s1.length != s2.length) {
             false
        } else {
            val concatinated = StringBuilder()
            concatinated.append(s2)
            concatinated.append(s2)
            concatinated.toString().contains(s1)
        }
    }
}