🏦 Bank Management System

A simple console-based Bank Management System built using Java.
This project demonstrates fundamental Object-Oriented Programming (OOP) concepts by implementing common banking operations through a simple menu-driven interface.

✨ Features

🏦 Create a bank account

💰 Deposit money

💸 Withdraw money

💳 Check account balance

👤 Display account details

✅ Validate transactions

🚫 Prevent withdrawal with insufficient balance

📋 Simple menu-driven interface

🔐 Basic account validation

👤 Supports one account per session

🛠️ Technologies Used
Technology	Purpose
☕ Java	Core programming language
🧩 OOP	Object-oriented design
⌨️ Scanner	User input
🔀 Switch-Case	Menu handling
🔄 Do-While Loop	Continuous menu execution
🧠 Conditional Statements	Transaction validation
🧠 OOP Concepts Demonstrated

This project is designed to demonstrate several important Java and OOP concepts.

📦 Class & Object

BankAccount represents a bank account and contains its related properties and operations.

🏗️ Constructor

A constructor is used to initialize account information when a new account is created.

🔒 Encapsulation

Account information is stored using private variables, providing controlled access through methods.

⚙️ Methods

Separate methods are used to handle different banking operations, including:

Deposit

Withdrawal

Balance checking

Account details

🔍 Conditional Statements

Conditions are used to validate transactions and prevent invalid operations.

🔄 Loops

A do-while loop keeps the application menu running until the user chooses to exit.

🔀 Switch-Case

A switch-case statement is used to process the user's menu selection.

📁 Project Structure
BankManagementSystem/
│
├── 📄 BankManagementSystem.java
└── 📄 README.md

🚀 How to Run
1️⃣ Clone the Repository
git clone https://github.com/your-username/BankManagementSystem.git

2️⃣ Navigate to the Project Folder
cd BankManagementSystem

3️⃣ Compile the Program
javac BankManagementSystem.java

4️⃣ Run the Program
java BankManagementSystem

🖥️ Application Menu
========================================
       🏦 BANK MANAGEMENT SYSTEM
========================================

1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Display Account Details
6. Exit

========================================
Enter your choice:

💻 Example
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

Enter amount to withdraw: ₹1000

Amount withdrawn successfully!
New Balance: ₹6000.0

✅ Validation

The application validates the following conditions:

Initial balance must not be negative.

Deposit amount must be greater than zero.

Withdrawal amount must be greater than zero.

Withdrawal amount must not exceed the available balance.

An account must exist before performing transactions.

Only one account can be created during a session.

⚠️ Limitations

This is a basic educational project and currently does not support:

❌ Multiple accounts

❌ Database storage

❌ User authentication

❌ Transaction history

❌ Money transfers

❌ Persistent account data

Account information is stored only while the program is running.

🔮 Future Improvements

The project can be extended with the following features:

👥 Multiple account support

🔐 User authentication

📜 Transaction history

💸 Money transfer between accounts

🗄️ Database integration

🖥️ GUI using Java Swing or JavaFX

📁 File-based data storage

🛡️ Improved exception handling

🔎 Account search functionality

📊 Transaction summaries

🎯 Learning Objective

The main purpose of this project is to understand Java fundamentals and Object-Oriented Programming by implementing a simple real-world banking application.

Through this project, you can practice:

Java Basics
    ↓
Classes & Objects
    ↓
Constructors
    ↓
Encapsulation
    ↓
Methods
    ↓
Conditional Statements
    ↓
Loops
    ↓
Switch-Case
    ↓
Input Validation

👨‍💻 Author
Prince Raj

This project was created for educational and learning purposes.

⭐ Support

If you found this project useful for learning Java and OOP concepts, consider giving the repository a ⭐ Star!

📌 Note

This project is intended for educational purposes only and is not designed for use as a real-world banking application.
