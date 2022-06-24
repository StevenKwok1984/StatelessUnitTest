package com.tsg.unittesting.arrays;

import org.junit.jupiter.api.Test;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import static com.tsg.unittesting.arrays.ArrayExerciseE.camelCaseIt;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseETest {

    @Test
    public void testArrayCarmel1() {
        // ARRANGE
        boolean result;
        String[] textArray = {"llama", "llama", "duck"};

        // ACT
        String sentence = camelCaseIt(textArray );


        if (sentence.endsWith("llamaLlamaDuck")) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT
        assertTrue(result, "{1}/ should all be 'llamaLlamaDuck' ");
    }

    @Test
    public void testArrayCarmel2() {
        // ARRANGE
        boolean result;
        String[] textArray = {"lambs", "eat", "oats", "and", "does", "eat", "oats"};

        // ACT
        String sentence = camelCaseIt(textArray );


        if (sentence.endsWith("lambsEatOatsAndDoesEatOats")) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT
        assertTrue(result, "{1}/ should all be 'lambsEatOatsAndDoesEatOats' ");
    }

    @Test
    public void testArrayCarmel3() {
        // ARRANGE
        boolean result;
        String[] textArray = {"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"};

        // ACT
        String sentence = camelCaseIt(textArray );


        if (sentence.endsWith("doOrDoNotThereIsNoTry")) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT
        assertTrue(result, "{1}/ should all be 'doOrDoNotThereIsNoTry' ");
    }

}