import java.util.*;
interface BusInfo
{
    void input();
    void display();
}
interface Driver
{
    void driverDetails();
}
interface Passenger
{
    void passengerDetails();
}
class BusManagement implements BusInfo, Driver, Passenger
{
    int busNo, totalSeats, bookedSeats;
    String busName, busType, source, destination;
    String driverName, driverId;
    Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.println("\nEnter Bus Number:");
        busNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Bus Name:");
        busName = sc.nextLine();
        System.out.println("Enter Bus Type:");
        busType = sc.nextLine();
        System.out.println("Enter Source:");
        source = sc.nextLine();
        System.out.println("Enter Destination:");
        destination = sc.nextLine();
        System.out.println("Enter Total Seats:");
        totalSeats = sc.nextInt();
        sc.nextLine();
    }
    public void driverDetails()
    {
        System.out.println("Enter Driver Name:");
        driverName = sc.nextLine();
        System.out.println("Enter Driver ID:");
        driverId = sc.nextLine();
}
    public void passengerDetails()
    {
        System.out.println("Enter Booked Seats:");
        bookedSeats = sc.nextInt();
        sc.nextLine();
        if(bookedSeats <= totalSeats)
        {
            System.out.println("Booking Successful");
        }
        else
        {
            System.out.println("Invalid Booking");
            bookedSeats = 0;
        }
    }
    public void display()
    {
        System.out.println("\n===================================");
        System.out.println("           BUS DETAILS              ");
        System.out.println("===================================");
        System.out.println("Bus Number : " + busNo);
        System.out.println("Bus Name : " + busName);
        System.out.println("Bus Type : " + busType);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Total Seats : " + totalSeats);
        System.out.println("Booked Seats : " + bookedSeats);
        System.out.println("Available Seats : " +
                           (totalSeats - bookedSeats));
        System.out.println("\n======== DRIVER DETAILS ========");
        System.out.println("Driver Name : " + driverName);
        System.out.println("Driver ID : " + driverId);
    }
}
public class BusInterfaceDemo
{
    public static void main(String args[])
    {
        BusManagement[] bus = new BusManagement[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("       BUS MANAGEMENT SYSTEM        ");
        System.out.println("===================================");
        System.out.println("Enter Number of Buses:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            System.out.println("\n---------- BUS " + (i + 1) + " ----------");
            bus[i] = new BusManagement();
            bus[i].input();
            bus[i].driverDetails();
            bus[i].passengerDetails();
        }
        System.out.println("\n\n===================================");
        System.out.println("         ALL BUS DETAILS            ");
        System.out.println("===================================");
        for(int i = 0; i < n; i++)
        {
            bus[i].display();
        }
        sc.close();
    }
}

