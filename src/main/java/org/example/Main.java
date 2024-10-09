package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        employee employee = new employee(); // 1 задание
        employee.info(); // 1 задание

        // задание 2
        sotrydnik[] persArray = new sotrydnik[5];
        persArray[0] = new sotrydnik("Пушкарёв Никита", "qa", "пажпаж@gf;g;fg", "99548549043", "50000 белли", 24);
        persArray[1] = new sotrydnik("Иванов Никита", "Front", "jgjgjgj@gmail", "995545239043", "7045400 белли", 34);
        persArray[2] = new sotrydnik("Иванов Роман", "юрист", "linkinpark@gmail", "995545239043", "32045400 белли", 34);
        persArray[3] = new sotrydnik("Баранов Петя", "админ", "jjin@gmail", "995545239043", "4345 белли", 31);
        persArray[4] = new sotrydnik("Иванов Никита", "стажер", "j435пкj@gmail", "995545239043", "11231200 белли", 18);
        System.out.println();
        persArray[4].info(); //если нужно вывести информацию о сотруднике
        System.out.println(); // разделение строк
        persArray[4].info(); //если нужно вывести информацию о сотруднике

        // Задание 3 (вывел, чтобы проверить работает или нет)
        Attractionion Attractionion = new Attractionion("Карусель", "11:00 - 22:00", 200);
        Attractionion.info();
    }
}