package ThreadProblems;

class AdditionThread extends Thread {
    private int a, b;

    AdditionThread(int a, int b) {
        super("AdditionThread");
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int result = a + b;
        System.out.println(getName() + ": Addition Result = " + result);
    }
}

class SubtractionThread extends Thread {
    private int a, b;

    SubtractionThread(int a, int b) {
        super("SubtractionThread");
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int result = a - b;
        System.out.println(getName() + ": Subtraction Result = " + result);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdditionThread addThread = new AdditionThread(10, 20);
        SubtractionThread subThread = new SubtractionThread(20, 12);

        addThread.start();
        subThread.start();
//        addThread.join();

//        try {
//            // Wait for addition thread to complete before starting subtraction thread
//            addThread.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted while waiting.");
//        }

//        subThread.start();
//        subThread.join();

//        try {
//            // Optionally wait for subtraction thread to finish before main exits
//            subThread.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted while waiting.");
//        }
    }
}
