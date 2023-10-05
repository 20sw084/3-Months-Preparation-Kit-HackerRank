import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ice_cream_parlour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t;i++){
            int m = sc.nextInt(); //money
             int n = sc.nextInt(); //no of flavours
             int arr[] = new int[n];
                 for(int j =0; j<n;j++){
                 arr[j]= sc.nextInt();
                  }
            
                 for(int j=0;j<n;j++){
                     for(int k =j+1; k<n;k++){
                         if(arr[j]+arr[k]==m){
                          System.out.println((j+1)+" "+(k+1)); 
                          }
                     }
                 }  
            
        }
}
}
