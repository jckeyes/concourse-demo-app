package com.johnckeyes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AnagramServiceTest {

    private val service = AnagramService()

    @Test
    fun testAnagrams() {
        assertThat(service.wordsAreAnagrams(listOf("one", "eno"))).isTrue()
        assertThat(service.wordsAreAnagrams(listOf("one", "ENO"))).isTrue()
        assertThat(service.wordsAreAnagrams(listOf("one", "two"))).isFalse()
        assertThat(service.wordsAreAnagrams(listOf("one", "oonnee"))).isFalse()
        assertThat(service.wordsAreAnagrams(listOf("onee", "enoo"))).isFalse()
    }
}