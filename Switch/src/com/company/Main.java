package com.company;

public class Main {

    public static void main(String[] args) {
//        int value=1;
//        if(value ==1){
//            System.out.println("value was 1");
//        } else if(value ==2){
//            System.out.println("value was 2");
//        } else{
//            System.out.println("value was not 1 or 2");
//        }
//
//        int switchValue =6;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("switchValue was 1");
//                break;
//            case 2:
//                System.out.println("switchValue was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was 3/4/5");
//                break;
//            default:
//                System.out.println("switch value was not 1 or 2");
//                break;
//        }
        char test = 'A';
        System.out.println((int) test);

        char value = 'A';

        switch(value){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("it was " + value);
                break;
            default:
                System.out.println("Not found");
                break;
        }


    }
}
