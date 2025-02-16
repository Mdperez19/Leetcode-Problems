/*
 * @lc app=leetcode id=2706 lang=java
 *
 * [2706] Buy Two Chocolates
 */

// @lc code=start
class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int sumTwoChocolates = 0;

        int minNumber = Integer.MAX_VALUE;
        int secondMinNumber = Integer.MAX_VALUE-1;

        for (int i = 0; i < prices.length; i++) {
            
            if(prices[i] < minNumber){
                secondMinNumber = minNumber;
                minNumber = prices[i];
            } else if(prices[i] < secondMinNumber){
                secondMinNumber = prices[i];
            }
        }

        sumTwoChocolates = minNumber + secondMinNumber;

        return money - sumTwoChocolates >=0 ? money - sumTwoChocolates: money;
    }
}
// @lc code=end

