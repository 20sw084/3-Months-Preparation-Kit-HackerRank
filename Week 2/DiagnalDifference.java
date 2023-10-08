import java.util.Scanner;


public class DiagnalDifference {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[][] array=new int[3][];
        int col;
        System.out.println("Enter Elements...");
        for (int i=0;i< array.length;i++){
            array[i]=new int[3];
            for (int j=0;j< array[i].length;j++){
                array[i][j]=input.nextInt();
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        int leftRightSum=0;
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (i==j){
                    leftRightSum+=array[i][j];
                    break;
                }
            }
        }

        int rightLeftSum=0;
        int reverseIndex=array[0].length-1;
        for (int i=0;i<array.length;i++){

            for (int j=array[i].length-1;j>=0;j--){

                if (reverseIndex==j){
                    rightLeftSum+=array[i][j];
                    reverseIndex--;
                    break;
                }
            }
        }


        System.out.println("Digonal sum from left to right:\t"+leftRightSum);
        System.out.println("Digonal sum from right to left:\t"+rightLeftSum);



        int diagonalDifference=leftRightSum-rightLeftSum;
        int absoluteValue=Math.abs(diagonalDifference);

        System.out.println("Diagonal Difference is:\t"+absoluteValue);





    }
}
