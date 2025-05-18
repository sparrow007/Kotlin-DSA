

enum class Color (
    val r:Int, val g:Int, val b: Int
) {
    RED (255, 0, 0),  ORANGE(255, 165, 0), YELLOW (250, 98, 0)
    , BLUE(98, 123, 99);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun mix(c1: Color, c2: Color): String {
    return when (setOf(c1, c2)) {
        setOf(Color.RED, Color.BLUE) -> "ORANAGE"
        setOf(Color.ORANGE, Color.YELLOW) -> "RED"
        else -> throw Exception("Dirty Color")
    }
}

fun main() {
    println("Ankit".lastChar)
    val map = mapOf("a" to 5, "b" to 4.9, 4 to "")

    val hash = HashMap<Int, Int> ()

    trippleQuotesString()
}



fun getIntArray(): IntArray {
    return ArrayList<Int>(2).toIntArray()
}

fun handleSetCollection() {

    val intArray  = intArrayOf(3,6,0)
    intArray.sum()
}

fun lambdaExp() {
    data class People(val name: String, val age: Int)

    val people = listOf(People("ankit", 40), People("suman", 44))
    people.maxByOrNull { p: People-> p.age }
}

fun trippleQuotesString() {
    val data = """My name is | ${'\n'} \n c://gohost"""
    println(data)
}

fun createList(vararg list: Int) {
    val listUpdate = listOf(list)
    print(listUpdate)
}

fun String.lastChar() = this[this.length - 1]

val String.lastChar: Char
    get() = this[length - 1]


