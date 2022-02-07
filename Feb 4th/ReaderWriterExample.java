import java.io.*;
import java.util.*;

public class ReaderWriterExample {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name to write into");
        String filename = sc.nextLine();
        Writer w = new FileWriter(filename);
        System.out.println("Enter the file content");
        String content = sc.nextLine();
        w.write(content);
        System.out.println("Done!");
        w.close();

        // Reading File
        System.out.println("Reading file -> " + filename);
        Reader reader = new FileReader(filename);
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();

        System.out.println("\n");

    }
}
