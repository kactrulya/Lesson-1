package org.example;

public class Attractionion {
    String name;
    String time_job;
    int price;

    public Attractionion (String _name, String _time_job, int _price) {
        name = _name;
        time_job = _time_job;
        price = _price;
    }

    public void info() {
        System.out.println("Название аттракциона: " + name);
        System.out.println("Время работы аттракциона: " + time_job);
        System.out.println("Цена аттракциона: " + price);
    }
}