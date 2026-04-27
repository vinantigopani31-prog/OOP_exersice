import java.util.Scanner;
class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    Scanner sc = new Scanner(System.in);

    public void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();
        System.out.print("Enter Initial Deposit: ");
        balance = sc.nextDouble();
        System.out.println("Account successfully created!\n");
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
       if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingAccount extends BankAccount {
    double interestRate;
    public void setInterestRate() {
        System.out.print("Enter annual interest rate (%): ");
        interestRate = sc.nextDouble();
    }
    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Calculated Interest: " + interest);
    }
}
class FixedDepositAccount extends BankAccount {
    double interestRate;
    int years;
    public void setFDDetails() {
        System.out.print("Enter FD interest rate (%): ");
        interestRate = sc.nextDouble();
        System.out.print("Enter tenure (years): ");
        years = sc.nextInt();
    }
    public void maturityAmount() {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Account Type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Fixed Deposit Account");
        int choice = sc.nextInt();
        if (choice == 1) {
            SavingAccount sa = new SavingAccount();
            sa.openAccount();
            sa.setInterestRate();
            sa.deposit();
            sa.checkBalance();
            sa.calculateInterest();
            sa.withdraw();
            sa.checkBalance();
        } else if (choice == 2) {
            FixedDepositAccount fd = new FixedDepositAccount();
            fd.openAccount();
            fd.setFDDetails();
            fd.checkBalance();
            fd.maturityAmount();
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}

/*output:
Choose Account Type:
1. Saving Account
2. Fixed Deposit Account
1
Enter Account Number: 001
Enter Account Holder Name: siya 
Enter Initial Deposit: 5000
Account successfully created!

Enter annual interest rate (%): 5
Enter amount to deposit: 1000
Deposit successful!
Current Balance: 6000.0
Calculated Interest: 300.0
Enter amount to withdraw: 500
Withdrawal successful!
Current Balance: 5500.0*/