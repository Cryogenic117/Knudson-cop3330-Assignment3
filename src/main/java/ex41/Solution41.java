/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex41;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Solution41 {
    public static void main(String[] args) throws IOException {

        // Initialize list of strings
        List<String> nameList;

        // get File info
        int names = ReadFile.entryCount("src/main/java/ex41/exercise41_input.txt");
        nameList = ReadFile.getContent("src/main/java/ex41/exercise41_input.txt");

        // sort list of strings alphabetically
        Collections.sort(nameList);

        // output
        generateOut(names, nameList);


    }

    public static void generateOut(int entryCount, List<String> nameList) {
        // Print number of names and line
        System.out.printf("Total of %d names\n", entryCount);
        System.out.println("________________________");

        // iterate through and print name list
        for (String element : nameList) {
            System.out.println(element);
        }

    }

}

