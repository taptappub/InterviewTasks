package ru.test.interviewtraining.linkedlist

/**
 * Для кольцевого связного списка реализуйте алгоритм, возвращающий начальный узел петли.
 * Определение
 * Кольцевой связный список - это связный список, в котором указатель следующего узла ссылается на более ранний узел, образуя петлю.
 * Пример:
 * Ввод: A- >B- >C- >D- > E - >C (предыдущий узел с)
 * Вывод: C
 * Подсказки: 50, 69, 83, 90
 */
object FindCircle {
    val tests = listOf(
        Pair(
            getTest(),
            getStart()
        )
    )

    private fun getTest(): Node {
        val n1 = Node("a", null)
        val n2 = Node("b", null)
        val n3 = getStart()
        val n4 = Node("d", null)
        val n5 = Node("e", null)

        n1.next = n2
        n2.next = n3
        n3.next = n4
        n4.next = n5
        n5.next = n3
        return n1
    }

    private fun getStart() = Node("c", null)


    /**
     * Давайте запишем алгоритм, воспользовавшись информацией из частей 1 -3:
     * 1. Создадим два указателя: FastPointer и SlowPointer.
     * 2. Будем перемещать FastPointer на 2 шага, а SlowPointer на 1 шаг.
     * 3. Когда указатели встретятся, нужно переместить SlowPointer в LinkedListHead, а FastPointer оставить на том же месте.
     * 4. SlowPointer и FastPointer продолжают двигаться со своими скоростями, точка их следующей встречи будет искомым результатом
     */
    fun findBeginning(list: Node?): Node? {
        var slow = list
        var fast = list

        /* Поиск точки встречи ( РАЗМЕР_ПЕТЛИ - k шагов в связном списке) */
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next;
            if (slow == fast) { // Встреча
                break
            }
        }

        /* Проверка ошибок - точки встречи нет, а значит, нет и петли */
        if (fast == null && fast?.next == null) {
            return null
        }

        /* Slow перемещается в начало, fast остается в точке встречи. Если
        * они будут двигаться в одном темпе, то встретятся в начале петли . */
        slow = list
        while (slow != fast) {
            slow = slow?.next
            fast = fast?.next
        }

        /* Оба указателя находятся в начале петли. */
        return fast
    }
}