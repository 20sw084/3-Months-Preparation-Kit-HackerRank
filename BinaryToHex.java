public class BinaryToHexadecimal {
    public static void main(String[] args) {
        String binary = "110101101011"; // Replace this with your binary string
        String hexadecimal = convertBinaryToHex(binary);
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hexadecimal);
    }

    public static String convertBinaryToHex(String binary) {
        // Ensure the length of the binary string is a multiple of 4
        int len = binary.length();
        int padLength = (len % 4 == 0) ? 0 : (4 - len % 4);
        StringBuilder paddedBinary = new StringBuilder();
        for (int i = 0; i < padLength; i++) {
            paddedBinary.append("0");
        }
        paddedBinary.append(binary);

        // Initialize a map for binary-to-hex conversion
        String[] binaryHexMap = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String[] hexChars = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        StringBuilder hexResult = new StringBuilder();
        for (int i = 0; i < paddedBinary.length(); i += 4) {
            String nibble = paddedBinary.substring(i, i + 4);
            int index = java.util.Arrays.asList(binaryHexMap).indexOf(nibble);
            hexResult.append(hexChars[index]);
        }

        return hexResult.toString();
    }
}
