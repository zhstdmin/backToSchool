package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Once upon a time there lived tree funny pigs... But our story is not about them. Just type any two-digit number, call the spell and slightly press ENTER. The Magic is all around!");
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = a/10;
        System.out.println("The Magic.spell returns " + "'" + (a%10 + b) + "' !");
        System.out.println("Holy Moly! It looks like sum of two numbers, you've just entered! God save da pigs!");
    }
}
