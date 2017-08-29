package com.level.BackToSchool;

public class CollegeStudent extends Student {

    int year;
    String major;

    CollegeStudent(){
    }

    CollegeStudent(String nam){
        this.name = nam;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return super.toString() +
              ", year: " + this.year +
                ", major: " + this.major;
    }
}
