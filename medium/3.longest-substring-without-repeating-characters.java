/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */
import java.util.HashSet;
import java.util.Set;
import java.lang.Math;

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> characters = new HashSet<>();

        int left = 0, right = 0;

        while(right < s.length()){
            char currentChar = s.charAt(right);
            if(!characters.contains(currentChar)){
                characters.add(currentChar);
                result = Math.max(result, right-left+1);
                right++;
            }else{
                characters.remove(s.charAt(left++));
            }
        }
        return result;
    }
}
// @lc code=end

