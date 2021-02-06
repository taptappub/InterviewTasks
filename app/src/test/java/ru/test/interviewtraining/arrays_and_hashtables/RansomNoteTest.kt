package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Test

import org.junit.Assert.*

class RansomNoteTest {

    private val tests = listOf(
        Triple(
            arrayOf("give", "me", "one", "grand", "today", "night"),
            arrayOf("give", "one", "grand", "today"),
            "Yes"
        ),
        Triple(
            arrayOf("two", "times", "three", "is", "not", "four"),
            arrayOf("two", "times", "two", "is", "four"),
            "No"
        ),
        Triple(
            arrayOf("ive", "got", "a", "lovely", "bunch", "of", "coconuts"),
            arrayOf("ive", "got", "some", "coconuts"),
            "No"
        ),
        Triple(
            arrayOf("a", "b", "c", "c", "c", "d"),
            arrayOf("a", "b", "c", "c", "c"),
            "Yes"
        )
    )

    @Test
    fun checkMagazine() {
        tests.forEach {
            val result = RansomNote.checkMagazineCalc(it.first, it.second)
            assertEquals(
                "RansomNote str1 = ${it.first.joinToString()}, str2 = ${it.second.joinToString()}",
                it.third,
                result
            )
        }
    }
}
