import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the input string to a character array
        char[] inputString = input.toCharArray();

        // Display the original string
        System.out.println("Original String: " + input);

        // Reverse the string using the reverseString method
        reverseString(inputString);

        // Display the reversed string
        System.out.println("Reversed String: " + String.valueOf(inputString));

        // Close the scanner
        scanner.close();
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        //iterating through the string
        while (start < end) {
            //this is a temporary variable for swapping the letters in the string one by one
            char c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
    }
}
