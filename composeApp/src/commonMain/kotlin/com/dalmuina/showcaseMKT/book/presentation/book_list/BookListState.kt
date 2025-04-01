package com.dalmuina.showcaseMKT.book.presentation.book_list

import com.dalmuina.showcaseMKT.book.domain.Book
import com.dalmuina.showcaseMKT.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
