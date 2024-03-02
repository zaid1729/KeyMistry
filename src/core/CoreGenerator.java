package core;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class CoreGenerator {
    public String generatePassword(int length, boolean useLowerCase, boolean useUpperCase, boolean useNumbers, boolean useSymbols) {
        String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
        String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NUMBER_CHARS = "0123456789";
        String SYMBOL_CHARS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        StringBuilder stringBuilder1 = new StringBuilder();

        if (useLowerCase) {
            stringBuilder1.append(LOWERCASE_CHARS);
        }

        if (useUpperCase) {
            stringBuilder1.append(UPPERCASE_CHARS);
        }

        if (useNumbers) {
            stringBuilder1.append(NUMBER_CHARS);
        }

        if (useSymbols) {
            stringBuilder1.append(SYMBOL_CHARS);
        }

        Random random = new Random();
        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(stringBuilder1.length());
            char randomChar = stringBuilder1.charAt(randomIndex);
            stringBuilder2.append(randomChar);
        }

        return stringBuilder2.toString();
    }

    public void copyToClipboard(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
    
    public int getComplexity(String text, int length) {
        Set<String> veryWeakPasswords = new HashSet<>(Arrays.asList(
                "123456", "123456789", "12345", "qwerty", "password",
                "12345678", "111111", "123123", "1234567890", "1234567",
                "qwerty123", "000000", "1q2w3e", "aa12345678", "abc123",
                "password1", "1234", "qwertyuiop", "123321", "password123"
        ));

        if (veryWeakPasswords.contains(text.toLowerCase())) {
            return 0;
        } else if (length < 4) {
            return 0;
        } else if (length < 8) {
            return 25;
        } else if (length < 10) {
            return 50;
        } else if (length < 12) {
            return 75;
        } else {
            return 100;
        }
    }

    public String getStrength(int complexity) {
        return switch (complexity) {
            case 0 -> "Strength: Very Weak - Time to crack: Instant";
            case 25 -> "Strength: Weak - Time to crack: Minutes to hours";
            case 50 -> "Strength: Moderate - Time to crack: Hours to days";
            case 75 -> "Strength: Strong - Time to crack: Weeks to months";
            case 100 -> "Strength: Very Strong - Time to crack: Very long time";
            default -> null;
        };
    }
}
