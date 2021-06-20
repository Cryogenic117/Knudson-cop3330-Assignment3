package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class Solution46 {
    public static String path = "C:\\Users\\bknud\\IdeaProjects\\untitled1\\Assignment3\\src\\main\\java\\ex46\\exercise46_input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        //read file
        String text = readFile(path);
        //get each word's frequency
        Map<String, Integer> map = eachWordFrequency(text);
        //sort map with highest value first
        map = sortMap(map);
        // print formatted output
        output(map);
    }

    public static String readFile(String path) throws FileNotFoundException {
        // read file into single string using concatenation
        File obj = new File(path);
        Scanner myReader = new Scanner(obj);

        String output = "";
        while (myReader.hasNextLine()) {
            //noinspection StringConcatenationInLoop
            output += myReader.nextLine();
            output += " ";
        }
        myReader.close();
        return output;
    }

    public static Map<String, Integer> eachWordFrequency(String text) {
        // get frequency of each word in string
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");
        String[] wordsList;
        int counter = 0;
        wordsList = getWordsList(words);

        for (String temp : wordsList) {
            if (temp == null) {
                break;
            }
            for (String temp1 : words) {
                if (temp.equals(temp1)) {
                    counter++;
                }
            }
            map.put(temp, counter);
            counter = 0;
        }
        return map;
    }

    public static String[] getWordsList(String[] words) {
        String[] wordsList = new String[words.length];

        wordsList[0] = words[0];
        int index = 1;
        boolean exists = false;

        for (int i = 1; i < words.length; i++) {
            for (int j = 0; j < index; j++) {
                if (words[i].compareTo(wordsList[j]) == 0) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                wordsList[index] = words[i];
                index++;
            }
            exists = false;
        }
        return wordsList;
    }

    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;
    }

    @SuppressWarnings("rawtypes")
    public static void output(Map<String, Integer> map) {
        for (Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            var mapElement = (Entry) stringIntegerEntry;
            System.out.printf("%-10s", mapElement.getKey());
            for (int i = 0; i < (int) mapElement.getValue(); i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
