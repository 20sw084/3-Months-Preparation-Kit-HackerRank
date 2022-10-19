package LeetcodeFirstMonth;

public class ShuffleTheArray_1470 {
   
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        int m = 0;
        while(index != nums.length){
                ans[index++] = nums[m++];
                ans[index++] = nums[n++];
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}