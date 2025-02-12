/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */
import java.util.*;
// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        boolean isValid = true;
      
        Set<String> seenInSet = new HashSet<>();
        

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                
                char number = board[i][j];

                if(number == '.')
                    continue;

                String seenInRow = "row "+ i + " " + number;
                String seenInColumn = "column "+ j + " " + number;
                String seenInBox = "box "+ i/3 + "," + j/3 + " " +number;

                if(seenInSet.contains(seenInRow) || seenInSet.contains(seenInColumn) || seenInSet.contains(seenInBox)){
                    return false;
                }else{
                    seenInSet.add(seenInRow);
                    seenInSet.add(seenInRow);
                    seenInSet.add(seenInRow);
                }
            
            }
            
        }
        return isValid;
    }
}
// @lc code=end

