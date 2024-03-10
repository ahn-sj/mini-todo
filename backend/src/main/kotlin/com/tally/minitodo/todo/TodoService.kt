package com.tally.minitodo.todo

import org.springframework.stereotype.Service

@Service
class TodoService(private val todoRepository: TodoRepository) {

    fun findAll() = todoRepository.findAll()

}