package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Алгоритм, определяющий, все ли символы в строке встречаются только 1 раз
 */
object OneTimeSymbol {
    val tests = listOf(
        "",
        "srghf",
        "sllls"
    )

    //O(n)
    fun hasDuplicateSymbols(str: String): Boolean {
        val hashMap = HashSet<Char>()
        str.forEach {
            hashMap.add(it)
        }
        return hashMap.size != str.length
    }
    //O(n) но быстрее, потому что алгоритм прерывается сразу же при нахождении повторяющегося символа
    fun hasDuplicateSymbolsFaster(str: String): Boolean {
        val char_set = BooleanArray(256)
        for (element in str) {
            val value = element.toInt()
            if (char_set[value]) {        //символ уже был найден в строке
                return false
            }
            char_set[value] = true
        }
        return true
    }
}

/**
 * Алгоритм, определяющий, все ли символы в строке встречаются только 1 раз
 * запрещено использовать дополнительные структуры данных
 */
object OneTimeSymbolWithoutSet {
    val tests = listOf(
        "",
        "srghf",
        "sllls"
    )

    /**
     * Суть в том, что у тебя есть битовый массив 000000000000..0 - всего в 32 нуля, потому что Int 2^32
     * Получается сначала мы считаем позицию числа в битовом массиве 1 shl el, и сохраняем новое число 00001000..00
     *
     * ограничение - только для количества символов < 32
     */
    fun isUniqueChars(str: String): Boolean {
        var checker: Int = 0
        for (item: Char in str) {
            val el = item - 'a'
            if (checker and (1 shl el) > 0) {
                return false
            }
            checker = checker or (1 shl el)
        }
        return true
    }

}