package com.dalmuina.showcaseMKT.book.presentation.book_list

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.compose.viewmodel.koinViewModel
import androidx.compose.runtime.getValue
import com.dalmuina.showcaseMKT.book.domain.Book

@Composable
fun BookListScreenWrapper(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick:(Book)->Unit,
    modifier: Modifier
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    BookListScreen(state){action ->
        when(action){
            is BookListAction.OnBookClick -> onBookClick(action.book)
            else -> Unit
        }
        viewModel.onAction(action)
    }
}

@Composable
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit
){

}
