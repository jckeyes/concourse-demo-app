package com.johnckeyes

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.anyList
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(AnagramController::class)
class AnagramControllerTest {

    private val path = "/anagram"
    private val param = "words"
    private val one = "one"
    private val neo = "neo"

    @Autowired
    lateinit private var mvc: MockMvc

    @MockBean
    lateinit private var anagramService: AnagramService

    @Test
    fun testController() {
        val result = true
        given(anagramService.wordsAreAnagrams(listOf(one, neo))).willReturn(result)
        mvc.perform(get(path).param(param, one).param(param, neo))
                .andExpect(status().isOk)
                .andExpect(content().string(result.toString()))
    }
}