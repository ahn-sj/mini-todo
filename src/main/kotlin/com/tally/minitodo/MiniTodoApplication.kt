package com.tally.minitodo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MiniTodoApplication

fun main(args: Array<String>) {
    runApplication<MiniTodoApplication>(*args)
}
