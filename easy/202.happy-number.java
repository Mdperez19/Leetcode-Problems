/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */
import java.util.*;
// @lc code=start
class Solution {
    Set<Integer> results = new HashSet<>();
    int[] operations = {0,1,4,9,16,25,36,49,64,81};
    public boolean isHappy(int n) {

        if(n == 1)
            return true;
        
        char[] digits = String.valueOf(n).toCharArray();

        int result = 0;
        for (char c : digits) {
            result += operations[c - '0'];
        }

        if(!results.add(result))
            return false;

        return isHappy(result);
    }
}
// @lc code=end

