/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }
        
        int anterior = 0;
        int minPrice = prices[0];
        
        for (int i = 1; i < n; i++) {
            anterior = Math.max(anterior, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        
        return anterior;
    }
    
}
// @lc code=end

