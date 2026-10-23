class Bus {
    void busDetails() {
        System.out.println("Bus Number: 2331");
        System.out.println("Route: Coimbatore to Hosur");
    }
}

class Driver extends Bus {
    void driverDetails() {
        System.out.println("Driver Name: Raja");
    }
}

class BusManagement extends Driver {
    void passengerDetails() {
        System.out.println("Total Seats: 50");
        System.out.println("Booked Seats: 30");
        System.out.println("Available Seats: 20");
    }
}

public class BusManagementSystem4{
    public static void main(String[] args) {

        BusManagement b = new BusManagement();

        b.busDetails();
        b.driverDetails();
        b.passengerDetails();
    }
}

