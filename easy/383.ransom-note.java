/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> lettersFromMagazineMap = new HashMap<>();
        int numberOfLettersInNote = ransomNote.length();

        for (int i = 0; i < magazine.length(); i++) {
            char curentLetter = magazine.charAt(i);
            lettersFromMagazineMap.put(
                curentLetter, 
                lettersFromMagazineMap.getOrDefault(curentLetter, 0) + 1
            );
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char curentLetter = ransomNote.charAt(i);

            if(lettersFromMagazineMap.containsKey(curentLetter)){

                if(lettersFromMagazineMap.get(curentLetter) == 0)
                    return false;
                
                lettersFromMagazineMap.computeIfPresent(
                    curentLetter, 
                    (key, value) -> value-1
                );

                numberOfLettersInNote--;
            }
        }

        return numberOfLettersInNote == 0 ? true: false;
    }
}
// @lc code=end

