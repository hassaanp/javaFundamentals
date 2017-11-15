package com.company;

public class BankAccount {

    BankAccount(){
        this("abc123",100,"nobody","default@nop.com","123123");
        System.out.println("Empty constructore called");
    }

    BankAccount(String accountNumber, float balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    private String accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() { return this.accountNumber; }

    public float getBalance() {return this.balance;}

    public String getCustomerName() {return this.customerName;}

    public String getEmail() {return this.email;}


    public String  getPhoneNumber(){return this.phoneNumber;}
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(float depositAmount){
        this.balance += depositAmount;
        System.out.println(depositAmount+" deposited in your account");
        System.out.println("New balance is: "+balance);
    }

    public void withdrawFunds(float withdrawAmount){
        if(this.balance < withdrawAmount) {
            System.out.println("Insufficient Funds");
        }
        else {
            this.balance -= withdrawAmount;
            System.out.println("Amout of " + withdrawAmount + " deducted from balance");
            System.out.println("New balance is "+ balance);
        }
    }

}
