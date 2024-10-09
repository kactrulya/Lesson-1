package org.example;

public class Park {
    String city;
    String adress;

    public static class Attractionion {
        String name;
        String time_job;
        int price;

        public  Attractionion (String _name, String _time_job, int _price) {
            name = _name;
            time_job = _time_job;
            price = _price;
        }
    }
}