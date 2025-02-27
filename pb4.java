package lab1_pb2;

import java.util.Scanner;

public class pb4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the problem of currency covertion: ");
        System.out.println("Enter '1' for conver BDT to $ OR Enter '0' for convert $ to BDT");
        
        int x = input.nextInt();
        
        if(x == 1){
            System.out.println("Welcome");
            System.out.println("Enter the amount of Taka: ");
            double tk = input.nextDouble();
            
            double doller = tk*122;
            System.out.println(tk + "BDT = " + doller + "$");
            
        }
        else if(x == 0){
            System.out.println("Welcome");
            System.out.println("Enter the amount of Doller - $: ");
            double doller = input.nextDouble();
            
            double tk = doller/122;
            System.out.println(tk + "BDT = " + doller + "$");
            
        }
        else{
            System.out.println("Choose option currectly 0/1");
        }
        
        
        
    }
}
