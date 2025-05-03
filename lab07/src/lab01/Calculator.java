package lab01;

public class Calculator {
    int a,b;
    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    void add() throws ArithmeticException {
        if(a<0 || b<0) throw new ArithmeticException("Device Error");
        System.out.println("Adding: " + (a+b));
    }
    void subtract() throws ArithmeticException {
        if(a<0 || b<0) throw new ArithmeticException("Device Error");
        System.out.println("Subtract: " + (a-b));
    }
    void multiply() throws ArithmeticException {
        if(a==0 || b==0) throw new ArithmeticException("Device Error");
        System.out.println("Multiplication: " + (a*b));
    }
    void Divison() throws ArithmeticException {
        if(a==0 || b==0) throw new ArithmeticException("Device Error");
        System.out.println("Adding: " + (a+b));
    }
}



