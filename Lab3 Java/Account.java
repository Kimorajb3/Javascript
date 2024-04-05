public class Account{
    private int accNo;
    private String owner;
    private double balance;

    public Account(){}

    public Account(int acc, String name, double amt){
        accNo = acc;
        owner = name;
        balance = amt;
    }

    public int getAccNo(){
        return accNo;
    }

    public void setAccNo(int acc){
        accNo = acc;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String name){
        owner = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        balance = amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void display(){
        String st = String.format("\nAccount.No: %d\n", accNo);
        st += "Owner: " + owner + "\n";
        st += String.format("Balance: %.2f\n", balance);
        System.out.println(st);
    }

    public static void main(String[] args){
        Account a1;
        a1 = new Account(2222, "Frank", 1000);
        a1.deposit(100.00);
        a1.display();
    }
}