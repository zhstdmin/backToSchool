package com.level;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stranger, you stand beneath the Cave of Oracul. Enter a number, hit ENTER. Oracul can guess...");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println( a%2 == 0 ? "Oracal found, that your  number iiiis.... EVEN!" : "So hear the answer: as the sky is blue, your input is ODD! (there goes thunderstruck, then blackout)");
    }
}
