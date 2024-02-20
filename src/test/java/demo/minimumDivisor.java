package demo;
/*
Minimum Divisor
Description
Given an array of integers, each element is to be divided by an integer so that the sum of the results is less than or equal to a threshold integer. Each non-integer result of division is rounded up before it is added to the sum. For example, 1/9 = 0.111..., round up to 1. Determine the minimum divisor to make the sum less than or equal to the threshold.

Example
arr = [1, 5, 7]
threshold = 8

●      If the divisor is 1, the results are arr' = [1, 5, 7] which sums to 13 which is greater than the threshold 8.
●      If the divisor is 2, the results are arr' = [1, 3, 4] which sums to 8 which is equal to the threshold 8.
●      The minimum divisor to make the sum less than or equal to the threshold is 2.

Function Description
Complete the function minimumDivisor in the editor below.

minimumDivisor has the following parameter(s):
    int arr[n]:  an array of integers
    int threshold:  the maximum value of the sum

Returns:
    int: the minimum divisor

Constraints
●      1 ≤ n ≤ 105
●      n ≤ threshold ≤ 109
●      1 ≤ arr[i] ≤ 109, 0 ≤ i < n

Input Format for Custom Testing
Input from stdin will be processed as follows and passed to the function.

The first line contains a single integer n, the size of arr.
Each of the next n lines contains an integer arr[i].
The last line contains a single integer, threshold, the upper bound (inclusive) of the sum.

Sample Case 0
Sample Input
STDIN 	Function
----- 	--------
3      	→   arr[] size n = 3
2      	→   arr = [2, 4, 5]
4
5
10    	→   threshold = 10
Sample Output
2

Explanation
●      The sum of the original array is 13 which is greater than the threshold 10.
●      Test a divisor 2 which is higher than the divisor 1: arr' = [1, 2, 3] which sums to 6 ≤ 10.
●      The minimum divisor to make the sum less than or equal to the threshold is 2.
Sample Case 1
Sample Input
STDIN     Function
-----  	    --------
1      	     →  arr[] size n = 4
300069534  →  arr = [30069534]
827055253  →  threshold = 827055253

Sample Output
1
Explanation

●      Test a divisor 1 : arr = [30069534 ] which sums to 30069534  which is less than the threshold 827055253
●      The minimum divisor to make the sum less than or equal to the threshold is 1.
 */

import java.util.Arrays;

public class minimumDivisor {

        public static void main(String[] args) {
            int[] arr = {2, 4, 5};
            int threshold = 10;
            int result = minimumDivisor(arr, threshold);
            System.out.println(result);
        }

        public static int minimumDivisor(int[] arr, int threshold) {
            int left = 1, right = Arrays.stream(arr).max().getAsInt();
            while (left < right) {
                int mid = left + (right - left) / 2;
                int sum = calculateSum(arr, mid);
                if (sum > threshold) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }

        public static int calculateSum(int[] arr, int divisor) {
            int sum = 0;
            for (int num : arr) {
                sum += (num + divisor - 1) / divisor; // rounding up
            }
            return sum;
        }

}
