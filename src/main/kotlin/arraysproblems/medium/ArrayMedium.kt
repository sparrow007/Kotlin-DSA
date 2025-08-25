package arraysproblems.medium

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

fun main() {
    val array = intArrayOf(1, 2, 5, 3, 1, 2)
    val result = ladderInArray(array)
    result.forEach {
        print(it)
    }
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


fun rearrangeArrayP1(nums: IntArray): IntArray {
    val subArraySize = nums.size / 2
    val postiveArray = IntArray(subArraySize)
    val negativeArray = IntArray(subArraySize)
    val result = IntArray(nums.size)

    var pIndex = 0
    var nIndex = 0
    for (i in 0 until nums.size) {
        if (nums[i] > 0) {
            postiveArray[pIndex++] = nums[i]
        } else {
            negativeArray[nIndex++] = nums[i]
        }
    }

    pIndex = 0
    nIndex = 0

    for (i in 0 until nums.size) {
        if (i %2 == 0) {
            result[i] = postiveArray[pIndex++]
        } else {
            result[i] = negativeArray[nIndex++]
        }
    }

    return result
}

fun nextPermutation(nums: IntArray): Unit {
    var ind = -1
    val size = nums.size

    for (i in size-2 downTo 0) {
        if (nums[i] < nums[i+1]) {
            ind = i
            break
        }
    }

    if (ind == -1) {
        nums.reverse()
        return
    }

    for (i in size - 1 downTo  ind) {
        if (nums[ind] < nums[i]) {
            val temp = nums[ind]
            nums[ind] = nums[i]
            nums[i] = temp
            break
        }
    }

    nums.sort(fromIndex =  ind + 1)
    println(nums)

}

fun ladderInArray(nums: IntArray): ArrayList<Int> {
    val res = ArrayList<Int>()
    res.add(index = 0, nums[nums.size - 1])
    for (i in nums.size - 2 downTo 0) {
        val top = res[0]
        if (nums[i] > top) {
            res.add(index = 0, nums[i])
        }
    }

    return res
}
