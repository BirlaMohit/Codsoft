

//                                                            ATM INTERFACE  


package com.codsoft;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public boolean deposit(double amount) 
    {
        if (amount > 0)
        {
            balance =balance + amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance)
        {
            balance =balance - amount;
            return true;
        }
        return false;
    }

    public double checkBalance()
    {
        return balance;
    }
}

class ATM {
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(double initialBalance) 
    {
        bankAccount = new BankAccount(initialBalance);
        scanner = new Scanner(System.in);
    }

    public void displayMenu() 
    {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run()
    {
        while (true)
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice)
            {
                case "1":
                    checkBalance();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    System.out.println("Exiting ATM. Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public void checkBalance() {
        double balance = bankAccount.checkBalance();
        System.out.println("Your current balance is: $" + balance);
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        
        /*is a built in method in Java that returns a new double initialized to,
        the value represented by the specified String, as done by the valueOf method of class Double.*/
        
        
        double amount = Double.parseDouble(scanner.nextLine());
        if (bankAccount.deposit(amount)) {
            System.out.println("$" + amount + " has been deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if (bankAccount.withdraw(amount)) {
            System.out.println("$" + amount + " has been withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
}

public class  AtmInterface{
    public static void main(String[] args) {
        ATM atm = new ATM(1000); // Initial balance for the bank account
        atm.run();
    }
}
