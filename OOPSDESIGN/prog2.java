package CORE;
import java.util.*;
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    
    public void viewBalance() {
        System.out.println("\nCustomer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber() + ", Balance: " + acc.getBalance());
        }
    }
}
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void openAccount(Customer customer, String accNo, double initialDeposit) {
        Account newAcc = new Account(accNo, initialDeposit);
        customer.addAccount(newAcc);
        if (!customers.contains(customer)) {
            customers.add(customer); 
        }
        System.out.println("Account " + accNo + " opened for " + customer.getName() + " with balance " + initialDeposit);
    }

    public void showAllCustomers() {
        System.out.println("\nBank: " + bankName + " - Customers:");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}


public class prog2 {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

      
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");


        bank.openAccount(c1, "ACC1001", 5000);
        bank.openAccount(c1, "ACC1002", 10000);
        bank.openAccount(c2, "ACC2001", 7000);

      
        c1.viewBalance();
        c2.viewBalance();

        bank.showAllCustomers();
    }
}
