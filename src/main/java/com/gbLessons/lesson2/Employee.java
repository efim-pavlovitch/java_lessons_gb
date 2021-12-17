/* Создайте класс Сотрудник, с полями: имя, email, возраст, должность.
    Сотрудник должен уметь отпечатать в консоль информацию о себе. */

package com.gbLessons.lesson2;

public class Employee {
    private String name;
    private String email;
    private int age;
    private String post;

    public Employee(String name, String email, int age, String post) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.post = post;
    }

    public void printInfo() {
        System.out.println("Сотрудник " + name + ", возраст - " +
                age + ", должность - " + post + ", email - " + email);
    }
}