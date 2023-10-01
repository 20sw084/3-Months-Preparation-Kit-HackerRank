import java.io.*;
 class Result 
 {
    public static int superDigit(String n, long k) {
     long num = 0; 
        for(int i=0; i<n.length(); i++) 
        {
            num += Integer.parseInt(n.charAt(i)+"");
        } 
        num =  fun(num*k);
        int p = (int) num;
        return fun(p);}

    private static int fun(long p) 
    {
        if (p<10)
        return (int) p;    
        return fun(fun(p/10)+p%10);    
    }

 }

 public class Solution
 {
    public static void main(String[] args) throws IOException 
    {
        Scanner s=new Scanner(System.in);  
        String[] firstMultipleInput =s.nextLine().replaceAll("\\s+$", "").split(" ");
        String n = firstMultipleInput[0];
        int k = Integer.parseInt(firstMultipleInput[1]);
        int result = Result.superDigit(n, k);
        System.out.println((String.valueOf(result)));
        s.close();
    } 

 }