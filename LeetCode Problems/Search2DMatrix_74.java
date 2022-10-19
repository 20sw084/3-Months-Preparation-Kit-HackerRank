package LeetcodeFirstMonth;

public class Search2DMatrix_74 {
   
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] matri : matrix){
            for(int num : matri){
                if(num == target){
                    return true;
                }
            } }
        return false;
    }

    //Binary Search on 2D Matrix
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int start = 0, rows = matrix.length, cols = matrix[0].length;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            }
            if (matrix[mid / cols][mid % cols] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
        public static void main(String[] args) {

    }
}