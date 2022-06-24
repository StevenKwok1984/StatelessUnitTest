package com.tsg.unittesting.logic;

import org.junit.jupiter.api.Test;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
import static org.junit.jupiter.api.Assertions.*;

class LogicExerciseATest {
    @Test
    public void testFriendlyGreeting1() {

        // ARRANGE
        String visitorName = "Goofus";
        boolean isFriend = false;
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

    @Test
    public void testFriendlyGreeting2() {

        // ARRANGE
        String visitorName = "Gallant";
        boolean isFriend = true;
        boolean result;


        // ACT
        String greeting = friendlyGreeting(visitorName, isFriend);


        if (greeting.equals("Hello, Gallant!")) {
            result = true;
        } else {
            result = false;
        }

        // ASSERT
        assertTrue(result, "Hello there./ should all be 'Hello, Gallant!'");
    }

    @Test
    public void testFriendlyGreeting3() {

        // ARRANGE
        String visitorName = "";
        boolean isFriend = false;
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