class TicketCounter {
    private int tickets = 1; 
    public synchronized void bookTicket(String customerName) {
        if (tickets > 0) {
            System.out.println(customerName + " is trying to book...");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets--;
            System.out.println(customerName + " successfully booked the ticket!");
        } else {
            System.out.println(customerName + " could NOT book. Ticket already sold.");
        }
    }
}


class Customer extends Thread {
    private TicketCounter counter;
    private String customerName;

    public Customer(TicketCounter counter, String customerName) {
        this.counter = counter;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        counter.bookTicket(customerName);
    }
}

public class TicketBooking {
    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        
        Customer c1 = new Customer(counter, "Customer 1");
        Customer c2 = new Customer(counter, "Customer 2");

        c1.start();
        c2.start();
    }
}
