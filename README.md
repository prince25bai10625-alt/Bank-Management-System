🏦 Bank Management System

A simple console-based Bank Management System developed using Java. This project is designed to demonstrate fundamental Object-Oriented Programming (OOP) concepts.

📌 Features

Create a bank account

Enter account number and account holder name

Set initial account balance

Deposit money

Withdraw money

Check account balance

Display account details

Validate deposit and withdrawal amounts

Prevent withdrawal when balance is insufficient

Prevent creation of multiple accounts

Exit the application

🛠️ Technologies Used

Java

Java Scanner

Object-Oriented Programming (OOP)

Console / Command-Line Interface

📂 Project Structure
BankManagementSystem/
│
├── BankManagementSystem.java
└── README.md

💡 OOP Concepts Used
1. Class

The BankAccount class represents a bank account.

class BankAccount {
    private String accountNumber;
    private String name;
    private double balance;
}

2. Object

An object of the BankAccount class is created when the user creates an account.

account = new BankAccount(accountNumber, name, balance);

3. Encapsulation

The account details are declared as private, which protects the data from direct access outside the class.

private String accountNumber;
private String name;
private double balance;

4. Constructor

The constructor initializes the account information.

BankAccount(String accountNumber, String name, double balance)

5. Methods

The following methods perform different banking operations:

deposit()
withdraw()
checkBalance()
displayDetails()

6. Conditional Statements

if, else if, and else are used to validate transactions.

7. Loop

A do-while loop continuously displays the menu until the user selects the Exit option.

8. Switch Case

A switch statement handles the user's menu selection.

📋 Menu

When the program runs, the following menu is displayed:

================================
       BANK MANAGEMENT SYSTEM
================================
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Display Account Details
6. Exit
================================

▶️ How to Run
Step 1: Install Java

Make sure the Java Development Kit (JDK) is installed.

Check the Java version:

java -version


Check the Java compiler:

javac -version

Step 2: Compile the Program

Open the terminal in the project folder and run:

javac BankManagementSystem.java

Step 3: Run the Program
java BankManagementSystem

🧪 Example
Create Account
Enter your choice: 1

Enter Account Number: 12345
Enter Account Holder Name: Rahul
Enter Initial Balance: ₹5000

Account created successfully!

Deposit Money
Enter your choice: 2

Enter amount to deposit: ₹2000

Amount deposited successfully!
New Balance: ₹7000.0

Withdraw Money
Enter your choice: 3

Enter amount to withdraw: ₹1500

Amount withdrawn successfully!
Remaining Balance: ₹5500.0

Check Balance
Enter your choice: 4

Current Balance: ₹5500.0

Display Account Details
Enter your choice: 5

----- Account Details -----
Account Number : 12345
Account Holder : Rahul
Balance        : ₹5500.0
---------------------------

✅ Validation

The program performs the following validations:

Initial balance cannot be negative.

Deposit amount must be greater than zero.

Withdrawal amount must be greater than zero.

Withdrawal amount cannot exceed the available balance.

An account must be created before depositing or withdrawing money.

Only one account can be created during a program session.

Invalid menu choices are rejected.

⚠️ Limitations

This is a basic beginner-level project. It currently does not provide:

Multiple accounts

Database connectivity

User login

PIN/password authentication

Transaction history

Money transfer

Account deletion

GUI

Permanent data storage

All account information is stored temporarily in memory and will be lost when the program is closed.

🚀 Future Enhancements

The project can be extended by adding:

Multiple bank accounts

User login and authentication

PIN/password protection

Transaction history

Money transfer between accounts

MySQL database connectivity

File-based data storage

Java Swing or JavaFX GUI

Exception handling

Account search

Savings and Current Account types

🎯 Learning Objectives

This project helps beginners understand:

Java classes and objects

Constructors

Encapsulation

Methods

Conditional statements

Loops

Switch-case

User input using Scanner

Basic validation

Practical implementation of OOP concepts

👨‍💻 Author

Prince Raj
📄 License

This project is created for educational and learning purposes.
