package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Напишите метод, заменяющий все пробелы в строке символами '%20 ' . Можете
 * считать, что длина строки позволяет сохранить дополнительные символы,
 * а фактическая длина строки известна заранее. (Примечание: при реализации
 * метода на java для выполнения операции •на месте• используйте символьный
 * массив.)
 * Пример:
 * Ввод: "Mr John Smith " , 13
 * Вывод: "Mr%20John%20Smith
 */

object SpaceReplacer {

    //O(n)
    fun replace(str: String, len: Int): String {
        val resultString: StringBuilder = java.lang.StringBuilder()
        for (i in 0 until len) {
            if (str[i] == ' ') {
                resultString.append("%20")
            } else {
                resultString.append(str[i])
            }
        }
        return resultString.toString()
    }
}