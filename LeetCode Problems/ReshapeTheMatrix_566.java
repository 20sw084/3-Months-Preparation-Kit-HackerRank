package ToSolveLater;

import java.util.ArrayList;

public class ReshapeTheMatrix_566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int prev = mat.length + mat[0].length;
        if(prev != r+c){
            return mat;
        }
        ArrayList<Integer> allElements = new ArrayList();
        for(int[] nums : mat){
            for(int num : nums){
                allElements.add(num);
            }
        }
        int index = 0;
        int[][] newShape = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                newShape[i][j] = allElements.get(index++);
            }
        }

        return newShape;
    }
    public static void main(String[] args) {

    }
}