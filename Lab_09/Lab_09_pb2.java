import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Lab_09_pb2 {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("Lab08_02.dat", true))) {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                out.writeInt(rand.nextInt(1000)); // Write as binary data
            }
            System.out.println("100 random integers written to Lab08_02.dat");
        } catch (IOException e) {
            System.out.println("Error writing binary file.");
            e.printStackTrace();
        }
    }
}
