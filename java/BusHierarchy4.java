import java.util.Scanner;
class BusInfo {
    String busNo, route;
    void getBus(Scanner sc) {
        System.out.print("Enter Bus Number: ");
        busNo = sc.nextLine();
        System.out.print("Enter Route: ");
        route = sc.nextLine();
    }
    void displayBus() {
        System.out.println("Bus Number: " + busNo);
        System.out.println("Route: " + route);
    }
}
class BusDriver extends BusInfo {
    void driver(Scanner sc) {
        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();
        System.out.println("Driver Name: " + name);
    }
}
class BusConductor extends BusInfo {
    void conductor(Scanner sc) {
        System.out.print("Enter Conductor Name: ");
        String name = sc.nextLine();
        System.out.println("Conductor Name: " + name);
    }
}
public class BusHierarchy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BusDriver d = new BusDriver();
        BusConductor c = new BusConductor();
        System.out.println("----- DRIVER DETAILS -----");
        d.getBus(sc);
        d.displayBus();
        d.driver(sc);
        System.out.println("\n----- CONDUCTOR DETAILS -----");
        c.getBus(sc);
        c.displayBus();
        c.conductor(sc);

        sc.close();
    }
}
