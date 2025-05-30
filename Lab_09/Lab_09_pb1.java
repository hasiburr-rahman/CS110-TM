import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Lab_09_pb1 {
        public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("Lab08_01.txt", true)) {
                Random random = new Random();
                for (int i = 0; i < 100; i++) {
                    int num = random.nextInt(1000);
                    writer.write(num + " ");
                }
                writer.write("\n");
                System.out.println("100 random integers written to Lab08_01.txt");
            } catch (IOException e) {
                System.out.println(e);
                System.out.println("An error occurred while writing to the file.");
            }
        }

}
