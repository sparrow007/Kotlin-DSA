fun main() {
    val letters = ('a'..'z').toList()
   // println(letters.slice(10..12))
    println(getHalfDouble(20))
    //println(endsWithDot(java.lang.StringBuilder("Ankit is cool")))
}

fun <T> List<T>.slice(range: IntRange): List<T> {
    val list = ArrayList<T>()
    for (i in range) {
        list.add(this[i])
    }
    list.map {  }
    return list
}

//Number is the upper bound for type parameter
fun <T: Number> getHalfDouble(value: T): Double {
    //toDouble is member function of the Number
    return value.toDouble() / 2
}

fun <T: Comparable<T>> max (first: T, second: T
): T {
    return if (first > second) first else second
}

//Multiple type constraint
fun <T> endsWithDot(value: T): T

where T : CharSequence, T : java.lang.Appendable {
    if (!value.endsWith('.')) {
        value.append('.')
    }
    return value
}

//create the class and interface with type parameters

interface ListCollection<T> {
    operator fun get(index: Int): T
}

class IteratorList<T> {

}
