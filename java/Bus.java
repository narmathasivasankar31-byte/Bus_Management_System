class Bus extends Thread {
    String busNumber;
    int seats;

    Bus(String busNumber, int seats) {
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

        Bus bus1 = new Bus("TN 38 AB 1234", 10);
        Bus bus2 = new Bus("TN 37 CD 5678", 3);

        bus1.start();
        bus2.start();
    }
}
