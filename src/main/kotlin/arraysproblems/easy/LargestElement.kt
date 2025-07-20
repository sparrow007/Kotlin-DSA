package arraysproblems.easy


import kotlin.collections.HashMap

fun main() {

    println(longestSum(intArrayOf(10, -10, 20, 30), 5))

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
    val hasMap = HashMap<Int, Int>()

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


fun subarraySum(nums: IntArray, k: Int): Int {
    val prefixSum = HashMap<Int, Int>()
    var no = 0
    var sum = 0
    prefixSum.put(0, 1)


    for (i in 0 until nums.size) {

        sum += nums[i]
        val rem = prefixSum.get(sum-k)

        if (rem != null) {
            no += rem
        }

        prefixSum[sum] = prefixSum.getOrDefault(sum, 0) + 1
    }

    return no
}

fun longestSum(nums: IntArray, k: Int) {
    val map = HashMap<Int, Int>()
    var l = 0
    var sum = 0

    for (i in nums.indices) {

        sum += nums[i]
        val rem = map.get(sum - k)
        if (sum == k) {
            l = Math.max(l, i+1)
        } else if ( rem !=  null) {
            val subLen = i-rem
            l = Math.max(l, subLen + 1)
        }

        map.putIfAbsent(sum, i)

    }

    println(l)
}