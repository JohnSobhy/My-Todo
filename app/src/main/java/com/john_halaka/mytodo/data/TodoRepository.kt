package com.john_halaka.mytodo.data

class TodoRepository (private val todoDao: TodoDao) {
    val getAllTodos : List<Todo> = todoDao.getAllTodos()
    suspend fun addTodo(todo: Todo) {
        todoDao.addTodo(todo)
    }
    suspend fun deleteTodo(todo: Todo) {
        todoDao.deleteTodo(todo)
    }
    suspend fun getTodoById(id: Int) : Todo = todoDao.getTodoById(id)

    suspend fun updateTodo(todo: Todo) {
        todoDao.updateTodo(todo)
    }
}