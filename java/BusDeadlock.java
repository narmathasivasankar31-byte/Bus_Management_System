class BusDeadlock extends Thread
{
    static Object bus = new Object();
    static Object ticket = new Object();
    int choice;
    String staffName;
    BusDeadlock(int choice, String staffName)
    {
        this.choice = choice;
        this.staffName = staffName;
    }
    public void run()
    {
        if (choice == 1)
        {
            synchronized (bus)
            {
                System.out.println(staffName + ": Bus locked");
                try
                {
                    Thread.sleep(100);
                }
                catch (Exception e)
                {
                }
                synchronized (ticket)
                {
                    System.out.println(staffName + ": Ticket Counter locked");
                }
            }
        }
        else
        {
            synchronized (ticket)
            {
                System.out.println(staffName + ": Ticket Counter locked");
                try
                {
                    Thread.sleep(100);
                }
                catch (Exception e)
                {
                }
                synchronized (bus)
                {
                    System.out.println(staffName + ": Bus locked");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        BusDeadlock staff1 =
            new BusDeadlock(1, "Staff 1");

        BusDeadlock staff2 =
            new BusDeadlock(2, "Staff 2");

        System.out.println("Bus Management System Started");

        staff1.start();
        staff2.start();
    }
}


