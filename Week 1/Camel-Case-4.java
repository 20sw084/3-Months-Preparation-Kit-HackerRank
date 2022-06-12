import java.util.*;
public class Solution {

    public static void main(String[] args) {
        // for(int i=0;i<args.length;i++){
            Scanner sc=new Scanner(System.in);
            
           while (sc.hasNextLine()) {
               String arg=sc.nextLine();
                   String[] s=arg.split(";");
            // String[] s=args[i].split(";");
            if(s[0].equals("S")){
                if(s[1].equals("M")){
                    String str=s[2].substring(0,s[2].length()-2);
                    for(int k=0;k<str.length();k++){
                        if(isUpper(str.charAt(k))){
                            System.out.print(" "+Character.toLowerCase(str.charAt(k)));
                        }
                        else{
                            System.out.print(str.charAt(k));
                        }
                    }
                    System.out.println();
                }
                else if(s[1].equals("V")){
                    char[] chars = s[2].toCharArray();
                    for(int k=0;k<chars.length;k++){
                        if(isUpper(chars[k])){
                            System.out.print(" "+Character.toLowerCase(chars[k]));
                        }
                        else{
                            System.out.print(chars[k]);
                        }
                    }
                    System.out.println();
                }
                else if(s[1].equals("C")){
                    char[] sp=s[2].toCharArray();
                    for(int i=0;i<sp.length;i++) {
                        if(isUpper(sp[i]) && i>0){
                            System.out.print(" ");
                        }
                    System.out.print(Character.toLowerCase(sp[i]));
                    }
                    System.out.println();
                }
            }
            else if(s[0].equals("C")){
                if(s[1].equals("M")){
                    String[] a=s[2].split(" ");
                    for(int k=0;k<a.length;k++){
                        if(k==0)
                        System.out.print(a[k].toLowerCase());
                        else{
                        System.out.print(Character.toUpperCase(a[k].charAt(0)));
                        for(int i=1;i<a[k].length();i++){
                           System.out.print(a[k].charAt(i)); 
                        }
                        }
                    }
                    System.out.println("()");
                }
                else if(s[1].equals("V")){
                    String[] a=s[2].split(" ");
                    for(int k=0;k<a.length;k++){
                        if(k==0)
                        System.out.print(a[k].toLowerCase());
                        else{
                        System.out.print(Character.toUpperCase(a[k].charAt(0)));
                        for(int i=1;i<a[k].length();i++){
                           System.out.print(a[k].charAt(i)); 
                        }
                        }
                    }
                    System.out.println();
                }
                else if(s[1].equals("C")){
                    String[] a=s[2].split(" ");
                    for(int k=0;k<a.length;k++){                       
                        System.out.print(Character.toUpperCase(a[k].charAt(0)));
                        for(int i=1;i<a[k].length();i++){
                           System.out.print(a[k].charAt(i)); 
                        }
                    }
                    System.out.println();
                }
            }
            }
        }
static boolean isUpper(char ch)
{
    if (ch >= 'A' && ch <= 'Z')
        return true;
    else if (ch >= 'a' && ch <= 'z')
        return false;         
return false;             
}
    }
