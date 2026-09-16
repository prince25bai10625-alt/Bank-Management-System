Bank Management System

A simple console-based Bank Management System built using Java. This project demonstrates basic Object-Oriented Programming concepts through common banking operations.

Features

Create a bank account

Deposit money

Withdraw money

Check account balance

Display account details

Validate transactions

Prevent withdrawal with insufficient balance

Simple menu-driven interface

Technologies Used

Java

Object-Oriented Programming (OOP)

Scanner

Switch-Case

Do-While Loop

OOP Concepts

This project demonstrates the following Java concepts:

Class & Object — BankAccount represents a bank account.

Constructor — Initializes account details.

Encapsulation — Account information is stored using private variables.

Methods — Separate methods handle deposit, withdrawal, balance checking, and account details.

Conditional Statements — Used for transaction validation.

Loops — Used to keep the menu running.

Switch-Case — Used to handle menu options.

Project Structure
BankManagementSystem/
├── BankManagementSystem.java
└── README.md

How to Run
1. Clone the repository
git clone https://github.com/your-username/BankManagementSystem.git

2. Navigate to the project folder
cd BankManagementSystem

3. Compile the program
javac BankManagementSystem.java

4. Run the program
java BankManagementSystem

Application Menu
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

Example
Enter your choice: 1

Enter Account Number: 12345
Enter Account Holder Name: Rahul
Enter Initial Balance: ₹5000

Account created successfully!

Enter your choice: 2
Enter amount to deposit: ₹2000

Amount deposited successfully!
New Balance: ₹7000.0

Validation

The application checks that:

Initial balance is not negative.

Deposit amount is greater than zero.

Withdrawal amount is greater than zero.

Withdrawal amount does not exceed the available balance.

An account exists before performing transactions.

Only one account can be created during a session.

Limitations

This is a basic educational project. It currently does not support multiple accounts, database storage, authentication, transaction history, or money transfers. Account data is stored only while the program is running.

Future Improvements

Multiple account support

User authentication

Transaction history

Money transfer

Database integration

GUI using Java Swing or JavaFX

File-based data storage

Improved exception handling

Learning Objective

The main purpose of this project is to understand Java fundamentals and Object-Oriented Programming by implementing a simple real-world banking application.

Author

Prince raj

This project was created for educational and learning purposes.
