package io.questdb.example.rust;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrReverseTest {

    @Test
    public void testReversedString() {
        assertEquals("Great Scott, A reversed string!: !dlroW olleH", StrReverse.reversedString("Hello World!"));
    }
}
