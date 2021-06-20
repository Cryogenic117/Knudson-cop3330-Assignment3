package ex45;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ManageFilesTest {

    @Test
    void readFile() throws FileNotFoundException {
        String actual = ManageFiles.readFile("src/test/java/ex45/input.txt");
        String expected =
                """
                        123
                        abc
                        456
                        789
                        """;
        assertEquals(expected, actual);
    }

    @Test
    void outputFile() throws IOException {
        String test1 = ManageFiles.outputFile("testing 123 testing", "testFile", "src/test/java/ex45");
        test1 += "\n";
        String test2 = ManageFiles.readFile("src/test/java/ex45"+ "/testFile.txt");
        assertEquals(test1, test2);
    }
}