//Maximum Product Subarray Problem

package arrays;

public class MaximumProductSubarray {

	public static void main(String[] args) {
				// sample input
				int array[] = {5, -6, -6, -5, 7, 10, 8, -6, -2, 0};
				
				//printing the output
				System.out.println("Maximum subarray sum is " + maxProduct(array));

	}
	public static int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1, suffix = 1, max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
        	//if there is any 0 found in the array, assign prefix and suffix to one
            if(prefix == 0) prefix = 1; 
            if(suffix == 0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }
}

//Time Complexity - O(n)
//Space Complexity - O(1)
