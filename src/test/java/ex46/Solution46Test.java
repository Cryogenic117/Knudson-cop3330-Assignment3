package ex46;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution46Test {

    @Test
    void ReadFileTest() throws FileNotFoundException {
        String path = "C:\\Users\\bknud\\IdeaProjects\\untitled1\\Assignment3\\src\\test\\java\\ex46\\TestInputFile.txt";
         String actual = Solution46.readFile(path);
         String expected = "Egg Bacon Bacon Grits Egg Egg Egg Egg ";
         assertEquals(expected, actual);
    }
    @Test
    void wordFrequencyTest() {
        Map<String,Integer> actual = Solution46.eachWordFrequency("Egg Bacon Bacon Grits Egg Egg Egg Egg ");
        Map<String,Integer> expected = new HashMap<>();
        expected.put("Egg", 5);
        expected.put("Bacon", 2);
        expected.put("Grits", 1);

        assertEquals(expected, actual);
    }
    @Test
    void MapSortTest() {
        Map<String,Integer> actual = Solution46.eachWordFrequency("Bacon Grits Egg Bacon Bacon Grits Egg Egg Egg Egg ");
        actual = Solution46.sortMap(actual);
        String expected = "{Egg=5, Bacon=3, Grits=2}";

        assertEquals(expected, actual.toString());
    }

}