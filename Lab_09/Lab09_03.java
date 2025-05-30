import java.io.*;

public class Lab09_03 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Lab8_02.txt");
            FileOutputStream fos = new FileOutputStream("new.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            String line = "";
            int b;

            while ((b = fis.read()) != -1) {
                if (b != 10) {
                    line += (char) b;
                } else {
                    dos.writeUTF(line);
                    line = "";
                }
            }

            if (!line.isEmpty()) {
                dos.writeUTF(line);
            }

            fis.close();
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("new.dat"));

            while (dis.available() != 0) {
                String str = dis.readUTF();
                System.out.println(str);
            }

            dis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

