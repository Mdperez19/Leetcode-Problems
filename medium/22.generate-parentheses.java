/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */
import java.util.*;

// @lc code=start
class Solution {

    public void backTrack(List<String> parenthesesListResult,
                    String currentList,
                    int left, int right, 
                    int n){
           
        if(currentList.length() == n*2){
            parenthesesListResult.add(currentList);
            return;
        }

        if(left<n)
            backTrack(parenthesesListResult, currentList + "(",left+1, right, n);

        if(right<left)
            backTrack(parenthesesListResult, currentList + ")",left, right+1, n);
    }

    public List<String> generateParenthesis(int n) {
        List<String> parenthesesListResult = new ArrayList<>(n*2);

        backTrack(parenthesesListResult, "(", 1, 0, n);
        return parenthesesListResult;
    }
}
// @lc code=end

