package stringproblems;

/*
Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
1) The first letter needs to be converted to its ASCII code.
2) The second letter needs to be switched with the last letter
3) There are no special characters in input.
Examples:
("Hello") => "72olle"
("good") => "103doo"
("hello world") => "104olle 119drlo"*/

public class EncryptThis {
    public static void main(String[] args) {
        System.out.println(encryptThis("Hello"));
        System.out.println(encryptThis("good"));
        System.out.println(encryptThis("hello world"));
        System.out.println(encryptThis("A wise old owl lived in an oak"));
    }

    public static String encryptThis(String text) {
        String[] wordArray = text.split(" ");
        StringBuilder outputBuilder = new StringBuilder();

        for (String word : wordArray) {

            if (word.isEmpty())
                continue;

            outputBuilder.append((int) word.charAt(0));

            if (word.length() == 1) {
                outputBuilder.append(" ");
            } else if (word.length() == 2) {
                outputBuilder.append((word.charAt(1)))
                        .append(" ");
            } else {
                outputBuilder.append(word.charAt(word.length() - 1))
                        .append(word, 2, word.length() - 1)
                        .append(word.charAt(1))
                        .append(" ");
            }
        }

        return outputBuilder.toString().trim();
    }

}
