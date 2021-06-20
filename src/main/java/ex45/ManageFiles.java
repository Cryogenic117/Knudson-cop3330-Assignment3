package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManageFiles {
public static String readFile(String path) throws FileNotFoundException {
    // read file into single string using concatenation
    File obj = new File(path);
    Scanner myReader = new Scanner(obj);

    String output = "";
    while(myReader.hasNextLine()) {
        //noinspection StringConcatenationInLoop
        output += myReader.nextLine();
        output += "\n";
    }
    myReader.close();
    return output;
}
public static String outputFile(String text, String name, String outPath) throws IOException {
    // write string to output file
    FileWriter myWriter = new FileWriter(String.format("%s/%s.txt", outPath, name));
    myWriter.write(text);
    myWriter.close();

    return text;
}

}
