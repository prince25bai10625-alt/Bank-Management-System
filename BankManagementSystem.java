import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String name;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
 
    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully!");
            System.out.println("New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("---------------------------");
    }
}

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("       BANK MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (account != null) {
                        System.out.println("Account already exists!");
                    } else {
                        System.out.print("Enter Account Number: ");
                        String accountNumber = sc.nextLine();

                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Initial Balance: ₹");
                        double balance = sc.nextDouble();

                        if (balance < 0) {
                            System.out.println("Balance cannot be negative!");
                        } else {
                            account = new BankAccount(
                                    accountNumber,
                                    name,
                                    balance
                            );

                            System.out.println(
                                    "Account created successfully!"
                            );
                        }
                    }
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first!");
                    } else {
                        System.out.print("Enter amount to deposit: ₹");
                        double amount = sc.nextDouble();

                        account.deposit(amount);
                    }
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first!");
                    } else {
                        System.out.print("Enter amount to withdraw: ₹");
                        double amount = sc.nextDouble();

                        account.withdraw(amount);
                    }
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first!");
                    } else {
                        account.checkBalance();
                    }
                    break;

                case 5:
                    if (account == null) {
                        System.out.println("Please create an account first!");
                    } else {
                        account.displayDetails();
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Bank Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}