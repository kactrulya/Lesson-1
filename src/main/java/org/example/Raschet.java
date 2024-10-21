package org.example;

public interface Raschet {
    double calculateArea();
    default double calculatePerimeter() {
        return 0;
    }

    String getFillColor();
    String getBorderColor();

    default void printinfo() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());

    }
}
