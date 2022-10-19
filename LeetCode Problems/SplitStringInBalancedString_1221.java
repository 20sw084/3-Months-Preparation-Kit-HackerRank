package LeetcodeFirstMonth;

public class SplitStringInBalancedString_1221 {

    public static int splitString(String balancedString){
        int maxNoOfSplittedStrings = 0;
        int left = 0, right = 0;
        for (int i = 0; i < balancedString.length(); i++) {
            if(balancedString.charAt(i) == 'L'){
                left++;
            }
            else {
                right++;
            }
            if(left == right){
                maxNoOfSplittedStrings++;
            }
        }
        return maxNoOfSplittedStrings;
    }
    public static void main(String[] args) {
        String balancedString = "LRLRLLLRRRLR";
        System.out.println(splitString(balancedString));
    }
}