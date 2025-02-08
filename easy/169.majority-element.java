/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */
import java.util.*;
// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] majority = {nums[0], 1};

        for (int i = 1; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);

                if(map.get(nums[i]) >= majority[1]){
                    majority[0] = nums[i];
                    majority[1] = map.get(nums[i]);
                }
            }
        }
        return majority[0];
    }
}
// @lc code=end

