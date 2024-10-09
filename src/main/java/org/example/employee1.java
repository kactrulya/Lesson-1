package org.example;

public class employee1 {
    String fullName = "Пушкарёв Никита Олегович";
    String post = "QA engineer";
    String mail = "qvwin@gmail.com";
    String phone_number = "+7(935) 040-40-54";
    String salary = "100000 белли";
    int age = 25;
    public void info() {
        System.out.println("ФИО " + fullName);
        System.out.println("Должность " + post);
        System.out.println("email " + mail);
        System.out.println("Номер телефона " + phone_number);
        System.out.println("Зарплата " + salary);
        System.out.println("Возраст " + age);
    }
}