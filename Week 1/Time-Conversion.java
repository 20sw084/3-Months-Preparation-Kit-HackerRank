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
    public static String timeConversion(String s) {
        String[] split=s.split(":");
        if(split[2].contains("PM")){
            int h=Integer.parseInt(split[0]);
            if(h!=12){
            h+=12;
            split[0]=String.valueOf(h);
            }
        }
        if(split[2].contains("AM")){
            int h=Integer.parseInt(split[0]);
            if(h>=12){   
            h-=12;
            split[0]=String.valueOf(h);
            if(h<10)
                split[0]="0"+split[0];
            }
        }
        String secs=split[2].substring(0,2);
        return split[0]+":"+split[1]+":"+secs;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
