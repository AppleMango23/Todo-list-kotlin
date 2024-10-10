package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)

fun getFakeTodo () : List<Todo>{
    return listOf<Todo>(
       Todo(1, "First1 todo",Date.from(Instant.now())),
        Todo(2, "Second todo",Date.from(Instant.now())),
        Todo(3, "This is todo",Date.from(Instant.now())),
        Todo(4, "Forth todo",Date.from(Instant.now())),
        Todo(5, "Fifth todo",Date.from(Instant.now())),
    )
}