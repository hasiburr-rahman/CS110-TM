package packageForFraction;

public class fraction {
    private int numerator;
    private int denominator;

    public fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }

    void add(fraction f){
        numerator = this.numerator * f.getDenominator() + f.getNumerator()*denominator;
        denominator = this.denominator * f.getDenominator();
    }

    void sub(fraction f){
        numerator = this.numerator * f.getDenominator() - f.getNumerator()*denominator;
        denominator = this.denominator * f.getDenominator();
    }

    void multiplication(fraction f){
        numerator = this.numerator * f.getDenominator();
        denominator = this.denominator * f.getDenominator();
    }

    void division(fraction f){
        numerator = this.numerator * f.getDenominator();
        denominator = this.denominator * f.getNumerator();
    }


}
