package com.kandelonius;

import java.util.Scanner;

public class AgePredictor
{
    public AgePredictor(
        Scanner scanner,
        String name,
        int remainder3,
        int remainder5,
        int remainder7,
        int totalAge)
    {
        this.scanner = scanner;
        this.name = name;
        this.remainder3 = remainder3;
        this.remainder5 = remainder5;
        this.remainder7 = remainder7;
        this.totalAge = totalAge;
    }

    Scanner scanner;

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

    String name;// reading a name

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
}
