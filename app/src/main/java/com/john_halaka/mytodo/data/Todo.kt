package com.john_halaka.mytodo.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "todo_table")
data class Todo (
   @PrimaryKey (autoGenerate = true)
   val id: Int?,
    val title: String,
    val description: String?,
    val completed: Boolean,
 )
