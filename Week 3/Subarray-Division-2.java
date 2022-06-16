import java.io.*;

class Result {
    public static String caesarCipher(String s, int k) {
    char[] chars=s.toCharArray();
    k=k%26;
    for(int i=0;i<s.length();i++){
        int a=(int)s.charAt(i);
        boolean up=Character.isUpperCase(s.charAt(i));
        if((a>64 && a<91) || (a>96 && a<123))
        a+=k;
        if(a>122 || (a>90 && a<95))
        a-=26;
        if(s.charAt(i)=='{') {
            a+=26;
        }
        char b=(char)a;
        if(up) {
            if(!Character.isUpperCase(b)) {
                a-=26;
                b=(char)a;
            }
        }
        else if(!up) {
            if(Character.isUpperCase(b)) {
                a+=26;
                b=(char)a;
            }
        }
        chars[i]=b;
    }    
    s="";
    for (int i = 0; i < chars.length; i++) {
            s+=chars[i];
    }
    return s;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
