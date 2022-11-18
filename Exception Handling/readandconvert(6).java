//read from reading.txt and convert to uppercase 
//and write to writing.txt

import java.io.*;
import java.util.*;
public class readandconvert {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("reading.txt"));
        PrintWriter out = new PrintWriter(new File("writing.txt"));
        while (in.hasNextLine()) {
            String line = in.nextLine();
            out.println(line.toUpperCase());
        }
        out.close();
    }
}
