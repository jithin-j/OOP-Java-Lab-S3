import java.io.*;
import java.util.*;

public class FileExceptions {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name to write into");
        String filename = sc.nextLine();
        try {
            Writer w = new FileWriter(filename);
            System.out.println("Enter the file content");
            String content = sc.nextLine();
            w.write(content);
            System.out.println("Done!");
            w.close();

            // Reading File
            System.out.println("Enter the file name to read from");
            String filename2 = sc.nextLine();
            Reader reader = new FileReader(filename2);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

            System.out.println("\n");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}