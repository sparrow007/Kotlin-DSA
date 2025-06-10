package sorting

import kotlin.math.min

fun main() {
    val arry = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val sortedArray = bubbleSort(arry)
    sortedArray.forEach { print(" $it") }

}

fun bubbleSort(arry: Array<Int>): Array<Int> {
    var i = arry.lastIndex
    while (i > 0) {
        var j = 0
        var didSwapPerform = false
        while (j < i) {
            if (arry[j] > arry[j + 1]) {
                val temp = arry[j + 1]
                arry[j + 1] = arry[j]
                arry[j] = temp
                didSwapPerform = true
            }
            j++
        }
        if (!didSwapPerform) {
            break
        }

        println("run")
        i--
    }
    return arry
}

fun selectionSort(arry: Array<Int>): Array<Int> {

    for (i in arry.indices) {
        var minIndex = i
        var j = i

        while (j < arry.size) {
            if (arry[j] < arry[minIndex]) {
                minIndex = j
            }

            j++
        }

        val temp = arry[minIndex]
        arry[minIndex] = arry[i]
        arry[i] = temp
    }

    return  arry
}