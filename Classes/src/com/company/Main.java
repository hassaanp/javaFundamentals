package com.company;

public class Main {

    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("Carrera");
//        porsche.setDoors(4);
//        System.out.println(porsche.getAll()[1]);
//        BankAccount hassaan = new BankAccount();
//
//        hassaan.setAccountNumber("abc00009002424");
//        hassaan.setBalance(2000);
//        hassaan.setCustomerName("Hassaan Pasha");
//        hassaan.setEmail("pasha.hassaan@gmail.com");
//        hassaan.setPhoneNumber("03347767442");
//
//        System.out.println(hassaan.getAccountNumber() + " "+ hassaan.getCustomerName() + " "+hassaan.getEmail()+ " "+hassaan.getBalance()+" "+hassaan.getPhoneNumber());
//
//        hassaan.depositFunds(4500);
//        hassaan.withdrawFunds(20000);
//        hassaan.withdrawFunds(2000);

        VipCustomer pasha = new VipCustomer();
        System.out.println(pasha.getCreditLimit()+" "+pasha.getEmail()+" "+pasha.getName());

        VipCustomer maha = new VipCustomer("Maha", 100000, "maha.kassim@gmail.com");
        System.out.println(maha.getCreditLimit()+" "+maha.getEmail()+" "+maha.getName());

        VipCustomer samara = new VipCustomer("Samara","samara.pasha@gmail.com");
        System.out.println(samara.getCreditLimit()+" "+samara.getEmail()+" "+samara.getName());

    }
}
