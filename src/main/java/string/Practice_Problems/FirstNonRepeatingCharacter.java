package main.java.string.Practice_Problems;

public class FirstNonRepeatingCharacter {

    public char findFirstNonRepeatingChar(String text) {

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count == 1) {
                return currentChar;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        FirstNonRepeatingCharacter checker =
            new FirstNonRepeatingCharacter();

        String text = "swiss";

        char result =
            checker.findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println(
                "No Non-Repeating Character Found"
            );
        } else {
            System.out.println(
                "First Non-Repeating Character: '"
                + result
                + "'"
            );
        }
    }
}