package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
//	    while(count != 6){
//            System.out.println(count);
//            count++;
//        }

        count =1;
	    while(true){
	        if(count == 6)
	            break;
            System.out.println("count value is "+count);
            count++;
        }

        count = 6;
	    do {
            System.out.println(count);
            count++;
        } while(count <= 6);

        count=0;
        int num = -4;
	    while(num<= 20){
	        if(isEven(num)) {
                System.out.println(num + " is even");
                count++;
            }
	        num++;
	        if(count==5)
	            break;
        }
    }

    public static boolean isEven(int n){
        if(n % 2 == 0)
            return true;
        return false;
    }
}
