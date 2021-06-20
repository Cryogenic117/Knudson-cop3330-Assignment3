/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex42;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class Solution42Test extends TestCase {
@Test
    public void testParseLine() {
        Data actual = Solution42.parseLine("LastName,Firstname,100000");
        Data expected = new Data();
        expected.setLast("LastName");
        expected.setFirst("Firstname");
        expected.setSalary(100000);

        assertEquals(expected.getFirst(), actual.getFirst());
        assertEquals(expected.getLast(), actual.getLast());
        assertEquals(expected.getSalary(), actual.getSalary());
    }
}