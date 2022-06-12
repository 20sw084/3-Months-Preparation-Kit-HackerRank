import java.io.*;
class Result {
    public static int marsExploration(String s) {
        char[] str=s.toCharArray();
        int changed=0;
     for(int i=0;i<str.length;i+=3){
         if(str[i]=='S'){}
         else {changed++;}
          if(str[i+1]=='O'){}
         else {changed++;}
          if(str[i+2]=='S'){}
         else {changed++;}
     }
     return changed;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
