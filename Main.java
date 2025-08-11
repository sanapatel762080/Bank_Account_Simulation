import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Bank bank = new Bank();
    private static Account account = new Account();
    private static List<String> transaction = new ArrayList<>();

    private static void createAccount() {

        System.out.println("Enter your Account Number");
        long accNumber = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Account Holder Name");
        String name = sc.nextLine();

        System.out.println("Enter Account Type");
        String type = sc.nextLine();

        System.out.println("Enter Opening balance (Minimum 100)");
        double balance = sc.nextDouble();

        Account newAccount = new Account(accNumber, name, balance, type);

        bank.addAccount(newAccount);

    }

    private static void deposit() {

        System.out.println("Enter your Account Number");
        long accNumber = sc.nextLong();
        sc.nextLine();

        Account checkAcc = bank.findAccount(accNumber);

        if (checkAcc != null) {
            System.out.println("Enter amount to deposit");
            double amount = sc.nextDouble();

            if (amount > 0) {
                double newbalance = checkAcc.getBalance() + amount;
                checkAcc.setBalance(newbalance);
                System.out.println("Deposit successful! New balance: " + checkAcc.getBalance());
                transaction.add("Deposited ₹" + amount + " | New Balance: ₹" + checkAcc.getBalance() + " | "
                        + LocalDateTime.now());

            } else {
                System.out.println("Amount must be greater than zero.");

            }
        } else {
            System.out.println("Account not found...");
        }

    }

    private static void withdraw() {
        System.out.println("Enter your Account Number");
        long accNumber = sc.nextLong();
        sc.nextLine();

        Account withdrawAccount = bank.findAccount(accNumber);
        if (withdrawAccount != null) {
            System.out.println("Enter amount to withdraw");
            double amount = sc.nextDouble();

            if (amount > 0 && amount <= withdrawAccount.getBalance()) {
                double newbalance = withdrawAccount.getBalance() - amount;
                withdrawAccount.setBalance(newbalance);
                System.out.println("Withdrawal successful. New balance: ₹" + withdrawAccount.getBalance());
                transaction.add("Withdraw ₹" + amount + " | New Balance: ₹" + withdrawAccount.getBalance() + " | "
                        + LocalDateTime.now());

            } else {
                System.out.println("Invalide amount..");
            }
        } else {
            System.out.println("Account Not Found..");
        }

    }

    private static void checkBalance() {
        System.out.println("Enter your Account Number");
        long accNum = sc.nextLong();
        sc.nextLine();

        Account checkAccount = bank.findAccount(accNum);

        if (checkAccount != null) {
            System.out.println("Balance: ₹" + checkAccount.getBalance());
        } else {
            System.out.println("Account Not Found...");
        }
    }

    private static void checkHistory() {
        System.out.println("Enter your Account Number");
        long accNum = sc.nextLong();
        sc.nextLine();

        Account historyAccount = bank.findAccount(accNum);
        if (historyAccount != null) {
            for (String history : transaction) {
                System.out.println(history);
            }
        } else {
            System.out.println("Account Not Found..!!");
        }

    }

    public static void main(String[] args) {

        boolean flag = true;

        System.out.println("Enter Bank name");
        String bname = sc.nextLine();

        System.out.println("Enter Branch Name");
        String branch = sc.nextLine();

        System.out.println("Enter IFSC Code");
        String code = sc.nextLine();

        Bank b = new Bank(bname, branch, code);

        while (flag) {

            System.out.println("**********Welcome To Bank Management System***************");
            System.out.println("          Choose from the following options              *");
            System.out.println("1. Create an Account                                     *");
            System.out.println("2. Deposit Money                                         *");
            System.out.println("3. Withdraw Money                                        *");
            System.out.println("4. Check Remaining Balance                               *");
            System.out.println("5. Check the transaction history                         *");
            System.out.println("**********************************************************");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    checkHistory();
                    break;

                default:
                    System.out.println("Invalide option...please choose between (1-4)");
            }
        }

    }

}
