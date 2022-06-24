package com.tsg.unittesting.logic;

import org.junit.jupiter.api.Test;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
import static org.junit.jupiter.api.Assertions.*;

class LogicExerciseETest {

    @Test
    public void testFriendlyGreeting1() {

        // ARRANGE
        boolean result;

        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);


        if (greeting.equals("hi")) {
            result = true;
        } else {
            result = false;
        }

        // ASSERT
        assertTrue(result, "Hello there./ should all be 'hi'");
    }

}