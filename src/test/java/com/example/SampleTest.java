package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testString() {
        assertTrue("Look Beauty".contains("Beauty"));
    }
}
