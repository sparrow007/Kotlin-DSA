package collections

fun main() {

   val list = listOf(1.0, 4.0, 5.0, 6.0)

    val pair = list.chunked(2) { it.sum()

    }

    print(pair)
}