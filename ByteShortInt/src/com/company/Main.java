package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int has a width of 32
        int myIntValue=2_147_483_647;

        //byte has a value of 8
        byte myByteValue=-128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = "+ myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;

        //long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
        long newMyLongValue = (long) (myIntValue) + (long) myByteValue+ (long) myShortValue;
        System.out.println(newMyLongValue);

    }
}
