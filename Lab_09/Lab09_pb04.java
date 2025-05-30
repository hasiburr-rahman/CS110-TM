import java.io.FileWriter;
import java.io.IOException;

public class Lab09_pb04 {
    int Index;
    int MaxSize;
    int[] Data;

    Lab09_pb04() {
        MaxSize = 10;
        Index = -1;
        Data = new int[MaxSize];
    }

    Lab09_pb04(int size) {
        MaxSize = size;
        Index = -1;
        Data = new int[MaxSize];
    }

    void push(int data) {
        if (Index < MaxSize - 1) {
            Index++;
            Data[Index] = data;
        }
    }

    void pop() {
        if (Index >= 0) {
            Index--;
        }
    }

    int top() {
        return (Index >= 0) ? Data[Index] : -1;
    }

    String getDataAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= Index; i++) {
            sb.append(Data[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Lab08_04.txt", true); // true = append mode

            for (int i = 0; i < 5; i++) {
                Lab09_pb04 list = new Lab09_pb04(5);
                for (int j = 0; j < 5; j++) {
                    list.push((int)(Math.random() * 100));
                }
                writer.write("List " + (i+1) + ": " + list.getDataAsString() + "\n");
            }

            writer.close();
            System.out.println("Stored 5 List objects (as text) in Lab08_04.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}

