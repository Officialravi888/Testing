package org.example;

public class MySimpleMath {

    public String checkSign(int number) {
        if(number >= 0 ) {
            return "positive";
        } else {
            return "negative";
        }
    }
    public static void main(String args[]) {
        MySimpleMath sm = new MySimpleMath();
        // Check a positive
        System.out.println("Input 10: " + sm.checkSign(10));
        // Check a negative
        System.out.println("Input -2: " + sm.checkSign(-2));
        // Check a positive
        System.out.println("Input 0: " + sm.checkSign(0));

    }
}
