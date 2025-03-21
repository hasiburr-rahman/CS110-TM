package packageforCtoF;

public class icecream {
    private String type;
    private String company;
    private double price;

    icecream(){
        this.price = 00.0;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    void display(){
        System.out.println("Type: "+type+"\ncompany: "+company+"\nPrice: "+price);
    }

    public boolean equals(icecream i) {
        return this.price == i.price;
    }
    public int compareTo(icecream i) {
        if (this.price > i.price) {
            return 1;
        } else if (this.price == i.price) {
            return 0;
        } else {
            return -1;
        }
    }


}
