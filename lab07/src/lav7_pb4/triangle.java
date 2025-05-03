package lav7_pb4;

import sun.font.CreatedFontTracker;

public class triangle extends geomatric{
    double side1;
    double side2;
    double side3;

    triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    triangle(double side1, double side2, double side3) throws triangleException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2){
            throw new triangleException("Invalid Triangle");
        }
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getPerimeter(){
       return side1 + side2 + side3;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    

    public String toString(){
        return "Triangle: side1 = " + side1 +  "side2 = " + side2 + "side3 = "+ side3;
    }


}
