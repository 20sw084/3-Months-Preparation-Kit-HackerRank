package LeetcodeFirstMonth;

public class MaximumNestingDepthOfTheParenthesis_1614 {

    /*
    Runtime: 2 ms, faster than 28.30% of Java online submissions for Maximum Nesting Depth of the Parentheses.
Memory Usage: 42.3 MB, less than 33.63% of Java online submissions for Maximum Nesting Depth of the Parentheses.
     */

    // By declaring i variable before loop
    /*
    Runtime: 1 ms, faster than 86.48% of Java online submissions for Maximum Nesting Depth of the Parentheses.
Memory Usage: 42.3 MB, less than 33.63% of Java online submissions for Maximum Nesting Depth of the Parentheses.
     */
    public static int maxDepth(String VPString){
        int maxDepth = 0, count = 0, i;
        for (i = 0; i < VPString.length(); i++) {
            if(VPString.charAt(i) == '('){
                count++;
            }
            else if(VPString.charAt(i) == ')'){
                count--;
            }
            maxDepth = (maxDepth > count) ? maxDepth : count;
        }

        return maxDepth;
    }
    public static void main(String[] args) {
        String VPString = "()()(3434* (34) + ( (422) - 22 ) )";
        System.out.println(maxDepth(VPString));
    }
}
