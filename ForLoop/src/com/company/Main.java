package com.company;

public class Main {

    public static void main(String[] args) {
//        for(double i = 8.0;i>=2.0;i--){
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
//        }
        int count = 0;
        for(int i = 10;i < 80;i++){
            if(isPrime(i)) {
                count++;
                System.out.println(i + " is prime and count is " + count);
            }
            if(count >= 10)
                break;
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }

    public static boolean isPrime(int n){

        if (n <=1 ){
            return false;
        }

        for(int i=2; i<=n/2;i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
