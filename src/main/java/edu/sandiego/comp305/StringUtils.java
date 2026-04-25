package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils(final String input) {

    }

    public static String reverseString(final String input) {
        final String reversedWord =
            new StringBuilder(input).reverse().toString();
        return reversedWord;
    }
}
