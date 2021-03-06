package com.example.booki.repository

import com.example.booki.Book
import timber.log.Timber

private const val INDEX_OFFSET = 2

private val BOOKS = listOf(

    Book(0, "The lord of the rings", "J.R.R Tolkien",
        "Since the release of the first novel, Harry Potter and the Philosopher's Stone, on 26 June 1997, the books have found immense popularity, positive reviews, and commercial success worldwide.",
        "https://m.media-amazon.com/images/I/91RsnbFa4JL._AC_UY218_.jpg"),
    Book(0, "Lebron inc - billion", "Brian Windhorst",
        "From the New York Times bestselling author of Return of the King comes the story of LeBron James's incredible transformation from basketball star to sports and business mogul.",
        "https://images-na.ssl-images-amazon.com/images/I/41Aa4UKu1IL.jpg"),
    Book(0, "Mastering Kotlin: Learn advanced Kotlin programming techniques to build apps for Android, iOS, and the web", "Kindle Edition",
        "From the New York Times bestselling author of Return of the King comes the story of LeBron James's incredible transformation from basketball star to sports and business mogul.",
        "https://m.media-amazon.com/images/I/51Fb+vAPPaL._SX260_.jpg"),
    Book(0, "Android For Dummies, 2nd Edition ", "Gookin",
        "From the New York Times bestselling author of Return of the King comes the story of LeBron James's incredible transformation from basketball star to sports and business mogul.",
        "https://images-na.ssl-images-amazon.com/images/I/51HDAAeVMWL._SX218_BO1,204,203,200_QL40_FMwebp_.jpg"),
    Book(0, "Prayer That Brings Revival: Interceding for God to move in your family, church, and community", "David Yongee Cho",
        "From the New York Times bestselling author of Return of the King comes the story of LeBron James's incredible transformation from basketball star to sports and business mogul.",
        "https://images-na.ssl-images-amazon.com/images/I/51rEBRWVRqL._SX331_BO1,204,203,200_.jpg")
)

class FakeBookApi {

    companion object {
        private var bookIndex = 0
    }

    fun loadBooks(): List<Book> {
        val booksSize = BOOKS.size
        var newBookIndex = (bookIndex + INDEX_OFFSET) % booksSize

        if(newBookIndex == 0) {
            newBookIndex = booksSize
        }

        Timber.i("Book range: $bookIndex / $newBookIndex")
        val bookSlice = BOOKS.subList(bookIndex, newBookIndex)

        bookIndex = newBookIndex % booksSize

        return bookSlice

    }
}