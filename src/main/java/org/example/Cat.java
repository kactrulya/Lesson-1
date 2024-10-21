package org.example;

public class Cat extends Animal {
    private boolean isFull;
    public Cat(String name) {
        super(name);
        this.isFull = false;

    }

    public void someinfo() {
        System.out.println("Это " + name);
    }

    @Override
    public  void runinfo(int a) {
        if (a > 200) {
            System.out.println(name + " устал бежать");
        } else if (a < 0) {
            System.out.println(name + " не может столько бежать");

        } else {
            System.out.println(name + " пробежал " + a + " метров");
        }

    }

    @Override
    public void swiminfo(int b) {
            System.out.println(name + " не умеет плавать");
    }

    public void eat(Miska miska, int foodAmount) {
        if (miska.decreaseFood(foodAmount)) {
            this.isFull = true;
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " не смог покушать");
        }
    }

    public boolean isFull() {
        return isFull;
    }

}
