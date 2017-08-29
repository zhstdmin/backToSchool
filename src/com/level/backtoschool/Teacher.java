package com.level.BackToSchool;

public class Teacher extends Person {

    double salary;
    String subject;

    Teacher(String nam, String gend, int ag, double salar, String subjec){
        super.setName(nam);
        super.setGender(gend);
        super.setAge(ag);
        this.setSalary(salar);
        this.setSubject(subjec);
    }

    public void setSalary(double salar) {
        this.salary = salar;
    }

    public void setSubject(String subjec) {
        this.subject = subjec;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
              ", subject: " +  this.subject +
               ", salary: " + this.salary;
    }
}


