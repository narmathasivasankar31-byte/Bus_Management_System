package Narmatha.College;
import java.util.*;
public class BusManagementSystem7
{
    String bus_no, driver_name, route;
    int capacity;
    float fare;

    public void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bus Number:");
        bus_no = sc.nextLine();

        System.out.println("Enter Driver Name:");
        driver_name = sc.nextLine();

        System.out.println("Enter Route:");
        route = sc.nextLine();

        System.out.println("Enter Bus Capacity:");
        capacity = sc.nextInt();

        System.out.println("Enter Bus Fare:");
        fare = sc.nextFloat();
    }

    public void display()
    {
        System.out.println("===================================");
        System.out.println("       BUS MANAGEMENT DETAILS       ");
        System.out.println("===================================");
        System.out.println("Bus Number : " + bus_no);
        System.out.println("Driver Name : " + driver_name);
        System.out.println("Route : " + route);
        System.out.println("Bus Capacity : " + capacity);
        System.out.println("Bus Fare : " + fare);
    }
}

