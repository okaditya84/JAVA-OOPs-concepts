//count the number of words characters and lines from reading.txt
import java.io.*;
import java.util.*;
public class readfile {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("reading.txt"));
        int words = 0;
        int lines = 0;
        int characters = 0;
        //hasnextline function checks for the availability of next line
        while (in.hasNextLine()) {
            String line = in.nextLine();
            lines++;
            characters += line.length();
            String[] word = line.split(" ");
            words += word.length;
        }
        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of characters: " + characters);
    }
}
