/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int size = 0;
        boolean flagNonSpace = false;
        for (int i = s.length()-1; i >=0; i--) {
            if(s.charAt(i) == ' ' && flagNonSpace)
                break;
            else if (s.charAt(i) == ' ') {
                continue;
            }
            else
                flagNonSpace = true;
            size++;
        }
        return size;
    }
}
// @lc code=end

