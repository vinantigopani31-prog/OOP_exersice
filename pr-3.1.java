class BankAccount {
    private String accountHolderName;
    private double balance;

    private static double interestRate = 5.0;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Amit", 10000);
        BankAccount acc2 = new BankAccount("Sara", 20000);

        System.out.println("=== Before Interest Rate Change ===");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.updateInterestRate(7.5);

        System.out.println("=== After Interest Rate Change ===");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}

/*output:
=== Before Interest Rate Change ===
Account Holder: Amit
Balance: 10000.0
Interest Rate: 5.0%
Interest Earned: 500.0

Account Holder: Sara
Balance: 20000.0
Interest Rate: 5.0%
Interest Earned: 1000.0

=== After Interest Rate Change ===
Account Holder: Amit
Balance: 10000.0
Interest Rate: 7.5%
Interest Earned: 750.0

Account Holder: Sara
Balance: 20000.0
Interest Rate: 7.5%
Interest Earned: 1500.0*/