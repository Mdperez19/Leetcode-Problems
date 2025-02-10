/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        
         /*
        k = 2
        [-1,-100,3,99]
         0   1  2 3 

         i + k mod length
         0 -> 2
         1 -> 3
         2 -> 0
         3 -> 1

        [ 3,99,-1,-100]
          0  1  2  3
         */

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i+k) % nums.length] = nums[i];
        }

        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
    }
}
// @lc code=end

