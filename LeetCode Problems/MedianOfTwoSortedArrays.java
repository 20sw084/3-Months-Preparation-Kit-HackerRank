package ToSolveLater;

public class MedianOfTwoSortedArrays {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] newArray = new int[nums1.length + nums2.length];
            int n = 0, m = 0, index = 0;
            while(n != nums1.length && m != nums2.length){
                if(nums1[n] < nums2[m]){
                    newArray[index++] = nums1[n++];
                }
                else {
                    newArray[index++] = nums2[m++];
                }
            }
            while(n != nums1.length){
                newArray[index++] = nums1[n++];
            }
            while(m != nums2.length){
                newArray[index++] = nums2[m++];
            }
            if(newArray.length % 2 == 0){
                System.out.println( newArray[newArray.length/2 - 1]  + " " +  newArray[newArray.length/2] );
                double median = ( newArray[newArray.length/2 - 1] + newArray[newArray.length/2] );
                return median/2;
            }
            else {
                return newArray[newArray.length/2];
            }
        }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5, 13};
        int[] num2 = {6,7,8,9, 10,11};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}