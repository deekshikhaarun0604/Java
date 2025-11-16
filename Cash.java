public class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash.");
    }
}
