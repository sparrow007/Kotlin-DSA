package maths;

class Solution {
    public static void print_divisors(int n) {
        // code here
        int size = (int) Math.sqrt(n);
        int[] output = new int[size];
        int j = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n/i) {
                    output[j] = n/i;
                    j++;
                }
            }
        }

        for (int i = j - 1; i >= 0; i--) {
            System.out.print(output[i] + " ");
        }
    }
}
