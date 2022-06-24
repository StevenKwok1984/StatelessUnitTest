package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.tsg.unittesting.strings.StringsExerciseA.yell;
import static com.tsg.unittesting.strings.StringsExerciseF.longestWord;
import static org.junit.jupiter.api.Assertions.*;

class StringsExerciseFTest {

    @Test
    public void testLongWord1() {
        // ARRANGE
        boolean result;
        String phrase = "Invention my dear friends is 93% perspiration 6% electricity 4% evaporation and 2% butterscotch ";

        // ACT
        String longest = longestWord(phrase);

        if (longest.equals("perspiration")) {
            result = true;
        } else {
            result = false;
        }

        // ASSERT
        assertTrue(result, "The answer should be 'perspiration'");
    }

    @Test
    public void testLongWord2() {
        // ARRANGE
        boolean result;
        String phrase = "All well-established principles should be periodically challenged";

        // ACT
        String longest = longestWord(phrase);

        if (longest.equals("well-established")) {
            result = true;
        } else {
            result = false;
        }

        // ASSERT
        assertTrue(result, "The answer should be 'well-established'");
    }

    @Test
    public void testLongWord3() {
        // ARRANGE
        boolean result;
        String phrase = "Never argue with the data";

        // ACT
        String longest = longestWord(phrase);

        if (longest.equals("Never")) {
            result = true;
        } else {
            result = false;
        }

        // ASSERT
        assertTrue(result, "The answer should be 'Never'");
    }

}