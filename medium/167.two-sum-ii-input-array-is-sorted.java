/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */
import java.util.*;
// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            result[0] = i;
            result[1] = Arrays.binarySearch(numbers, i+1, numbers.length,  target - numbers[i] );

            if(result[1] > 0){
                result[0]++;
                result[1]++;
                break;
            }
        }


        return result;
    }
}
// @lc code=end

