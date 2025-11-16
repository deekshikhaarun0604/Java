public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay(1000);

        p = new PayPal();
        p.pay(500);

        p = new Cash();
        p.pay(300);
    }
}
