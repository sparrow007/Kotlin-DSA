package sorting

class SelectionSort {

    fun sort() {
        //adding the selection sort
        val list = arrayListOf(5,4,3,2,1,0)

        var i=0
        while ( i < list.size) {

            var j = i +1
            var min = i
            while (j < list.size) {
                //find the minimum value index
                if (list[j] < list[min]) {
                    min = j
                }
                j++
            }

            val temp = list[i]
            list[i] = list[min]
            list[min] = temp

            i++
        }

        list.forEach {
            print( "$it ")
        }
    }

}

fun main() {
    val selection = SelectionSort()
    selection.sort()
   // print(selection.sort())
}