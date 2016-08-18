package com.johnckeyes

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
open class AnagramalyzerApplication

fun main(args: Array<String>) {
    SpringApplication.run(AnagramalyzerApplication::class.java, *args)
}