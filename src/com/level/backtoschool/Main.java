package com.level.BackToSchool;

import org.omg.CORBA.Object;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] argh) {

        Person [] row = new Person[3];

        CollegeStudent stud1 = new CollegeStudent("Kyle Broflowsky");
        /*stud1.setAge(12);*/
        stud1.setGender("male");
        stud1.setGpa(5.6);
        stud1.setMajor("Math");
        stud1.setYear(2012);
        stud1.setIdNumber("4");

        Student stud2 = new Student();

        Teacher tea = new Teacher("Mr. McKee", "alphamale", 33, 30000, "Psychology");

        row [0] = stud1;
        row [1] = stud2;
        row [2] = tea;

        for( Person i : row) System.out.println(i.toString());

    }
}

