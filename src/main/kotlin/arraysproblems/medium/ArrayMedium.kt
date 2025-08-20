package arraysproblems.medium

import kotlin.math.abs

fun main() {
    val array = intArrayOf(7,6,4,3,1)
    val result = maxProfit(array)
    println(result)
}


fun getMaxSubArray(array: IntArray): IntArray {
    var initialIndex = 0
    var maxSum = Int.MIN_VALUE
    var maxInitialIndex = 0
    var maxEndIndex = 0
    var sum = 0
    for (i in 0 until array.size) {


    }

    val result = IntArray((maxEndIndex-maxInitialIndex)+1)
    for (i in maxInitialIndex..maxEndIndex) {
        result[abs(maxInitialIndex - i)] = array[i]
    }

    return result
}


fun maxProfit(prices: IntArray): Int {
    var maxSell = prices[prices.size-1]
    var profit = 0

    for (i in prices.size-1 downTo 0) {
        val cost = maxSell - prices[i]
        profit = Math.max(profit, cost)
        maxSell = Math.max(maxSell, prices[i])
    }
    return profit
}
