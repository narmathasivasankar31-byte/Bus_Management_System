import java.util.*;
abstract class Bus
{
    int busNo, totalSeats, availableSeats;
    String busName, source, destination, driverName;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bus Number:");
        busNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Bus Name:");
        busName = sc.nextLine();
        System.out.println("Enter Source:");
        source = sc.nextLine();
        System.out.println("Enter Destination:");
        destination = sc.nextLine();
        System.out.println("Enter Driver Name:");
        driverName = sc.nextLine();
        System.out.println("Enter Total Seats:");
        totalSeats = sc.nextInt();
        System.out.println("Enter Available Seats:");
        availableSeats = sc.nextInt();
    }
    void info()
    {
        System.out.println("===================================");
        System.out.println("        BUS MANAGEMENT SYSTEM       ");
        System.out.println("===================================");
        System.out.println("          BUS DETAILS               ");
    }
    abstract void inputBusDetails();
    abstract void display();
}
class BusDetails extends Bus
{
    String busType, timing;
    void inputBusDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bus Type:");
        busType = sc.nextLine();
        System.out.println("Enter Bus Timing:");
        timing = sc.nextLine();
    }
    void display()
    {
        System.out.println("===================================");
        System.out.println("Bus Number      : " + busNo);
        System.out.println("Bus Name        : " + busName);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("Driver Name     : " + driverName);
        System.out.println("Total Seats     : " + totalSeats);
        System.out.println("Available Seats : " + availableSeats);
        System.out.println("Bus Type        : " + busType);
        System.out.println("Timing          : " + timing);
    }
}
public class BusAbstractDemo
{
    public static void main(String[] args)
    {
        Bus b = new BusDetails();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Buses:");
        n = sc.nextInt();
        sc.nextLine();
        BusDetails[] bus = new BusDetails[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEnter Details for Bus " + (i + 1));
            bus[i] = new BusDetails();
            bus[i].input();
            bus[i].inputBusDetails();
        }
        b.info();
        for(int i = 0; i < n; i++)
        {
            bus[i].display();
        }
    }
}
