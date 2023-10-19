package HARD_Problems;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_51 {
    /*
    Runtime
2 ms
Beats
95.42%
Memory
42.6 MB
Beats
80.16%
     */
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                board[i][k] = '.';
            }
        }
        solveQueen(0, board, list, n);
        return list;
    }
    private static void solveQueen(int col, char[][] chessBoard, List<List<String>> ans, int n){
        if(col == n){
            List<String> innerList = new ArrayList();
            for(char[] chars : chessBoard){
                innerList.add(String.valueOf(chars));
            }
            ans.add(innerList);
            return;
        }
        for(int row = 0; row < n; row++){
            if(isValid(row, col, chessBoard)){
                chessBoard[row][col] = 'Q';
                solveQueen(col+1, chessBoard, ans, n);
                chessBoard[row][col] = '.';
            }
        }
    }
    private static boolean isValid(int row, int col, char[][] chessBoard){
        int rowDup = row;
        int colDup = col;
        while(row >= 0 && col >= 0){
            if(chessBoard[row][col] == 'Q') return false;
            row--; col--;
        }
        row = rowDup;
        col = colDup;
        while(col >= 0){
            if(chessBoard[row][col] == 'Q') return false;
            col--;
        }
        row = rowDup;
        col = colDup;
        while(row < chessBoard.length && col >= 0){
            if(chessBoard[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
}
