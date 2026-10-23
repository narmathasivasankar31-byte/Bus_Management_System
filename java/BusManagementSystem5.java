class Bus {
    void busDetails() {
        System.out.println("===== BUS DETAILS =====");
        System.out.println("Bus Number : 2331");
        System.out.println("Route      : Coimbatore to Hosur");
    }
}
class Driver extends Bus {
    void driverDetails() {
        System.out.println("===== DRIVER DETAILS =====");
        System.out.println("Driver Name : Raja");
        System.out.println("Driver ID   : D101");
    }
}
class BusManagement extends Driver {
    void busDetails() {
        System.out.println("===== BUS DETAILS (OVERRIDDEN) =====");
        System.out.println("Bus Number : 2331");
        System.out.println("Bus Name   : Express");
        System.out.println("Route      : Coimbatore to Hosur");
        System.out.println("Departure  : 08:30 AM");
    }
    void passengerDetails() {
        System.out.println("===== PASSENGER DETAILS =====");
        System.out.println("Total Seats     : 50");
        System.out.println("Booked Seats    : 30");
        System.out.println("Available Seats : 20");
    }
}
public class BusManagementSystem5 {
    public static void main(String[] args) {
        BusManagement b = new BusManagement();
        b.busDetails();
        b.driverDetails();
        b.passengerDetails();
    }
}
