import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int minimumNumber(int n, String password) {
    int min=0;
    int up=0,lo=0,sp=0,nr=0;
    for(int i=0;i<n;i++){
    if("abcdefghijklmnopqrstuvwxyz".contains(String.valueOf(password.charAt(i)))) lo++;
    if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(String.valueOf(password.charAt(i)))) up++;
    if("!@#$%^&*()-+".contains(String.valueOf(password.charAt(i)))) sp++;
    if("0123456789".contains(String.valueOf(password.charAt(i)))) nr++;
    }
    int slots=0;
    if(up==0) min++;
    if(lo==0) min++;
    if(nr==0) min++;
    if(sp==0) min++;
    if(n<6)
    {
        slots=6-n;
        if(slots>3){
            min=6-n;
        }
        else{
            slots-=min;
            if(slots>0){
                min+=slots;
            }
        }
    }
    return min;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
