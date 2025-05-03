package lav7_pb4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter side1: ");
            double s1= input.nextDouble();
            System.out.println("Enter side2: ");
            double s2 = input.nextDouble();
            System.out.println("Enter side3: ");
            double s3 = input.nextDouble();

            triangle tri = new triangle(s1, s2, s3);
            tri.color = "red";
            tri.value = false;
            System.out.println(tri.toString());
            System.out.println(tri.getArea());
            System.out.println(tri.getPerimeter());
        } catch (triangleException t){
            System.out.println(t.getMessage());
        }
    }
}
