import java.lang.*;

class BusSystem {

    boolean busReady = false;

    synchronized void updateBus() {

        System.out.println("Bus Management: Bus status updated");

        busReady = true;

        notifyAll();
    }

    synchronized void checkBus() {

        while (!busReady) {

            try {
                wait();
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Bus Monitoring: Bus is ready");
    }
}

class BusUpdate extends Thread {

    BusSystem bus;

    BusUpdate(BusSystem bus) {
        this.bus = bus;
    }

    public void run() {
        bus.updateBus();
    }
}

class BusMonitor extends Thread {

    BusSystem bus;

    BusMonitor(BusSystem bus) {
        this.bus = bus;
    }

    public void run() {
        bus.checkBus();
    }
}

public class BusManagement10 {

    public static void main(String[] args) {

        System.out.println("Bus Management System");

        BusSystem bus = new BusSystem();

        BusUpdate t1 = new BusUpdate(bus);
        BusMonitor t2 = new BusMonitor(bus);

        t2.start();
        t1.start();
    }
}





