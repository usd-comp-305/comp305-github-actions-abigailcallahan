package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTests {

    @Test
    void testReverseEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReverseOneLetter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void testReverseMultipleLetters() {
        assertEquals("cba", StringUtils.reverseString("abc"));
    }
}
