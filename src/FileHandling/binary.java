package FileHandling;

import java.io.*;

public class binary {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/java/ForFinal/untitled/src/FileHandling/sample.dat");
        file.createNewFile();
        if (file.exists()) {
            System.out.println("File Exists");
        } else {
            System.out.println("File does not exist. It will be created.");
        }

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {

            output.writeInt(123);
            output.writeDouble(45.67);
            output.writeUTF("Hello");
            System.out.println("Binary data written to file.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + e.getMessage(), e);
        } catch (IOException e) {
            throw new RuntimeException("I/O Error: " + e.getMessage(), e);
        }

        try {
            DataInputStream input = new DataInputStream(new FileInputStream(file));
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readUTF());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}