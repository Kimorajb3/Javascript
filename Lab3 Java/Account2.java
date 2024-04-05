public class Account2{
    private int accNo;
    private String owner;
    private double balance;

    public Account2(){}

    public Account2(int acc, String name, double amt){
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
    
    // throw exception here
    public void withdraw(double amount) throws Exception{
        if (amount > balance){
            throw new Exception("Insufficient balance!");
        }
        balance -= amount;
    }

    public void display(){
        String st = String.format("\nAccount.No: %d\n", accNo);
        st += "Owner: " + owner + "\n";
        st += String.format("Balance: %.2f\n", balance);
        System.out.println(st);
    }

    public static void main(String[] args){
        Account2 a1;
        a1 = new Account2(2222, "Frank", 500);
        a1.deposit(100.00);
        try{
            a1.withdraw(900.00);
        }
        catch(Exception e){
            System.out.println("\n" + e);
        }
        a1.display();
    }
}