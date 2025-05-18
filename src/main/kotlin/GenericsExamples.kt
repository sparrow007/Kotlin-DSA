import java.lang.Math.abs

inline fun <reified T, reified K> printValue(value: Any, another: Any)  {
    if (value is T || another is K) {
        print(value)

    }
}

inline fun <reified T> Iterable<*>.name(): List<T> {
    val dataList = mutableListOf<T>()

    for (element in this) {
        if (element is T) {
            dataList.add(element)
        }
    }
    return dataList
}

fun guid() {
    System.out.println("This is guide")
    teach()
    System.out.println("Guide is over")

}

inline fun teach() {
   val work = Working()
    System.out.println("I am teaching CS ${work.largestPrimeFactor(60)}")
}

fun main() {
    teach()
}

fun characterReplacement(s: String, k: Int): Int {


    return 0

}

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val result = ArrayList<String>()
        for (i in 1..n) {
            when {
                (i % 3 == 0 && i % 5 == 0) ->
                result.add("FizzBuzz")
                (i % 3 == 0)->
                result.add("Fizz")
                (i % 5 == 0)->
                result.add("Buzz")
                else ->
                result.add(i.toString())
            }
        }
        return result
    }
}

class Working {
    fun largestPrimeFactor(n: Int): Int {
        var num = n
        var i = 2
        var largestPrimeFactor = 1

        while (i * i <= num) {
            while (num % i == 0) {
                largestPrimeFactor = maxOf(largestPrimeFactor, i)
                System.out.println("num = $i")
                num /= i
            }
            i++
        }

        if (num > 1) {
            largestPrimeFactor = maxOf(largestPrimeFactor, num)
        }

        return largestPrimeFactor
    }
}
