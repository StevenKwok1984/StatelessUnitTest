package com.tsg.unittesting.strings;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.tsg.unittesting.HappyLlamas.areTheLlamasHappy;
import static com.tsg.unittesting.strings.StringsExerciseA.yell;
import static org.junit.jupiter.api.Assertions.*;

class StringsExerciseATest {

    @Test
    public void testHelloThere() {
        // ARRANGE

        String forYell = "Hello there.";

        // ACT
        String textUC = yell(forYell);
        boolean result = false;

        if (textUC.equals(textUC.toUpperCase(Locale.ROOT))) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT

        assertTrue(result, "Hello there./ should all be upper case");
    }

    @Test
    public void testSh() {
        // ARRANGE

        String forYell = "shhhhhhhhhhhh";

        // ACT
        String textUC = yell(forYell);
        boolean result = false;

        if (textUC.equals(textUC.toUpperCase(Locale.ROOT))) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT

        assertTrue(result, "Hello there./ should all be upper case");
    }

    @Test
    public void testAh() {
        // ARRANGE

        String forYell = "AAaAAAaAAAaaAAHHHH";

        // ACT
        String textUC = yell(forYell);
        boolean result = false;

        if (textUC.equals(textUC.toUpperCase(Locale.ROOT))) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT

        assertTrue(result, "Hello there./ should all be upper case");
    }






}