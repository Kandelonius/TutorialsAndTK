package com.kandelonius;

public class Numbers
{
    public static void main(String[] args)
    {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));// overflows to MIN_VALUE
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));// underflows to MAX_VALUE

        int myMaxIntTest = 2_147_483_647;// prints out as normal

        System.out.println("MaxInt written out with underscores " + myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Minimum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Minimum Value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);

        //        long bigLongLiteralValue = 2_147_483_648; even though I am calling this a long number it is not
        //        accepted because I don't have the L at the end of the number.
        long bigLongLiteralValue = 2_147_483_648L;
        System.out.println("big long variable is " + bigLongLiteralValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25d;

        myIntValue = 5 / 3;
        myFloatValue = 5f / 3f;
        myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        int myTotal = (myMinIntValue / 2); // dividing an int variable by a number is fine and expected by java

        //        byte myNewByteValue = (myMinByteValue / 2); gets an error because I said I was going to do
        //        something with a byte but java by default puts an int into this type of expression.
        byte myNewByteValue = (byte) (myMinByteValue / 2);// the above is remedied by casting the expression with
        // the
        // intended primitive type.

        //challenge
        byte challengeByte = 125;
        short challengeShort = 13_370;
        int challengeInt = 1_356_404;
        long challengeLong = (50_000 + 10 * (challengeByte + challengeShort + challengeInt));

        System.out.println("Some long number is " + challengeLong);

        //challenge #2
        //convert pounds to kilograms
        double pounds = 200, kilograms = 0;

        kilograms = pounds * 0.45359237;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

        int result = 1 + 2;
        System.out.println("Result is " + result);
        int previousResult = result;
        System.out.println("PreviousReslut is " + previousResult);
        result = result -1;
        System.out.println("3-1 = "+result);
        System.out.println("PreviousReslut is " + previousResult);
        result = result * 10;
        System.out.println("Result is " + result);
        result = result / 5;
        System.out.println("Result is " + result);
        result = result % 3;
        System.out.println("Result is " + result);

    }
}
