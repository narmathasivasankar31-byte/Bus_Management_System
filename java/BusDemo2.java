class BusDetails {
    private int busNo;
    private String busName;
    private String source;
    private String destination;
    static String company = "ABC Travels";
    BusDetails(int busNo, String busName, String source, String destination) {
        this.busNo = busNo;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
    }
    public void display() {
        System.out.println("Company      : " + company);
        System.out.println("Bus Number   : " + busNo);
        System.out.println("Bus Name     : " + busName);
        System.out.println("Source       : " + source);
        System.out.println("Destination  : " + destination);
    }
    public void display(String type) {
        System.out.println("\nBus Type     : " + type);
        display();
    }
}
public class BusDemo2 {
    public static void main(String[] args) {
        BusDetails bus= new BusDetails(231, "Dream line", "Coimbatore", "Hosur");
        System.out.println("====== BUS MANAGEMENT SYSTEM ======");
        bus.display();

        
    }
}
