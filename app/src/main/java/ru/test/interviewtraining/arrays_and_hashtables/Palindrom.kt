package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Напишите функцию, которая проверяет, является ли заданная строка перестановкой палиндрома. (Палиндром - слово или фраза, одинаково читающиеся
 * в прямом и обратном направлении; перестановка - строка, содержащая те
 * же символы в другом порядке.) Палиндром не ограничивается словами из
 * словаря.
 * Пример:
 * Ввод: Tact Соа
 * Вывод: True ( перестановки : "taco cat " , "atco cta " , и т . д . )
 * Подсказки: 1 06, 1 2 1 , 1 34, 1 36
 */
object Palindrom {
    val tests = listOf(
        "Tact Coa" to true,
        "" to true,
        "ababab bababa" to true,
        "ababab" to false,
        "abcba" to true
    )

    //участвуют только буквы и пробелы "a..zA..Z "
    //пробелы не участвуют в полиндроме
    //O(3n)
    fun isPalindrom(str: String): Boolean {
        val charSet = IntArray(26) //"a..zA..Z"
        val resString = str.replace(" ", "").toLowerCase() // если пройтись руками, то можно сделать в O(n)
        for (item: Char in resString) {
            val index = item - 'a'
            charSet[index] += 1
        }

        return if (resString.length % 2 == 0) {
            even(
                charSet
            )
        } else {
            odd(charSet)
        }
    }

    fun isBinaryPalindrom(str: String): Boolean {
        val resString = str.replace(" ", "").toLowerCase() // если пройтись руками, то можно сделать в O(n)
        var checker = 0
        for (item: Char in resString) {
            if (item == ' ') {
                continue
            }
            val el = item.toLowerCase() - 'a'
            checker = if ((checker and (1 shl el)) == 0) {
                checker or (1 shl el)
            } else {
                checker and (1 shl el).inv()
            }
        }
        return checker == 0 || (checker and (checker - 1)) == 0
    }

    //O(n)
    fun even(array: IntArray): Boolean {
        for (count in array) {
            if (count %2 != 0) {
                return false
            }
        }
        return true
    }

    //O(n)
    fun odd(array: IntArray): Boolean {
        var hasOdd = false
        for (count in array) {
            if (count %2 != 0) {
                if (hasOdd) {
                    return false
                }
                hasOdd = true
            }
        }
        return true
    }
}