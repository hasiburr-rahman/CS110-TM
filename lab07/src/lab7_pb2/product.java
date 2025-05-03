package lab7_pb2;

class product{
    void productCheck(int weight) throws MyException {
        if (weight < 100 ){
            throw new MyException("invalid weight");
        } else {
            System.out.println("Product weight: " + weight);
        }
    }
}
