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
        List<Set<Character>> rows = new ArrayList<>(9);
        List<Set<Character>> columns = new ArrayList<>(9);
        List<Set<Character>> boxes = new ArrayList<>(9);

        for (int i = 0; i < board.length; i++) {
            rows.add(new HashSet<>());
            columns.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if(board[i][j] == '.')
                    continue;              

                if(!rows.get(i).contains(board[i][j])){
                    rows.get(i).add(board[i][j]);
                }
                else{
                    return false;
                }

                if(!columns.get(j).contains(board[i][j])){
                    columns.get(j).add(board[i][j]);
                }
                else{
                    return false;
                }

                if(i>=0 && i<3 && j>=0 && j<3){
                    if(!boxes.get(0).contains(board[i][j])){
                        boxes.get(0).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=0 && i<3 && j>=3 && j<6){
                    if(!boxes.get(1).contains(board[i][j])){
                        boxes.get(1).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=0 && i<3 && j>=6 && j<9){
                    if(!boxes.get(2).contains(board[i][j])){
                        boxes.get(2).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=3 && i<6 && j>=0 && j<3){
                    if(!boxes.get(3).contains(board[i][j])){
                        boxes.get(3).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=3 && i<6 && j>=3 && j<6){
                    if(!boxes.get(4).contains(board[i][j])){
                        boxes.get(4).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=3 && i<6 && j>=6 && j<9){
                    if(!boxes.get(5).contains(board[i][j])){
                        boxes.get(5).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=6 && i<9 && j>=0 && j<3){
                    if(!boxes.get(6).contains(board[i][j])){
                        boxes.get(6).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=6 && i<9 && j>=3 && j<6){
                    if(!boxes.get(7).contains(board[i][j])){
                        boxes.get(7).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }

                if(i>=6 && i<9 && j>=6 && j<9){
                    if(!boxes.get(8).contains(board[i][j])){
                        boxes.get(8).add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return isValid;
    }
}
// @lc code=end

