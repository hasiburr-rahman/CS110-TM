package Generics;

public class vehicle <T> {
    T vehicleInfo;
    double mileage;
    int capacity;

    vehicle(){

    }
    public vehicle(T vehicleInfo, double mileage, int capacity) throws NegativeValueException {
        if (mileage < 0) {
            throw new NegativeValueException("Mileage cannot be negative");
        }
        if (capacity < 0) {
            throw new NegativeValueException("Capacity cannot be negative");
        }
        this.vehicleInfo = vehicleInfo;
        this.mileage = mileage;
        this.capacity = capacity;
    }

    public T getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(T vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) throws NegativeValueException {
        if (capacity < 0) {
            throw new NegativeValueException("Capacity cannot be negative");
        }
        this.capacity = capacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) throws NegativeValueException {
        if (mileage < 0) {
            throw new NegativeValueException("Mileage cannot be negative");
        }
        this.mileage = mileage;
    }
    @Override
    public String toString() {
        return "Vehicle Info: " + vehicleInfo.toString() + ", Mileage: " + mileage + " km/l, Capacity: " + capacity + " passengers";
    }
}
