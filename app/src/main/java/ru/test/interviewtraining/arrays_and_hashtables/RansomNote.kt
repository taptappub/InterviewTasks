package ru.test.interviewtraining.arrays_and_hashtables

/**
 * Complete the checkMagazine function in the editor below.
 * It must print YES if the note can be formed using the magazine, or NO.
 * checkMagazine has the following parameters:
 * magazine: an array of strings, each a word in the magazine
 * note: an array of strings, each a word in the ransom note
 */
object RansomNote {
    fun checkMagazine(magazine: Array<String>, note: Array<String>) {
        val result = checkMagazineCalc(magazine, note)
        println(result)
    }

    fun checkMagazineCalc(magazine: Array<String>, note: Array<String>): String {
        val magazineHash = hashMapOf<String, Int>()
        magazine.forEach {
            if (magazineHash[it] == null) {
                magazineHash[it] = 1
            } else {
                magazineHash[it] = magazineHash[it]!! + 1
            }
        }

        note.forEach {
            if (magazineHash[it] == null || magazineHash[it] == 0) {
                return "No"
            } else {
                magazineHash[it] = magazineHash[it]!! - 1
            }
        }
        return "Yes"
    }
}
