package lab7_pb2;

public class Main {
    public static void main(String[] args) {
        product apple = new product();

        try {
            apple.productCheck(99);
        } catch (MyException m){
            System.out.println(m.getMessage());
        }
    }
}
