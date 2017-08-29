package com.level.zoopark;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] arr) {

        Animals animalsSet = new Animals();

        animalsSet.counter();
        System.out.println("Setting 6 animals");
        for (int i = 0; i < 6; i++) {
            animalsSet.setAnimalTypes(i);
            animalsSet.setAnimalVoices(i);
            animalsSet.setAnimalAges(i);
        }

        Zoo nextZoo1 = new Zoo();
        System.out.println("In Zoo 1 we have:");
        for (int i = 0; i < 6; i++) {
            Random dice = new Random();
            int fate = dice.nextInt(5);
            System.out.println(nextZoo1.zooAnimalList[i][i][i] = animalsSet.animalTypes[fate]);
            System.out.println(nextZoo1.zooAnimalList[1][i][i] = animalsSet.animalVoices[fate]);
            System.out.println(nextZoo1.zooAnimalList[2][i][i] = Integer.toString(animalsSet.animalAges[fate]));
        }

        Zoo nextZoo2 = new Zoo();
        System.out.println("In Zoo 2 we have:");
        for (int i = 0; i < 6; i++) {
            Random dice = new Random();
            int fate = dice.nextInt(5);
            System.out.println(nextZoo2.zooAnimalList[i][i][i] = animalsSet.animalTypes[fate]);
            System.out.println(nextZoo2.zooAnimalList[1][i][i] = animalsSet.animalVoices[fate]);
            System.out.println(nextZoo2.zooAnimalList[2][i][i] = Integer.toString(animalsSet.animalAges[fate]));
        }

        Zoo nextZoo3 = new Zoo();
        System.out.println("In Zoo 3 we have:");
        for (int i = 0; i < 6; i++) {
            Random dice = new Random();
            int fate = dice.nextInt(5);
            System.out.println(nextZoo3.zooAnimalList[i][i][i] = animalsSet.animalTypes[fate]);
            System.out.println(nextZoo3.zooAnimalList[1][i][i] = animalsSet.animalVoices[fate]);
            System.out.println(nextZoo3.zooAnimalList[2][i][i] = Integer.toString(animalsSet.animalAges[fate]));
        }



    }

}
