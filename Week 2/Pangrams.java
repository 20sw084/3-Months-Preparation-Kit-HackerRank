import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String pangrams(String s) {
        char[] str=s.toCharArray();
        int[] arr=new int[26];
    for(int i=0;i<arr.length;i++){
        arr[i]=0;
    }
    for(int i=0;i<str.length;i++){
        if(Character.isUpperCase(str[i]))
        {
        for(int j=65;j<91;j++){
            if(str[i]==(char)j){
                arr[j-65]++;
                break;
            }
        }
        }
        if(Character.isLowerCase(str[i]))
        {
        for(int j=97;j<123;j++){
            if(str[i]==(char)j){
                arr[j-97]++;
                break;
            }
        }
        }
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0)
            count++;
    }
    return (count==26?"pangram":"not pangram");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
