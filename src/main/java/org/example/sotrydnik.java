package org.example;

public class sotrydnik {
    String name;
    String post;
    String mail;
    String phone;
    String salary;
    int age;
    public sotrydnik(String _fullName, String _post, String _mail, String _phone_number, String _salary, int _age ) {
        name = _fullName;
        post = _post;
        mail = _mail;
        phone = _phone_number;
        salary = _salary;
        age = _age;
    }
    public void info() {
        System.out.println("ФИО " + name);
        System.out.println("Должность " + post);
        System.out.println("email " + mail);
        System.out.println("Номер телефона " + phone);
        System.out.println("Зарплата " + salary);
        System.out.println("Возраст " + age);
    }
}