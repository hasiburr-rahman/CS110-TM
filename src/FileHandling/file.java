package FileHandling;

import java.io.*;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        File file = new File("D:/java/ForFinal/untitled/src/FileHandling/example.txt");

        try {
            FileWriter writer = new FileWriter(file);
            if (file.exists()) {
                System.out.println("File exists.");
            } else {
                System.out.println("File does not exist.");
            }
            writer.write("I am hasibur, proyas arup");
            writer.close();
            System.out.println("successfully wrote the file");
        } catch (IOException e) {
            System.out.println("Error Occurred" + e.getMessage());
            throw new RuntimeException(e);
        }

        try {
            Scanner reader = new Scanner(file);
            System.out.println("Reading from the file");
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error occurred");
            throw new RuntimeException(e);
        }
    }
}
