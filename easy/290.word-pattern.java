/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> mapPattern = new HashMap<>();

        String[] words = s.split(" ");

        if(pattern.length() !=words.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {

            char letter = pattern.charAt(i);
            
            if(mapPattern.containsKey(letter)){

                if(!mapPattern.get(letter).equals(words[i]))
                    return false;

            }else if(mapPattern.containsValue(words[i])){
                return false;
            }
            else 
                mapPattern.put(letter, words[i]);
        }

        return true;
        
    }
}
// @lc code=end

