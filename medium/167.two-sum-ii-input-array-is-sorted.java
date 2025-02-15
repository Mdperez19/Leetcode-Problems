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

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int possibleResult = numbers[left] + numbers[right];

            if(possibleResult == target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            } else if (possibleResult > target){
                left++;
            } else{
                right--;
            }
        }


        return result;
    }
}
// @lc code=end

