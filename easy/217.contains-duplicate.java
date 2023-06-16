/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */
//import java.util.*;
// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNumbers = new HashSet<>();

        for(int num: nums){
            if(setNumbers.contains(num))
                return true;
            setNumbers.add(num);
        }
        return false;
    }
}
// @lc code=end

