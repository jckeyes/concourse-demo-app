package com.johnckeyes

import org.springframework.stereotype.Service

@Service
open class AnagramService {

    open fun wordsAreAnagrams(words: List<String>) =
            words.map { keyFor(it) }.distinct().size == 1

    private fun keyFor(word: String): String {
        val charArray = word.toLowerCase().toCharArray()
        charArray.sort()
        return charArray.joinToString()
    }
}
