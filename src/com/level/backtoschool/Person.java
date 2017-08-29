package com.level.BackToSchool;

public class Person {
    String name, gender;
    int age;

    Person(){
        this.name = "";
        this.gender = "";
        this.age = 22;
    }

    void setName(String nam){
        this.name = nam;
    }

    String getName(){
        return this.name;
    }

    void setGender(String gend){
        this.gender = gend;
    }

    String getGender(){
        return this.gender;
    }

    void setAge(int ag){
        this.age = ag;
    }

    int getAge(){
        return this.age;
    }

    public String toString(){
        return  this.getName()
                + ", gender: "
                + this.getGender() + ", age: "
                + this.getAge();
    }
}
