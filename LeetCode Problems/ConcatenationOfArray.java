//Task 1929
import java.util.Arrays;
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] num2 = new int[nums.length*2];
        int j=0;
        for (int i=0;i< num2.length;i++){
            num2[i] = nums[j];
            j++;
            if (j==nums.length){
                j=0;
            }
        }
        return num2;
    }

    public static void main(String[] args) {
        ConcatenationOfArray T1 = new ConcatenationOfArray();
        int[] array = {1,3,2,1};
        System.out.println(Arrays.toString(T1.getConcatenation(array)));
    }
}