/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Solution44 {
    private static final Scanner in = new Scanner(System.in);
    static String search;
    private static final String filePath = "C:\\Users\\bknud\\IdeaProjects\\untitled1\\Assignment3\\src\\main\\java\\ex44\\exercise44_input.json";

    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
        //loop for input until search yields
        do {
            System.out.print("What is the product name? ");
            search = in.next();
            // break when search yields
        } while (!printProduct(search(search, filePath)));
    }

    static Object search(String name, String path) throws IOException, org.json.simple.parser.ParseException {
        // searches the JSON array by name
        Object obj = new JSONParser().parse(new FileReader(path));
        JSONObject jo = (JSONObject) obj;
        JSONArray ja = (JSONArray) jo.get("products");

        for (Object o : ja) {
            if (o.toString().contains("\"name\":\"" + name + "\"")) {
                return o;
            }
        }
        return null;

    }

    static boolean printProduct(Object obj) {
        //prints formatted results
        if (obj == null) {
            return false;
        } else {
            JSONObject object = (JSONObject) obj;
            System.out.println("Name: " + object.get("name"));
            System.out.println("Price: " + object.get("price"));
            System.out.println("Quantity: " + object.get("quantity"));

            return true;
        }
    }
}
