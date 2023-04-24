package com.john_halaka.mytodo

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.john_halaka.mytodo.data.Todo


    @Composable
    fun TodoItem(todo: Todo) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(text = todo.title ,
                    modifier = Modifier.fillMaxWidth(.75f))
                    Checkbox(
                        checked = false,
                        onCheckedChange = {

                        })
                }

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                        ){
                    Text(text = todo.description.toString(),
                        modifier = Modifier.fillMaxWidth(.75f))
                    IconButton(onClick = {


                    }) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete todo"
                        )
                    }

                }


            }
        }
    }
