package arraysproblems.medium

import kotlin.math.abs
import kotlin.math.max

fun main() {
    val array = intArrayOf(1,2,5,-7,2,6)
    val result = getMaxSubArray(array)
    for (i in result) {
        println(i)
    }
}


fun getMaxSubArray(array: IntArray): IntArray {

    val hashmap = HashMap<Int, Pair<Int, Int>>()
    var initialIndex = 0
    var maxSum = Int.MIN_VALUE
    var maxInitialIndex = 0
    var maxEndIndex = 0
    var sum = 0
    for (i in 0 until array.size) {

        sum += array[i]

        if (maxSum < sum) {
            maxInitialIndex  = initialIndex
            maxEndIndex = i
            maxSum = sum
        }

        if (sum < 0) {
            sum = 0
            initialIndex = i  + 1
        }
    }
    val result = IntArray((maxEndIndex-maxInitialIndex)+1)
    for (i in maxInitialIndex..maxEndIndex) {
        result[abs(maxInitialIndex - i)] = array[i]
    }

    return result
}