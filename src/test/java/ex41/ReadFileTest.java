/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ReadFileTest{
@Test
    public void testGetContent() throws IOException {
        List<String> actual = ReadFile.getContent("src/test/java/ex41/test.txt");
        assertFalse(actual.isEmpty());

    }
@Test
    public void testEntryCount() throws IOException {

        int actual = ReadFile.entryCount("src/test/java/ex41/test.txt");
        int expected = 500;
        assertEquals(expected, actual);
    }
}