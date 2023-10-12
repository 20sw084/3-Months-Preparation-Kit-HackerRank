package strings;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> character = new Stack<>();
    for(int i =0; i<s.length();i++){
        Character cur = s.charAt(i);
        if(cur == '(' || cur == '[' || cur == '{'){
            character.push(cur);
        }
        else{
            if(character.isEmpty()){
                return "NO";
            }
            else if(!isMatching(character.peek(), cur)){
                return "NO";
            }
            else{
                character.pop();
            }
        }
    }
    if(character.isEmpty()) return "YES";
    else return "NO";

    }
    
    static boolean isMatching(char a, char b){
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }

}

public class BalancedBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);
                System.out.println(result);

//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
       // bufferedWriter.close();
    }
}

