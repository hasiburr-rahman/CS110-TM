package FileHandling;

import java.io.*;
import java.util.*;

// Abstract class with two abstract methods
abstract class DataReader {
    public abstract void ReadData(String filename) throws IOException;
    public abstract void WriteData() throws IOException;
}

// Class to read/write text files
class TextFile extends DataReader {
    private int[] Filenumb;

    @Override
    public void ReadData(String filename) throws IOException {
        List<Integer> list = new ArrayList<>();

        Scanner fileScanner = new Scanner(new File(filename));
        while (fileScanner.hasNextInt()) {
            list.add(fileScanner.nextInt());
        }
        fileScanner.close();

        // Convert list to array
        Filenumb = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Filenumb[i] = list.get(i);
        }
    }

    @Override
    public void WriteData() throws IOException {
        FileWriter writer = new FileWriter("ExamTextFile.txt");
        for (int num : Filenumb) {
            writer.write(num + "\n");
        }
        writer.close();
        System.out.println("Data written to ExamTextFile.txt.");
    }
}

// Class to read binary files and display data
class BinaryFile extends DataReader {
    private ArrayList<Integer> binarynum = new ArrayList<>();

    @Override
    public void ReadData(String filename) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(filename));
        try {
            while (true) {
                int num = dis.readInt();
                binarynum.add(num);
            }
        } catch (EOFException e) {
            // End of file reached
        } finally {
            dis.close();
        }
    }

    @Override
    public void WriteData() {
        System.out.println("Data read from binary file:");
        for (int num : binarynum) {
            System.out.println(num);
        }
    }
}

// Test class to demonstrate usage
public class Mainnn {
    public static void main(String[] args) {
        try {
            // --- Text File Example ---
            TextFile textReader = new TextFile();
            textReader.ReadData("input.txt");  // Make sure input.txt exists
            textReader.WriteData();

            // --- Binary File Example ---
            BinaryFile binaryReader = new BinaryFile();
            binaryReader.ReadData("input.bin");  // Make sure input.bin exists
            binaryReader.WriteData();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

