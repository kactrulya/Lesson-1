package org.example;

public class Employee {
    String fullName;
    String post;
    String mail;
    String phone_number;
    String salary;
    int age;

    public Employee() {
        fullName = "Пушкарёв Никита Олегович";
        post = "QA engineer";
        mail = "qvwin@gmail.com";
        phone_number = "+7(935) 040-40-54";
        salary = "100000 белли";
        age = 25;
    }
    public void info() {
        System.out.println("ФИО " + fullName);
        System.out.println("Должность " + post);
        System.out.println("email " + mail);
        System.out.println("Номер телефона " + phone_number);
        System.out.println("Зарплата " + salary);
        System.out.println("Возраст " + age);
    }
}