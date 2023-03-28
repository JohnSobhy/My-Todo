package com.john_halaka.mytodo.data

import androidx.room.*


@Dao
interface TodoDao {
    @Query("SELECT * FROM todo")
    fun getAllTodos(): List<Todo>

    @Insert
    fun addTodo(todo: Todo)

    @Delete
    fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id =:id")
    fun getTodoById(id: Int): Todo

    @Update
    fun updateTodo(todo: Todo)
}