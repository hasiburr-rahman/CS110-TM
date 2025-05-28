package FileHandling;

import java.io.*;
import java.util.ArrayList;

// Class to represent a bus route
class Route {
    private int routeNo;
    private String departureStop;
    private String arrivalStop;

    public Route(int routeNo, String departureStop, String arrivalStop) {
        this.routeNo = routeNo;
        this.departureStop = departureStop;
        this.arrivalStop = arrivalStop;
    }

    public int getRouteNo() {
        return routeNo;
    }

    public String getDepartureStop() {
        return departureStop;
    }

    public String getArrivalStop() {
        return arrivalStop;
    }
}

// Class to represent a bus
class Bus {
    private int regNo;
    private String busName;
    private Route busRoute;

    public Bus(int regNo, String busName, Route busRoute) {
        this.regNo = regNo;
        this.busName = busName;
        this.busRoute = busRoute;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getBusName() {
        return busName;
    }

    public Route getBusRoute() {
        return busRoute;
    }
}

// Main class to write bus data to a binary file
public class BusDataWriter {
    public static void main(String[] args) {
        // Create route and bus lists
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Route> routes = new ArrayList<>();

        // Add sample routes
        routes.add(new Route(1, "Dhaka", "Chittagong"));
        routes.add(new Route(2, "Sylhet", "Rajshahi"));

        // Add buses with routes
        buses.add(new Bus(101, "GreenLine", routes.get(0)));
        buses.add(new Bus(102, "Shyamoli", routes.get(1)));

        // Write bus data to file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/java/ForFinal/untitled/src/FileHandling/buses.dat"))) {
            for (Bus bus : buses) {
                dos.writeInt(bus.getRegNo());
                dos.writeUTF(bus.getBusName());
                dos.writeInt(bus.getBusRoute().getRouteNo());
                dos.writeUTF(bus.getBusRoute().getDepartureStop());
                dos.writeUTF(bus.getBusRoute().getArrivalStop());
            }
            System.out.println("Data successfully written to buses.dat!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
