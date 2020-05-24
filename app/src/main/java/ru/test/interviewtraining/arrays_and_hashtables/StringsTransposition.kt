package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Метод, является ли одна строка перестановкой другой строки
 */
object StringsTransposition {

    val tests = listOf(
        "aaaab" to "abaaa",
        "sllls" to "sdlll",
        "aasd" to "a"
    )

    data class Hash(
        val sumHash: Long,
        val hash: Int
    ) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as Hash

            if (hash xor other.hash == 0) {
                if (sumHash == other.sumHash) {
                    return true
                }
            }

            return false
        }
    }

    //O(n+m)
    fun compare(source: String, target: String): Boolean {
        val targetHash: Hash =
            getHash(
                target
            )
        val sourceHash: Hash =
            getHash(
                source
            )
        return targetHash == sourceHash
    }

    //O(m)
    private fun getHash(string: String): Hash {
        var sumHash: Long = 0
        var binaryHash: Int = 0
        string.forEach { char ->
            binaryHash = binaryHash or char.toInt()
            sumHash += char.toInt()
        }
        return Hash(
            sumHash,
            binaryHash
        )
    }
}
