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
        
        int digit = 1;
        int result = 0;
        
        while(digit>0){
            digit = n % 10;
            result += operations[digit];
            n = n/10;
        }

        if(!results.add(result))
            return false;

        return isHappy(result);
    }
}
// @lc code=end

