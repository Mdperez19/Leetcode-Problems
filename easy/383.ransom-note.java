/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> lettersFromNoteMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char currentLetter = ransomNote.charAt(i);
            lettersFromNoteMap.put(
                currentLetter, 
                lettersFromNoteMap.getOrDefault(currentLetter, 0) + 1
            );
        }

        for (int i = 0; i < magazine.length(); i++) {

            char currentLetter = magazine.charAt(i);

            if(lettersFromNoteMap.containsKey(currentLetter)){
                lettersFromNoteMap.compute(currentLetter, 
                    (key,value) -> value - 1
                );

                if(lettersFromNoteMap.get(currentLetter) == 0)
                    lettersFromNoteMap.remove(currentLetter);

                if(lettersFromNoteMap.isEmpty())
                    return true;
            }

            
        }

        return false;
    }
}
// @lc code=end

