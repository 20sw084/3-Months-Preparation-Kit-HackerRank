import java.util.*;
public class SubArray {
    public static int solution(int[] nums) {

        int maxSum = nums[0];

        // if the size is 1, there is only 1 subarray
        if (nums.length == 1) {
            return nums[0];
        }


        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            // if the current element is greater than the addition we did, we have to use it in order to get max sum
            if (nums[i] > sum) {
                sum = nums[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }


        return maxSum;
    }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] nums = new int[size];

            for(int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.print(solution(nums));
        }
    }

