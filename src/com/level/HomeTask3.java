package com.level;

import java.util.Random;
import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int taskNum;
        do {
            System.out.println("Enter the number of task you want to check (from 1 to 4, zero to quit):");
            taskNum = sc.nextInt();

            switch (taskNum) {
                //                                        TASK 1
                case 1:
                    System.out.println("Task 1. Input any number:");
                    String userInput = sc.nextLine();
                    int i = 0, sum = 0;
                    for (; i != userInput.length(); i++) {
                        String ch = userInput.substring(i, i + 1);
                        int temp = Integer.parseInt(ch);
                        sum += temp;
                    }
                    System.out.println("The sum of all numbers of your input is: " + sum);
                    break;
                //                                     TASK 2
                case 2:
                    System.out.println("Task 2. Fibonacci's row.");
                    int[] fibi = new int[11];
                    int c;
                    for (c = 0; c < 11; c++) {
                        if (c == 0 || c == 1) {
                            System.out.print((fibi[c] = 1) + " ");
                            continue;
                        }
                        System.out.print((fibi[c] = fibi[c - 1] + fibi[c - 2]) + " ");
                    }
                    //                                       TASK 3
                case 3:
                    System.out.println("Task 3. Happy Tickets.");
                     int left = 0, leftSum = 0, right = 0, rightSum = 0, counterT = 0, iter;
                     for(iter = 1; iter < 1000000; iter++ ) {
                         left = (iter / 1000);
                         right = iter % 1000;
                         leftSum = (left/100) + ((left/10)%10) + (left%10);
                         rightSum = (right/100) + ((right/10)%10) + (right%10);
                         if(leftSum == rightSum) counterT++;
                     }
                     System.out.println("Number of matches is: " + counterT);
                    break;
                    //                                        TASK 4
                case 4:
                    System.out.println("Task 4. Clock-wise.");
                    int h, m;
                    int counter = 0;
                    for (h = 0; h < 24; h++) {
                        for (m = 0; m < 60; m++) {
                            if (h == ((m % 10) * 10) + (m / 10)) {
                                counter++;
                            }
                        }
                    }
                    System.out.println("Number of matches is: " + counter);
                    break;
                    //                                          TASK 5
                case 5:
                    int s, r, data;
                    int [][] array = new int[8][5];
                    for(s =0 ; s < 8; s++) {
                        for(r = 0; r < 5; r++){
                            data = num.nextInt();
                            if(data >= 10 && data <= 99) {
                                System.out.println(array[s][r] = data);
                            }
                        }
                    }
                    break;
                    //                                          TASK 6
               /* case 6:
                    int [][] arrayToo = new int [7][4];
                    int str, row, cont;
                    for(str = 0; str < 7; str++){
                        for(row = 0; row < 4; row++ ) {
                            cont = num.nextInt();

                        }
                    }
                    */ 
                case 0:
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
        while (taskNum != 0);
        System.out.println("Datz All, Folks! Bue.");
    }
}


