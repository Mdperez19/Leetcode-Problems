/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;

        int[] characters = new int[26];

        for(int i=0; i < s.length(); i++){
            characters[s.charAt(i) % 26]++;
            characters[t.charAt(i) % 26]--;
        }

        for(int i=0; i < characters.length; i++){
            if(characters[i] != 0)
                return false;
        }

        return true;
    }
}
// @lc code=end

/*
 r c

 r c t
  
 */

