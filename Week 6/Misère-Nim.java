import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws java.lang.Exception {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int k1 = sc.nextInt();
      int l1 = 0;
      int max = 0;
      while (k1-- > 0) {
        int p = sc.nextInt();
        l1 ^= p;
        max = Math.max(max, p);
      }
      System.out.println((l1 == 0 && max > 1 || l1 == 1 && max == 1) ? "Second" : "First");
    }
  }

}