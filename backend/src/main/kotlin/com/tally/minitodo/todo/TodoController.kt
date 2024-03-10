package com.tally.minitodo.todo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TodoController(private val todoService: TodoService) {

    @GetMapping("/todos")
    fun findAll() = todoService.findAll();

}