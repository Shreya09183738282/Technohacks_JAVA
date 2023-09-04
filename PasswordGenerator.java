import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) {
        int length = 12; // Default password length
        boolean useUpperCase = true;
        boolean useLowerCase = true;
        boolean useDigits = true;
        boolean useSpecialChars = true;

        // You can customize the options based on user input

        String password = generatePassword(length, useUpperCase, useLowerCase, useDigits, useSpecialChars);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, boolean useUpperCase, boolean useLowerCase, boolean useDigits, boolean useSpecialChars) {
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        StringBuilder validChars = new StringBuilder();
        if (useUpperCase) validChars.append(upperChars);
        if (useLowerCase) validChars.append(lowerChars);
        if (useDigits) validChars.append(digitChars);
        if (useSpecialChars) validChars.append(specialChars);

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
