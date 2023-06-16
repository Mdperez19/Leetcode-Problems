/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> parentheses = new HashMap<>();

        parentheses.put('(', ')');
        parentheses.put('{', '}');
        parentheses.put('[' , ']');

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char currentCharacter = s.charAt(i);
            if(parentheses.containsKey(s.charAt(i))){
                stack.push(currentCharacter);
            }else if(!stack.isEmpty()){
                char characterInStack = stack.peek();
                if(parentheses.get(characterInStack) == currentCharacter)
                    stack.pop();
                else
                    return false;
            }else
                return false;
        }
        
        return stack.isEmpty();
    }
}
// @lc code=end

