
fun main() {
    Solution().isPalindrome(121)
}

class Solution {
    fun isPalindrome(x: Int): Boolean {

        var n = x

        if (x < 0) return false;

        var result = 0;

        while (n < 0) {
            val rem = n % 10;
            result = result * 10 + rem
            n = n / 10

            System.out.println(result)
        }

        return if (x == result) {
            true
        } else {
            false
        }

    }

}