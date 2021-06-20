package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution42 {
    static List<Data> records = new ArrayList<>();
    public static void main(String[] args) {
        //Scan names to string then split to 3 strings merged into Arraylist
        try {
            scanFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Output records
        System.out.printf("%-20s %-20s %s", "Last", "First", "Salary\n");
        System.out.println("-----------------------------------------------");
        for(Data temp : records) {
            System.out.println(temp.toString());
        }

    }

    public static void scanFile() throws FileNotFoundException {
        // read file by line then call parse function for each line
        File input = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner myReader = new Scanner(input);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            records.add(parseLine(data));
        }
        myReader.close();
    }

    public static Data parseLine(String data) {
        // Split strings into 3 and store in ArrayList
        String[] separatedData = data.split(",");
        Data temp = new Data();

        temp.setLast(separatedData[0]);
        temp.setFirst(separatedData[1]);
        temp.setSalary(Integer.parseInt(separatedData[2]));

        return temp;
    }

}
