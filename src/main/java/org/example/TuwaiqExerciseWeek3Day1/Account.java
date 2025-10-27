package org.example.TuwaiqExerciseWeek3Day1;

public class Account
{
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int balance, String name, String id) {
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        return balance + amount;
    }

    public int debit(int amount){
        if(amount <= balance){
            return balance - amount;
        }else {
            System.out.println("your current balance is "+ balance + " and you can withdraw "+ amount);
            return balance;
        }

    }

    public int transferTo(Account otherAccount, int amount){
        if (balance >= amount){
            System.out.println("a transfer from "+name+"`s account to "+otherAccount.getName()+"`s account of "+amount+"RS has been made");
            return otherAccount.getBalance() + amount;
        }else {
            System.out.println("your current balance is "+ balance + " and you can transfer "+ amount+" to "+otherAccount.getName());
            return otherAccount.balance;
        }
    }





    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id=" + id +
                ", owner=" + name +
                ", balance=" + balance +
                "]";
    }
}
