class Bus {
    int busNo;
    String busName;
    String source;
    String destination;
    int seats;
    Bus(int busNo, String busName, String source, String destination, int seats) {
        this.busNo = busNo;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
    }
    void display() {
        System.out.println("Bus Number      : " + busNo);
        System.out.println("Bus Name        : " + busName);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("Available Seats : " + seats);
        System.out.println("-------------------------------");
    }
}
public class BusManagementSystem1 {
    public static void main(String[] args) {
        Bus bus = new Bus(101, "Express", "Coimbatore", "Chennai", 40);
        System.out.println("===== BUS MANAGEMENT SYSTEM =====");
        bus.display();
    }
}


