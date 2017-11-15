package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "this is a string";
        myString += " I pity the fool\u00AE";
        System.out.println(myString);
    }
}
