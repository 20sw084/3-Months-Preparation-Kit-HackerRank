package LeetcodeFirstMonth;

public class GoalParserIntrepretation_1678 {

//    Runtime: 2 ms, faster than 34.50% of Java online submissions for Goal Parser Interpretation.
//    Memory Usage: 41.9 MB, less than 64.49% of Java online submissions for Goal Parser Interpretation.

    public static String parseCommand(String command){
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == ')'){
                if(command.charAt(i-1) == 'l'){
                    command = command.replace(command.substring(i-3, i+1), "al");
                }
                else{
                    command = command.replace(command.substring(i-1, i+1), "o");
                }
            }
        }
        return command;
    }

    //Interesting Code snippet
//    class Solution {
//        public String interpret(String command) {
//            return command.replace("()","o").replace("(al)","al");
//        }
//    }

    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(parseCommand(command));
    }
}
