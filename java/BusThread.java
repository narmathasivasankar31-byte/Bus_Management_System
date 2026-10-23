class BusManagement implements Runnable {

    String busNumber;
    int seats;

    BusManagement(String busNumber, int seats) {
        this.busNumber = busNumber;
        this.seats = seats;
    }

    public void run() {

        System.out.println("Bus Number : " + busNumber);
        System.out.println("Seats      : " + seats);

        if (seats < 5) {
            System.out.println("Status     : Few Seats Available");
        } else {
            System.out.println("Status     : Seats Available");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        BusManagement bus1 = new BusManagement("TN 40 XY 7890", 2);
        BusManagement bus2 = new BusManagement("TN 41 PQ 4567", 15);

        Thread t1 = new Thread(bus1);
        Thread t2 = new Thread(bus2);

        t1.start();
        t2.start();
    }
}

