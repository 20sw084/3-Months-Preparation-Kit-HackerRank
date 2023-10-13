/*
    Problem Statement:-
    Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

    E.g. :
    given array = [ [1 , 2 , 3]                 
                    [4 , 5 , 6]
                    [7 , 8 , 9] ]

    output = [1,2,4,7,5,3,6,8,9]
*/


class DiagonalTraversalOf2Darray 
{
    public static int[] findDiagonalOrder(int[][] mat)
    {
        if (mat.length == 0) return new int[0];
        
        int r = 0, c = 0, m = mat.length, n = mat[0].length, arr[] = new int[m * n];
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = mat[r][c];
            
            if ((r + c) % 2 == 0) 
            { 
                // moving up
                
                if  (c == n - 1) { r++; } // if reached any cell in the last col then simply move to the next row
                
                else if (r == 0) { c++; } // if reached any cell in the first row then simply move to the next col
                
                else { r--; c++; } // any cell in between
            } 
            
            else 
            {                
                // moving down
                
                if (r == m - 1) { c++; } // if reached any cell in the last row then simply move to the next col
                
                else if (c == 0) { r++; } // if reahed any cell in the first col then move to the next row
                
                else  { r++; c--; } // any cell in between
            }
            
        }   
        return arr;
    }


    public static void main(String[] args)
    {
        int[][] mat={{1,2,3} , {4,5,6} , {7,8,9} };

        int[] ans= findDiagonalOrder(mat);

        System.out.print("The diagonal traversal of given 2-D array is: [");
        for(int i=0;i<ans.length;i++)
        {
            if(i==ans.length-1) System.out.print(ans[i]);
            else System.out.print(ans[i] + " , ");
        }
        System.out.print("]");
    }
}