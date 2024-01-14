/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

import java.util.*;

// @lc code=start
class Solution {

    public void backTrack(int digitIndex, 
                        String combination, 
                        String digits, 
                        List<String> combinationsResult, 
                        Map<Character, List<String>> numberToChars){
        if(combination.length() == digits.length()){
            combinationsResult.add(combination);
            return;
        }

        for (int i = 0; i < numberToChars.get(digits.charAt(digitIndex)).size(); i++) {
            backTrack(
                digitIndex + 1, 
                combination + numberToChars.get(digits.charAt(digitIndex)).get(i), 
                digits, 
                combinationsResult,
                numberToChars
            );
        }

    }

    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty())
            return List.of();

        Map<Character, List<String>> numberToChars = new HashMap<>(8);

        numberToChars.put('2', List.of("a", "b", "c"));
        numberToChars.put('4', List.of("g", "h", "i"));
        numberToChars.put('3', List.of("d", "e", "f"));
        numberToChars.put('5', List.of("j", "k", "l"));
        numberToChars.put('6', List.of("m", "n", "o"));
        numberToChars.put('7', List.of("p", "q", "r", "s"));
        numberToChars.put('8', List.of("t", "u", "v"));
        numberToChars.put('9', List.of("w", "x", "y", "z"));

        int digitsLength = digits.length();
        if(digitsLength == 1)
            return numberToChars.get(digits.charAt(0));

        List<String> combinations = new ArrayList<>();

        backTrack(0, "", digits, combinations, numberToChars);

        return combinations;
    }
}
// @lc code=end

