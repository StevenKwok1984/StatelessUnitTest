package com.tsg.unittesting.arrays;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseATest {

    @Test
    public void testArrayMax1() {
        // ARRANGE
        boolean result;
        int[] numbers = {1};

        // ACT
        int max = maxOfArray(numbers);


        if (max == 1) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT

        assertTrue(result, "{1}/ should all be 1");
    }

    @Test
    public void testArrayMax2() {
        // ARRANGE
        boolean result;
        int[] numbers = {3,4,5};

        // ACT
        int max = maxOfArray(numbers);


        if (max == 5) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT

        assertTrue(result, "{3,4,5}/ should all be 5");
    }

    @Test
    public void testArrayMax3() {
        // ARRANGE
        boolean result;
        int[] numbers = {-9000, -700, -50, -3};

        // ACT
        int max = maxOfArray(numbers);


        if (max == -3) {
            result = true;
        } else {
            result = false;
        }
        // ASSERT

        assertTrue(result, "{3,4,5}/ should all be -3");
    }




}