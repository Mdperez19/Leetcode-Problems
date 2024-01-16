/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */


// @lc code=start
class Solution {
    public int mySqrt(int x) {
        
        int l = 0, r = x;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            long pow = (long) m*m;
            if (pow == (long) x)
                return m;
            if (pow < x)
                l = m + 1;
            else
                r = m - 1;
        }
 
        return r;
    }
}
// @lc code=end

