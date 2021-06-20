/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {

    public static List<String> getContent(String file) throws IOException {
        //initialize file reader
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // initialize arrayList
        List<String> nameList = new ArrayList<>();

        // Read file and load list
        String line = reader.readLine();
        while (line != null) {
            nameList.add(line);
            line = reader.readLine();
        }

        reader.close();

        return nameList;
    }

    public static int entryCount(String s) throws IOException {
        //open reader
        BufferedReader reader = new BufferedReader(new FileReader(s));
        int lines = 0;
        while (reader.readLine() != null) lines++;

        // close reader
        reader.close();

        return lines;

    }
}
