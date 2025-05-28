package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentMarksProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("student.txt");

        try {
            FileWriter writer = new FileWriter(file);

            for (int i = 0; i < 30; i++) {
                System.out.print("Enter Student ID: ");
                int id = input.nextInt();

                System.out.print("Enter MID1, MID2, Final marks: ");
                int mid1 = input.nextInt();
                int mid2 = input.nextInt();
                int finalExam = input.nextInt();

                writer.write(id + " " + mid1 + " " + mid2 + " " + finalExam + "\n");
            }

            writer.close();
            System.out.println("Data successfully written to student.txt!\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        int topMid1 = -1, topMid2 = -1, topFinal = -1;
        int topMid1Id = -1, topMid2Id = -1, topFinalId = -1;

        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextInt()) {
                int id = fileReader.nextInt();
                int mid1 = fileReader.nextInt();
                int mid2 = fileReader.nextInt();
                int finalExam = fileReader.nextInt();

                if (mid1 > topMid1) {
                    topMid1 = mid1;
                    topMid1Id = id;
                }

                if (mid2 > topMid2) {
                    topMid2 = mid2;
                    topMid2Id = id;
                }

                if (finalExam > topFinal) {
                    topFinal = finalExam;
                    topFinalId = id;
                }
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            return;
        }

        System.out.println("Top Scorers:");
        System.out.println("MID1  : Student ID = " + topMid1Id + " with " + topMid1 + " marks");
        System.out.println("MID2  : Student ID = " + topMid2Id + " with " + topMid2 + " marks");
        System.out.println("Final : Student ID = " + topFinalId + " with " + topFinal + " marks");
    }
}

