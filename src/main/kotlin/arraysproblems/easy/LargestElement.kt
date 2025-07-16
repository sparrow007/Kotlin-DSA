package arraysproblems.easy

import java.util.SortedSet

fun main() {
    for (i in 9 downTo 0) {
        print(i)
    }
    val rArray = intArrayOf(10)
    rArray.sort()

    rArray.sum()
    rArray[0] = 90

}

fun maxValue() {
    val array  = Array<Int>(5) { i -> i }

    var max = -1
    var secondMax = -1


    for (i in 0 until 20)

    for (i in array) {
        if (i > max) {
            max = i
        }
        if (i in (secondMax + 1) until max) {
            secondMax = i
        }
    }

    println(secondMax)
}

fun checkIfArraySorted() {
    val array = intArrayOf()
    var isArraySorted = false

    if (array.size == 1) isArraySorted = true

    //check for ascending/
    for (i in 0..array.size) {

        if ((i+1) < array.size) {
            isArraySorted =  array[i] <= array[i+1]
            if (!isArraySorted) break
        }
    }

    print("is array sorted $isArraySorted")
}

fun removeDuplicates(nums: IntArray): Int {

    val hashMap= LinkedHashSet<Int>()

    for (i in nums) {
        hashMap.add(i)
    }

    println(hashMap.toSortedSet())

    hashMap.forEachIndexed { index: Int, i: Int ->
        nums[index] = i
    }

    return hashMap.size

}


fun moveZeroes(nums: IntArray): Unit {
    val size = nums.size
    for (i in 0 until size) {
        if (nums[i] == 0) {
            var j = i
            while (j < size && nums[j] != 0) {
                j++
            }

            if(j >= size) break

            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = i
        }
    }

}

fun missingNumber(nums: IntArray): Int {
    val sum = nums.sum()
    var totalSum = 0
    for (i in 0..nums.size) {
        totalSum += i
    }
    return totalSum - sum
}