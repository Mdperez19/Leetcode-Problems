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

        List<Character> sCharacters = s.chars()
                                        .mapToObj(i -> (char) i)
                                        .collect(Collectors.toList());

        List<Character> tCharacters = t.chars()
                                        .mapToObj(i -> (char) i)
                                        .collect(Collectors.toList());

        sCharacters.sort(Comparator.naturalOrder());
        tCharacters.sort(Comparator.naturalOrder());

        System.out.println(sCharacters);
        System.out.println(tCharacters);
        
        return sCharacters.equals(tCharacters);

    }
}
// @lc code=end

