package com.gbLessons.lesson2;

public class SuperEmployee extends Employee{
    private String superData;

    public SuperEmployee(String name, String email, int age, String post, String data)  {
        super(name, email, age, post);
        this.superData = data;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Топ должность - " + this.superData);
    }

}
