package Class;

public class prog12 {
    


static class BankAccount {
    public int accountNumber;       
    protected String accountHolder; 
    private double balance;         

   
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + ", New Balance: ₹" + balance);
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + ", Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: ₹" + balance);
    }
}
    
class SavingsAccount extends BankAccount {
    double interestRate;

    
    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    
    public void displaySavingsAccount() {
        System.out.println("Savings Account -> Account Number: " + accountNumber +  // public
                           ", Holder: " + accountHolder +                            // protected
                           ", Balance: ₹" + getBalance() +                           // private via getter
                           ", Interest Rate: " + interestRate + "%");
    }
}


class TestBank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Amit", 5000.0);
        acc1.displayAccount();

        acc1.deposit(2000);
        acc1.withdraw(3000);

       
        acc1.setBalance(10000);
        System.out.println("Updated Balance: ₹" + acc1.getBalance());

        
        SavingsAccount sa1 = new SavingsAccount(2001, "Riya", 15000.0, 4.5);
        sa1.displaySavingsAccount();
    }
}

    
}
