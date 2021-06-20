/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex43;


import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    public static String name, authorFirst, authorLast, java, css;
    public static void main(String[] args) throws IOException {
        // get user data
        getInput();
        //create website folder and output when successful
        System.out.println(LoadWebSkeleton.createFolder(name));
        //create website html index and output when successful
        System.out.println(LoadWebSkeleton.createIndex(name,authorLast,authorFirst));
        //overload for java
        if(java.compareTo("y") == 0) {
            System.out.println(LoadWebSkeleton.createFolder("js"));
        }
        //overload for css
        if(css.compareTo("y") == 0) {
            System.out.println(LoadWebSkeleton.createFolder("css"));
        }
    }
static void getInput() {
    // prompt for infomration
    Scanner in = new Scanner(System.in);
    System.out.print("Site name: ");
    name = in.next();
    System.out.print("Author: ");
    authorFirst = in.next();
    authorLast = in.next();
    System.out.println("Do you want a folder for JavaScript? ");
    java = in.next();
    System.out.println("Do you want a folder for CSS? ");
    css = in.next();
}
}
