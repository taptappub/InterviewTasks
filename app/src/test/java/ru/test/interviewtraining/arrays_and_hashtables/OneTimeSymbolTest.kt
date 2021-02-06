package ru.test.interviewtraining.arrays_and_hashtables

import org.junit.Test

import org.junit.Assert.*

class OneTimeSymbolTest {
    private val tests = listOf(
        "" to true,
        "srghf" to true,
        "sllls" to false
    )

    @Test
    fun hasDuplicateSymbols() {
        tests.forEach {
            val result = OneTimeSymbol.hasDuplicateSymbols(it.first)
            assertEquals("OneTimeSymbolWithoutSet str = ${it.first}", it.second, result)
        }
    }

    @Test
    fun hasDuplicateSymbolsFaster() {
        tests.forEach {
            val result = OneTimeSymbol.hasDuplicateSymbols(it.first)
            assertEquals("OneTimeSymbolWithoutSet str = ${it.first}", it.second, result)
        }
    }

    @Test
    fun hasDuplicateSymbolsBinary() {
        tests.forEach {
            val result = OneTimeSymbol.isUniqueCharsBinary(it.first)
            assertEquals("OneTimeSymbolWithoutSet str = ${it.first}", it.second, result)
        }
    }
}