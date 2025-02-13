/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        s = s.toLowerCase();

        while (left < right) {

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            
            if(s.charAt(left) ==s.charAt(right)){
                left++;
                right--;
            }else
                return false;
        }

        return true;
    }
}
// @lc code=end

