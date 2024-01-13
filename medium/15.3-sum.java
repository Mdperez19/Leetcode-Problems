
/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
import java.util.*;

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        if (nums.length < 3)
            return triplets;

        else if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0)
                return List.of(Arrays.asList(nums[0], nums[1], nums[2]));
            else
                return triplets;
        }

        Arrays.sort(nums);

        

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {

                int threeSum = nums[i] + nums[left] + nums[right];
                if (threeSum > 0)
                    right--;
                else if (threeSum < 0)
                    left++;
                else {
                    triplets.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                        )
                    );
                    left++;

                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }

            }
        }

        return triplets;
    }
}
// @lc code=end
