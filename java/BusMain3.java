import java.util.Scanner;
class BusInfo {
    int busNo;
    String busName;
    String source;
    String destination;
    BusInfo(int busNo, String busName, String source, String destination) {
        this.busNo = busNo;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
    }
    void display() {
        System.out.println("\n===== BUS DETAILS =====");
        System.out.println("Bus Number : " + busNo);
        System.out.println("Bus Name   : " + busName);
        System.out.println("Source     : " + source);
        System.out.println("Destination: " + destination);
    }
}
public class BusMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== BUS MANAGEMENT SYSTEM =====");

        System.out.print("Enter Bus Number: ");
        int busNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bus Name: ");
        String busName = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();
        BusInfo bus = new BusInfo(busNo, busName, source, destination);
        bus.display();
        sc.close();
    }
}

