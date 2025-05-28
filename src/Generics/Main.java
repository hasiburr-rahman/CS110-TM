package Generics;

public class Main {
    public static void main(String[] args) {
        try {
            vehicle<String> car = new vehicle<>("Sedan", -15.5, 4);
            System.out.println(car);

            vehicle<Integer> bike = new vehicle<>(123, 5.0, 1);
            System.out.println(bike);
        } catch (NegativeValueException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}