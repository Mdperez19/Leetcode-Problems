/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */
import java.util.*;
// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {

        int maxCount = 0;
        Set<Integer> uniqueNumbersSet = new HashSet<>();

        for (int num : nums) {
            uniqueNumbersSet.add(num);
            
        }
       for (int num : uniqueNumbersSet) {
            // It's the first number in a sequence
            if(!uniqueNumbersSet.contains(num-1)){
                int count = 1;
                int current = num;
                while (uniqueNumbersSet.contains(current+1)) {
                    count++;
                    current++;
                }
                maxCount = Integer.max(maxCount, count);
            }
       }

        return maxCount;
    }
}
// @lc code=end

