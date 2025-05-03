package lab01;

public class Main {
    public static void main(String[] args) {
        Calculator object01 = new Calculator(10, 10);
        Calculator object001 = new Calculator(-10, 10);
        Calculator object02 = new Calculator(10, -10);
        Calculator object03 = new Calculator(10, 0);
        Calculator object04 = new Calculator(0, 10);

        try {
            object01.add();
        } catch (ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        try{
            object001.add(); //gonna show exception.
        }
        catch (ArithmeticException e){
            System.out.println(e + " - You gave Minus iInteger");
            System.out.println(e.getMessage());
        }

        try{
            object02.subtract(); //gonna show exception.
        }
        catch (ArithmeticException e){
            System.out.println(e + " - You gave minus integer");
            System.out.println(e.getMessage());
        }

        try{
            object03.multiply(); //gonna show exception.
        }
        catch (ArithmeticException e){
            System.out.println(e + " - You gave Zero");
            System.out.println(e.getMessage());
        }
        try{
            object04.Divison(); //gonna show exception.
        }
        catch (ArithmeticException e){
            System.out.println(e + " - You gave Zero");
            System.out.println(e.getMessage());
        }
    }
}
