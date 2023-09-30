import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int entries = scanner.nextInt();
            List<StringBuilder> freqs = new ArrayList<>();

            for (int i = 0; i < entries; i++) {
                int idx = scanner.nextInt();
                String word = scanner.next();

                if (freqs.size() <= idx) {
                    while (freqs.size() <= idx) {
                        freqs.add(new StringBuilder());
                    }
                }

                StringBuilder currentFreq = freqs.get(idx);

                if (i < entries / 2) {
                    if (currentFreq.length() > 0) {
                        currentFreq.append(" -");
                    } else {
                        currentFreq.append("-");
                    }
                } else {
                    if (currentFreq.length() > 0) {
                        currentFreq.append(" ");
                    }
                    currentFreq.append(word);
                }
            }

            for (StringBuilder freq : freqs) {
                if (freq.length() > 0) {
                    System.out.print(freq.toString() + " ");
                }
            }
            System.out.println();
        }
    }
}
