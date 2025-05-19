package collections

fun main() {

    //convert from one object to another object in kt
    val list = Library.books.map { book ->
        book.toString()
    }

}