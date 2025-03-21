package packageforCtoF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        icecream icefinal = new icecream();

        System.out.print("Enter ice cream type: ");
        icefinal.setType(input.nextLine());
        System.out.print("Enter ice cream Company: ");
        icefinal.setCompany(input.nextLine());
        System.out.print("Enter ice cream price: ");
        icefinal.setPrice(input.nextDouble());

        System.out.println("Enter Information to Compare: ");
        icecream ice02 = new icecream();
        input.nextLine();
        System.out.print("Enter ice cream type: ");
        ice02.setType(input.nextLine());
        System.out.print("Enter ice cream Company: ");
        ice02.setCompany(input.nextLine());
        System.out.print("Enter ice cream price: ");
        ice02.setPrice(input.nextDouble());

        icefinal.display();
        ice02.display();

        if (icefinal.equals(ice02)) {
            System.out.println("The prices of both ice creams are the same.");
        } else {
            System.out.println("The prices of the two ice creams are different.");
        }

        System.out.println("CompareTo result: " + icefinal.compareTo(ice02));

    }
}
