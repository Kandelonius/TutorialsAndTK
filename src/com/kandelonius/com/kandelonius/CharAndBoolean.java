package com.kandelonius;

public class CharAndBoolean
{
    public static void main(String[] args)
    {
        char myChar = 'D'; // remember single quote
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        String myString = "This is a string";
        System.out.println("myString is equal to: "+myString);
        myString = myString+", and this is more";
        System.out.println("now myString is equal to: "+myString);
        myString = myString+" \u00A9 2020";
        System.out.println("now myString with copyright is equal to: "+myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to: "+lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to: "+lastString);
    }
}
