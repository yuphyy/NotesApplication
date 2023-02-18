package com.example.notioncleancompose.presentation.notes.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.notioncleancompose.domain.utils.NoteOrder
import com.example.notioncleancompose.domain.utils.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit
) {
    Column(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            DefaultRadioButton(text = "По заголовку",
                checked = noteOrder is NoteOrder.Title,
                onCheck = { onOrderChange(NoteOrder.Title(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(8.dp))

            DefaultRadioButton(text = "По дате",
                checked = noteOrder is NoteOrder.Date,
                onCheck = { onOrderChange(NoteOrder.Date(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
        DefaultRadioButton(text = "По цвету",
            checked = noteOrder is NoteOrder.Color,
            onCheck = { onOrderChange(NoteOrder.Color(noteOrder.orderType)) }
        )
        Spacer(modifier = Modifier.width(8.dp))

    }
    Spacer(modifier = Modifier.height(32.dp))
    Row(modifier = Modifier.fillMaxWidth()) {
        DefaultRadioButton(text = "По возрастанию",
            checked = noteOrder.orderType is OrderType.Ascending,
            onCheck = { onOrderChange(noteOrder.copy(OrderType.Ascending)) }
        )
        Spacer(modifier = Modifier.width(8.dp))

        DefaultRadioButton(text = "По убыванию",
            checked = noteOrder.orderType is OrderType.Descending,
            onCheck = { onOrderChange(noteOrder.copy(OrderType.Descending)) }
        )
        Spacer(modifier = Modifier.height(32.dp))
        
    }
}