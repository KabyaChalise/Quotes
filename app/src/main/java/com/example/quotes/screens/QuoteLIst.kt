package com.example.quotes.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotes.models.Quote

@Composable
fun QuoteLIst(data: Array<Quote>, onClick: (quote:Quote)-> Unit){

    LazyColumn(content = {
        items(data){
            QuotesListItems(quote = it,onClick)

        }
    })

}