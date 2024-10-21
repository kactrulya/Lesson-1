package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Бобик");
        Dog dog2 = new Dog("Дарлинг");
        Dog dog3 = new Dog("Альфа");
        Dog dog4 = new Dog("Дейзи");
        cat.someinfo();
        cat.runinfo(201);
        dog.runinfo(500);
        cat.someinfo();
        dog.someinfo();
        dog.swiminfo(10);
        cat.swiminfo(11);
        System.out.println("Всего создано животных: " + Animal.animalCount);

        // 2 часть 1 задачи
        Miska miska = new Miska(20);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Персей");
        cats[1] = new Cat("Мурзик");
        cats[2] = new Cat("Цезарь");
        cats[3] = new Cat("Пушок");
        cats[4] = new Cat("Рыжик");

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(miska, 10);
        }

        for (int i = 0; i < cats.length; i++) {
            String isFullText = cats[i].isFull() ? "сыт" : "голоден";
            System.out.println(cats[i].name + " " + isFullText);
        }

        miska.printFood();

        // задание 2
        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 7, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Brown");

        System.out.println("Информация о круге:");
        circle.printinfo();

        System.out.println("Информация о прямоугольнике:");
        rectangle.printinfo();

        System.out.println("Информация о треугольнике:");
        triangle.printinfo();
    }
}