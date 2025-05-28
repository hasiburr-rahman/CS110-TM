package Multithreading;

public class SimpleThreadDemo extends Thread {

    public SimpleThreadDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running iteration " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
        System.out.println(getName() + " finished running.");
    }

    public static void main(String[] args) {
        SimpleThreadDemo thread = new SimpleThreadDemo("MyThread-byProyas");
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Main thread: " + thread.getName() + " is still alive.");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread: " + thread.getName() + " has completed.");
    }
}
