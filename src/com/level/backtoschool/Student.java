package com.level.BackToSchool;

import java.util.Scanner;

public class Student extends Person {

    String idNumber;
    double gpa;

    Student(){
        this.name = "Andres Breivik";
        /*this.age = 38; */
        this.gender = "male";
        Scanner read = new Scanner(System.in);
        System.out.println("Enter ID Number for " + this.name + ", student:");
        String scan = read.nextLine();
        this.setIdNumber(scan);
        System.out.println("Enter GPA for this student:");
        scan = read.nextLine();
        this.setGpa(Double.parseDouble(scan));
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", ID number: " + this.idNumber +
               ", GPA:" + this.gpa;
    }
}
