public class ATMSystem {

    static class Account {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

       
        public Account(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }

        
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount!");
            } else if (amount > balance) {
                System.out.println("Insufficient balance! Withdrawal denied.");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }

        
        public double getBalance() {
            return balance;
        }

        
        public String getAccountHolderName() {
            return accountHolderName;
        }
    }

    
    public static void main(String[] args) {

       
        Account acc = new Account("ACC12345", "Deekshikha", 5000);

        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Initial Balance: " + acc.getBalance());

        System.out.println("\n--- Performing Transactions ---");

        acc.deposit(1500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.withdraw(2000);
        System.out.println("Balance after withdrawal: " + acc.getBalance());

        acc.withdraw(6000);    
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
