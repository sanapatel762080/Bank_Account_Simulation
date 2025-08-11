# Bank Account Simulation (Java)

A simple console-based bank management system implemented using **core Java** concepts.  
This project demonstrates **OOP principles** such as classes, objects, encapsulation, and basic collections (`ArrayList`).


## Features
- Create a bank account
- Deposit money
- Withdraw money
- Check balance
- View transaction history
- Support for **multiple accounts** in a single bank

---

## 🛠 Technologies Used
- **Java** (Core Java, OOP, Collections)
- **Scanner** for console input
- **ArrayList** to store accounts and transaction history

---


##  Class Overview

### **Account**
- Attributes: `accountNumber`, `accountHolderName`, `balance`, `accountType`, `transactionHistory`
- Getters & setters

### **Bank**
- Attributes: `bankName`, `branchName`, `ifscCode`, `accounts`
- Methods:
  - `addAccount(Account account)`
  - `findAccount(long accountNumber)`

### **Main**
- Handles user menu and console interaction.
- Uses `Scanner` for input.
- Calls methods from `Bank` and `Account`.
-Methods :
  - `deposit()`
  - `withdraw()`
  - `checkHistory()`


## ▶️ How to Run
1. Clone or download this project.
2. Open it in any Java IDE (**VS Code**,**Eclipse**, **IntelliJ IDEA**) or use terminal.
3. Compile the files:
   ```bash
    javac Main.java
4. Run the program:
    java Main

## Author : Sana Patel
- Java Developer in training, passionate about building real-world applications using core Java concepts.

