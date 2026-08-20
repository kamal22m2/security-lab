public class HillCipher {

    // 2 x 2 Key Matrix
    private static final int[][] KEY = {
        {3, 3},
        {2, 5}
    };

    // Encryption method
    public static String encrypt(String text) {

        // Convert to uppercase and remove spaces
        text = text.toUpperCase().replace(" ", "");

        // If length is odd, add X
        if (text.length() % 2 != 0) {
            text += "X";
        }

        StringBuilder result = new StringBuilder();

        // Process two letters at a time
        for (int i = 0; i < text.length(); i += 2) {

            // Convert letters to numbers
            int letter1 = text.charAt(i) - 'A';
            int letter2 = text.charAt(i + 1) - 'A';

            // Hill Cipher calculation
            int encryptNum1 =
                    (KEY[0][0] * letter1 + KEY[0][1] * letter2) % 26;

            int encryptNum2 =
                    (KEY[1][0] * letter1 + KEY[1][1] * letter2) % 26;

            // Convert numbers back to letters
            result.append((char) (encryptNum1 + 'A'));
            result.append((char) (encryptNum2 + 'A'));
        }

        return result.toString();
    }

    // Main method
    public static void main(String[] args) {

        String message = "GATE";

        String encrypted = encrypt(message);

        System.out.println("Original: " + message);
        System.out.println("Hill Encrypted: " + encrypted);
    }
}
