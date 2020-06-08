package com.kandelonius;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void method(short s) {
        System.out.println("short");
    }

    public static void method(byte b) {
        System.out.println("byte");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }
    public static void main(String[] args)
    {

        class Frog
        {
            private String name;

            private int age;

            public void setName(String name)
            {
                this.name = name;
            }

            public void setAge(int age)
            {
                this.age = age;
            }

            public String getName()
            {
                return name;
            }

            public int getAge()
            {
                return age;
            }
        }
        //class Robot {
        //    public void speak(String text) {
        //        System.out.println(text);
        //    }
        //    public void jump(int height) {
        //        System.out.println("Jumping: " + height);
        //    }
        //    public void move(String direction, double distance) {
        //        System.out.println("Moving " + distance + " meters in direction " + direction);
        //    }
        //}
        //class Person {
        //    // Instance variables (data or 'state)
        //    // Classes can contain
        //
        //    // 1. Data
        //    String name;
        //    int age;
        //    // 2. Subroutines (methods)
        //    void speak() { // can loop in here
        //        System.out.println("Hello my name is: " + name + " and I am " + age + " years old ");
        //    }
        //    void sayHello() { // void for no return
        //        short num1 = 3;
        //        short num2 = 5;
        //        int multiplied = num1 * num2;
        //        System.out.println(multiplied);
        //    }
        //    int calculateYearsToRetirement() { // primitive value for return
        //        //        System.out.println(yearsLeft);
        //        return 65 - age;
        //    }
        //    int getAge() {
        //        return age;
        //    }
        //    String getName() {
        //        return name;
        //    }
        //}


        Scanner stdIn = new Scanner(System.in);

        Frog frog1 = new Frog();
        //        frog1.name = "Bertie";
        //        frog1.age = 1;

        frog1.setName("Bertie");
        frog1.setAge(1);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());

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

        int myTotal = (myMinIntValue / 2); // dividing an int variable by a number is fine and expected by java

        //        byte myNewByteValue = (myMinByteValue / 2); gets an error because I said I was going to do
        //        something with a byte but java by default puts an int into this type of expression.
        byte myNewByteValue = (byte) (myMinByteValue / 2);// the above is remedied by casting the expression with the
        // intended primitive type.

        //challenge
        byte challengeByte = 125;
        short challengeShort = 13_370;
        int challengeInt = 1_356_404;
        long challengeLong = (50_000 + 10 * (challengeByte + challengeShort + challengeInt));

        System.out.println("Some long number is " + challengeLong);
        method(10); // prints int

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.next();// reading a name

        System.out.println("What a great name you have,"+  name +"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3, remainder5, remainder7, totalAge = 0;// reading all remainders
        remainder3 = scanner.nextInt();
        remainder5 = scanner.nextInt();
        remainder7 = scanner.nextInt();

        totalAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;


        System.out.println("Your age is "+ totalAge+" that's a good time to start programming!");
        System.out.println(24%2);

        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n);

        //        Robot sam = new Robot();
        //
        //        String greeting = "Hello there.";
        //        sam.speak(greeting);
        //        sam.speak("Hi I'm Sam.");
        //        sam.jump(7);
        //        sam.move("West", 12.2);
        //        int value = 14;
        //        sam.jump(value);

        //        Person person1 = new Person();
        //
        //        person1.name = "Joe Bloggs";
        //        person1.age = 37;
        //        person1.speak();
        //
        //        Person person2 = new Person();
        //
        //        person2.name = "Sarah Smith";
        //        person2.age = 20;
        //        person2.sayHello();
        //
        //        int years = person1.calculateYearsToRetirement();
        //        int age = person1.getAge(); // extra call for age
        //        String name = person1.getName();
        //        System.out.println(person1.name + " has " + years + " until retirement.");
        //
        //        System.out.println(person1);
        //        System.out.println(person2);
/*
        int myNumber = 100;
        short myShort = 467;
        long myLong = 9874403;
        double myDouble = 3.889; // decimal number
        float myFloat = 3.449f; // short version of double

        char myChar = 'c';
        boolean myBoolean = true;
        byte myByte = 127; // 8 bits of data can be negative or positive.

        String text = "Hey der ho der";
        String name = "Bob";
        String blank = " ";
        String greeting = text + blank + name;

        while(myNumber < 1000){
            myNumber += myNumber;
            System.out.println("my number is " + myNumber);
        }
        // the parenthesis set-up below is what the linter recommends
        for(int i = 0; i < 10; i++)
            if (i < 4)
                System.out.println(i % 2);
            else if (i < 7)
                System.out.printf("The value of i is: %d%n",
                    i);
            else
            {
                System.out.println("Or is it " + i);
            }
        // Create scanner object
        //Scanner input = new Scanner(System.in);// had to call this new scanner in for my second .nextLine statement?
        // instruct user to enter some text
        System.out.println("Enter some text: ");
        // wait for user input
        String line = stdIn.next();

        System.out.println("You entered " + line);

        int value = 0;
        do{
            System.out.println("nicely done now enter the number 5: ");
            value = stdIn.nextInt();
        }
        while(value != 5);

        System.out.println("Please enter some more text: ");
        String newText;
        newText = stdIn.next();
        System.out.println(newText);
        switch (newText) {
        case "start":
            System.out.println("you want to start");
            break;

        case "stop":
            System.out.println("you want to stop");
            break;

        default:
            System.out.println("who really knows what you want to do");
        }

        int value = 7; // value type

        int[] values; // reference type
 */

        //        int[] values = new int[3]; // provide enough space to hold three integers worth of data. Each int
        //        takes up 32
        //        // bits
        //        System.out.println("preloaded values is " + values[0]);
        //
        //        values[0] = 10;
        //        values[1] = 20;
        //        values[2] = 30;
        //        // values[3] does not exist.
        //
        //        for (int i = 0; i < values.length; i++)
        //        {
        //            System.out.println(values[i]);
        //        }
        //        int total = values[0] + values[2];
        //        System.out.println("total is "+total);
        //
        //        System.out.println(values[0]*5);
        //
        //        int[] numbers = {5, 6, 7};
        //        for (int i = 0; i < numbers.length; i++)
        //        {
        //            System.out.println(numbers[i]);
        //        }
        //
        //        String[] words = new String[3];
        //
        //        words[0] = "Hello";
        //        words[2] = "to";
        //        words[2] = "you";
        //
        //        System.out.println(words[2]);
        //
        //        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        //
        //        for (String fruit : fruits)
        //        {
        //            System.out.println(fruit);
        //        }
        //
        //        String text = null; // String is a reference and not a value type and so it doesn't allocate any
        //        amount of
        //        // memory but instead points to an address and has default value of null.
        //        String[] texts = new String[2];
        //        System.out.println(texts[0]);
        //
        //        int[][] grid = {
        //            {3,5,2343}, // row 0
        //            {2, 4}, // row 1
        //            {1, 2, 3, 4}, // row 2
        //        };
        //
        //        System.out.println("row 1 column 1 is: " + grid[1][1]); // row 1 column 1
        //        System.out.println("row 0 column 2 is: " + grid[0][2]);
        //
        //        String[][] textsArr = new String[2][3];
        //
        //        textsArr[0][1] = "hello there";
        //
        //        System.out.println(textsArr[0][1]);
        //
        //        for(int row = 0; row < grid.length; row++) {
        //            for(int col = 0; col < grid[row].length; col++) {
        //                System.out.print(grid[row][col] + "\t"); // \t adds a tab
        //            }
        //            System.out.println();
        //        }
        //
        //        String[][] wordsArr = new String[2][];
        //
        //        System.out.println (wordsArr[0]);
        //
        //        wordsArr[0] = new String[3];
        //
        //        wordsArr[0][1] = "hi there";
        //
        //        System.out.println(wordsArr[0][1]);


/*
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(!myBoolean);
        System.out.println(myByte);
        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bob");
        System.out.println(text);
        System.out.println("hello world!");
        System.out.println("My integer is: " + myNumber);
        System.out.println(myNumber*2);
*/

    }
}
