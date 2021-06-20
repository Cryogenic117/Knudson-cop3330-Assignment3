package ex45;

import java.io.IOException;
import java.util.Scanner;

public class Solution45 {
    private static final String path = "src/main/java/ex45/exercise45_input.txt";
    private static final String outPath = "src/main/java/ex45";
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        // get user output file name
        String outputFileName =  getInput();
        // call ManageFiles class to transfer file contents to a string
        String string = ManageFiles.readFile(path);
        // use regex to replace words
        String replaceString = string.replaceAll("utilize", "use");
        // print replaced words string in output file and console
        System.out.println(ManageFiles.outputFile(replaceString, outputFileName, outPath));


    }
    public static String getInput() {
        // get output file name
        System.out.print("Enter a name for the output file: ");
        return in.next();
    }
}
