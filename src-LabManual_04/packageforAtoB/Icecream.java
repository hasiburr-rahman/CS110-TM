package packageforAtoB;

public class Icecream {
    String type;
    String company;
    double price;

    Icecream(String type, String company, double price){
        this.type = type;
        this.company = company;
        this.price = price;
    }

    public String toString(){
        return "Type: " + type + ", Company: " + company + ", Price: " + price;
    }
}
