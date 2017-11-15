package com.company;

public class VipCustomer {
    VipCustomer(){
        this("hassaan",25000, "pasha.hassaan@gmail.com");
    }

    VipCustomer(String name, String email){
        this(name,50000,email);
    }

    VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
