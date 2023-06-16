/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> restoMap = new HashMap<>();
        int respuesta[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int resto = target - nums[i];
            if(restoMap.containsKey(resto)){
                respuesta[0] = i;
                respuesta[1] = restoMap.get(resto);
                return respuesta;
            }
            restoMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
// @lc code=end

