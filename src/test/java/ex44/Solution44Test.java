/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex44;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class Solution44Test {

    @Test
    void search() throws IOException, org.json.simple.parser.ParseException {
        assertNotNull(Solution44.search("Thing", "C:\\Users\\bknud\\IdeaProjects\\untitled1\\Assignment3\\src\\test\\java\\ex44\\test.json"));
    }
}