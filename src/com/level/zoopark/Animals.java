package com.level.zoopark;

import java.util.Scanner;

public class Animals {

    String input;
    String[] count;
    String[] animalTypes;
    String[] animalVoices;
    int[] animalAges;

    public Animals(){
        animalTypes = new String [6];
        animalVoices = new String [6];
        animalAges = new int [6];
    }

    void counter() {
        count = new String[6];
        count[0] = "first";
        count[1] = "second";
        count[2] = "third";
        count[3] = "fourth";
        count[4] = "fifth";
        count[5] = "sixth";
    }

    void inputReader() {
        Scanner read = new Scanner(System.in);
        input = read.nextLine();
    }

    void setAnimalTypes(int index){
            System.out.println("Input type of " + count[index] + " animal:");
            inputReader();
            animalTypes[index] = input;
        }

    void setAnimalVoices(int index) {
        System.out.println("Nice, now let's make some noise!");
        System.out.println("This " + animalTypes[index] + " sounds are:");
        inputReader();
        animalVoices[index] = input;
    }

    void setAnimalAges(int index) {
            System.out.println("How old is " + animalTypes[index] + " ?");
            inputReader();
            animalAges[index] = Integer.parseInt(input);
        }

    public  String getAnimalType(int index) {
        return animalTypes[index];
    }

    public  String getAnimalVoice(int index) {
        return animalVoices[index];
    }

    public  int getAnimalAge(int index) {
        return animalAges[index];
    }
}