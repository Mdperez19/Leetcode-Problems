/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder commonPrefix = new StringBuilder();

        List<String> strings = new ArrayList<>(Arrays.asList(strs));

        strings.sort(Comparator.comparing(String::length));

        
        for(int i = 0; i< strings.get(0).length(); i++){
            char currentCharacter = strings.get(0).charAt(i);
            for(String string : strings){
                if(string.charAt(i) !=currentCharacter)
                    return commonPrefix.toString();
            }
            commonPrefix.append(currentCharacter);
        }

        return commonPrefix.toString();
    }
}
// @lc code=end

