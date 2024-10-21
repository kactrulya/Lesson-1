package org.example;

public class Animal {
    String name;
    static int animalCount = 0;
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public  void runinfo(int a){
        System.out.println(name + " пробежал " + a + " метров");
    }

    public void swiminfo(int b) {
        System.out.println(name + " проплыл " + b + " метров");
    }

}
