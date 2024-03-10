package com.tally.minitodo.todo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Todo(
    title: String,
    content: String,
    address: String?,
    phoneNumber: String?
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
    var title: String = title
    var content: String = content
}