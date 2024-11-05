package io.questdb.example.rust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StrReverseTest {

    @Test
    public void testReversedString() {
        assertEquals("Great Scott, A reversed string!: !dlroW olleH", StrReverse.reversedString("Hello World!"));
    }
}
