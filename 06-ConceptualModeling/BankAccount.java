public class BankAccount {
    int accountNumber;
    String holderName;
    String holderSurname;
    double accountBalance = 0;
    boolean isActive = true;

    

    public BankAccount(int accountNumber, String holderName, String holderSurname) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.holderSurname = holderSurname;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setHolderSurname(String holderSurname) {
        this.holderSurname = holderSurname;
    }

    public void deposit(int money) {
        accountBalance += money;
    }

    public void withdraw(int money) {
        if (money <= accountBalance || money > 500) {
            accountBalance -= money;
        }else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public void block() {
        isActive = false;
    }

    public void unblock() {
        isActive = true;
    }

    public String toString() {
        return "Account ballane: " + accountBalance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(2137, "Mariusz", "Pudzianowski");
        account1.deposit(500);
        System.out.println(account1.toString());
        account1.deposit(200);
        System.out.println(account1.toString());
        account1.withdraw(300);
        System.out.println(account1.toString());
        account1.withdraw(600);
        account1.withdraw(500);
        
    }
}