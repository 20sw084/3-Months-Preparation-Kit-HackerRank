public class Main {

    static void minMaxSum(int[] nums){
        int min=nums[0];
        int max=nums[0];
        int totalSum=0;

        for (int n : nums){
            totalSum+=n;
            if (n<min)
                min=n;
            if (n>max)
                max=n;
        }
        System.out.println("Min Sum:" + (totalSum-max) +"\nMax Sum:"+(totalSum-min));
    }
    public static void main(String[] args) {
int array[];
array= new int[]{1, 3, 5, 7, 9};
        Main.minMaxSum(array);
    }
}