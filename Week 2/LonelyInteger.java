import java.util.Arrays;
//sort the array to find unique integer help with loop
// integer present in array is equal to i+1 so it is not integer if not equal so it is integer
public class LonelyInteger {

    public static int lonelyInteger(int[] ar){

        Arrays.sort(ar);
        for (int i=0; i<ar.length-2; i=i+2){
            if (ar[i]!=ar[i+1]){
                return ar[i];
            }
        }
        return ar[ar.length-1];
    }
    public static void main(String[] args)
    {
      int[] array;
      array= new int[]{1, 2, 3, 3, 1, 4, 5, 5, 4};
      int ans=lonelyInteger(array);
        System.out.println("Lonely Integer is:"+ans);
    }
}