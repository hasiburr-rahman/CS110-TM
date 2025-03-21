package Lab01spackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 5;
        icecream[] ice = new icecream[5];

        for(int i=0; i<ice.length; i++){
            ice[i] = new icecream();
            System.out.println("Enter Information for icecream - " +(i+1));
            System.out.print("Enter ice cream type: ");
            ice[i].setType(input.nextLine());
            System.out.print("Enter ice cream Company: ");
            ice[i].setCompany(input.nextLine());
            System.out.print("Enter ice cream price: ");
            ice[i].setPrice(input.nextDouble());
            input.nextLine();
        }
        System.out.println("You have completed 5 ice-cream details");

        System.out.println("Now enter the company name you want to print from the inputed details - ");
        String comName = input.nextLine();

        comCompare(ice, comName);

    }

    public static void comCompare(icecream[] ice, String comName){
        for (int i = 0; i < ice.length; i++) {
            if (ice[i].getCompany().equalsIgnoreCase(comName)) {
                display(ice[i]);
            }
        }
    }

    public static void display(icecream ice) {
        ice.display();  // Call the display method from the icecream class
    }

}
