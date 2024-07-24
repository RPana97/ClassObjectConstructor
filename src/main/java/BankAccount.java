
public class BankAccount {
        private String name;
        private int accountBalance;

        public BankAccount (String accountHolder, int initialBalance){
            this.name = accountHolder;
            this.accountBalance = initialBalance;
        }

        public void deposit (int deposit) {
            accountBalance += deposit;
        }

        public void withdrawal (int withdrawal) {
            if (withdrawal > accountBalance) {
                System.out.println("Insufficient funds.");
            } else {
                accountBalance -= withdrawal;
            }
        }

        public void getAccountInfo () {
            System.out.println (name + ", balance: $" + accountBalance);
        }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 5000);
        // Create the second account with $300
        BankAccount account2 = new BankAccount("Jane Smith", 300);

        // Withdraw $100 from the first account
        account1.withdrawal(100);
        // Deposit $100 into the second account
        account2.deposit(100);

        // Print account details
        account1.getAccountInfo();
        account2.getAccountInfo();
    }

}
