import java.util.*;
class Bus
{
    String bus_no, driver_name, driver_mobile;
    String route, source, destination;
    int capacity, available_seats;
    double fare;
}
class InvalidCapacityException extends Exception
{
    InvalidCapacityException(String message)
    {
        super(message);
    }
}
class InvalidSeatsException extends Exception
{
    InvalidSeatsException(String message)
    {
        super(message);
    }
}
class InvalidFareException extends Exception
{
    InvalidFareException(String message)
    {
        super(message);
    }
}
class InvalidMobileException extends Exception
{
    InvalidMobileException(String message)
    {
        super(message);
    }
}
class InvalidRouteException extends Exception
{
    InvalidRouteException(String message)
    {
        super(message);
    }
}
class BusError
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bus bus = new Bus();
        try
        {
            System.out.println("===================================");
            System.out.println("       BUS MANAGEMENT SYSTEM");
            System.out.println("===================================");
            System.out.println("Enter Bus Number:");
            bus.bus_no = sc.nextLine();
            System.out.println("Enter Driver Name:");
            bus.driver_name = sc.nextLine();
            System.out.println("Enter Driver Mobile Number:");
            bus.driver_mobile = sc.nextLine();
            if(bus.driver_mobile.length() != 10)
            {
                throw new InvalidMobileException(
                    "Invalid Mobile Number: Mobile number must contain 10 digits");
            }
            System.out.println("Enter Source:");
            bus.source = sc.nextLine();
            System.out.println("Enter Destination:");
            bus.destination = sc.nextLine();
            if(bus.source.equalsIgnoreCase(bus.destination))
            {
                throw new InvalidRouteException(
                    "Invalid Route: Source and destination cannot be the same");
            }
            bus.route = bus.source + " to " + bus.destination;
            System.out.println("Enter Bus Capacity:");
            bus.capacity = sc.nextInt();
            if(bus.capacity <= 0)
            {
                throw new InvalidCapacityException(
                    "Invalid Capacity: Bus capacity must be greater than 0");
            }
            System.out.println("Enter Available Seats:");
            bus.available_seats = sc.nextInt();
            if(bus.available_seats < 0 ||
               bus.available_seats > bus.capacity)
           {
                throw new InvalidSeatsException(
                    "Invalid Seats: Available seats must be between 0 and bus capacity");
            }
            System.out.println("Enter Bus Fare:");
            bus.fare = sc.nextDouble();
            if(bus.fare <= 0)
            {
                throw new InvalidFareException(
                    "Invalid Fare: Bus fare must be greater than 0");
            }
            System.out.println();
            System.out.println("===================================");
            System.out.println("       BUS MANAGEMENT DETAILS");
            System.out.println("===================================");

            System.out.println("Bus Number       : " + bus.bus_no);
            System.out.println("Driver Name      : " + bus.driver_name);
            System.out.println("Driver Mobile    : " + bus.driver_mobile);
            System.out.println("Source           : " + bus.source);
            System.out.println("Destination      : " + bus.destination);
            System.out.println("Route            : " + bus.route);
            System.out.println("Bus Capacity     : " + bus.capacity);
            System.out.println("Available Seats  : " + bus.available_seats);
            System.out.println("Booked Seats     : "
                               + (bus.capacity - bus.available_seats));
            System.out.println("Bus Fare         : " + bus.fare);
            System.out.println("===================================");
            if(bus.available_seats == 0)
            {
                System.out.println("Bus Status       : FULL");
            }
            else
            {
                System.out.println("Bus Status       : SEATS AVAILABLE");
            }

            System.out.println("===================================");
        }
        catch(InvalidMobileException e)
        {
            System.out.println(e.getMessage());
        }

         catch(InvalidRouteException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidCapacityException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidSeatsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidFareException e)
        {
            System.out.println(e.getMessage());
        }
    }
}








