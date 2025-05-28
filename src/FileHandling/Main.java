package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Writing to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a test file.\nWelcome to Java file handling!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }

        // Reading from the file
        try {
            Scanner reader = new Scanner(file);
            System.out.println("\nReading from the file:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
}

