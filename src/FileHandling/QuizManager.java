package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizManager {

    public static double averageBestTwo(int q1, int q2, int q3) {
        int total = q1 + q2 + q3;
        int min = Math.min(q1, Math.min(q2, q3));
        return (total - min) / 2.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("quiz.txt");

        try {
            FileWriter writer = new FileWriter(file);

            System.out.print("Enter number of students: ");
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Student ID (integer): ");
                int id = input.nextInt();

                System.out.print("Enter 3 quiz marks: ");
                int q1 = input.nextInt();
                int q2 = input.nextInt();
                int q3 = input.nextInt();

                writer.write(id + " " + q1 + " " + q2 + " " + q3 + "\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        int topStudentId = -1;
        double highestAverage = 0.0;

        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("\nStudent Averages:");

            while (fileScanner.hasNextInt()) {
                int id = fileScanner.nextInt();
                int q1 = fileScanner.nextInt();
                int q2 = fileScanner.nextInt();
                int q3 = fileScanner.nextInt();

                double avg = averageBestTwo(q1, q2, q3);
                System.out.println("ID: " + id + ", Average of Best Two Quizzes: " + avg);

                if (avg > highestAverage) {
                    highestAverage = avg;
                    topStudentId = id;
                }
            }

            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("\nStudent with highest average: " + topStudentId + " (" + highestAverage + ")");
    }
}
