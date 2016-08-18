package com.johnckeyes

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
open class AnagramController(val anagramService: AnagramService) {

    @GetMapping("/anagram")
    fun anagrams(@RequestParam words: List<String>) =
            anagramService.wordsAreAnagrams(words)
}

