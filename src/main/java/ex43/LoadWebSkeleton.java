/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Knudson
 */
package ex43;

import java.io.*;

public class LoadWebSkeleton {
    // create new folder inside website folder
    public static String createFolder(String webName) {
        File file = new File("C:\\Users\\bknud\\IdeaProjects\\untitled1\\Assignment3\\src\\main\\java\\ex43\\website\\" + webName);
        boolean bool = file.mkdir();
        if (bool)
            return String.format("Created src/main/java/ex43/website/%s", webName);
        else
            return "Error creating " + webName + " folder";
    }

    public static String createIndex(String webName, String last, String first) throws IOException {
        //create html folder for website index and add title and author
        File file = new File(String.format("C:\\Users\\bknud\\IdeaProjects\\untitled1\\Assignment3\\src\\main\\java\\ex43\\website\\%s\\index.html", webName));
        Writer output = new BufferedWriter(new FileWriter(file));
        output.write(String.format("<html>\n\t<meta name=\"author\" content=\"%s %s\">\n\t<head>\n\t\t<title>%s</title>\n\t</head>\n</html>", first, last, webName));
        output.close();
        return "Created " + String.format("src/main/java/ex43/website/%s/index.html", webName);
    }
}
