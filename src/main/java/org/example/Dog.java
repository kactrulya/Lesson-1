package org.example;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void someinfo() {
        System.out.println("Это " + name);
    }
    @Override
    public  void runinfo(int a){
        if (a > 500) {
            System.out.println(name + " устал бежать");
        } else if (a < 0) {
            System.out.println(name + " не может столько бежать");

        } else {
            System.out.println(name + " пробежал " + a + " метров");
        }

    }

    @Override
    public void swiminfo(int b) {
        if (b > 10) {
            System.out.println(name + " уже устал плыть");
        } else if (b < 0) {
            System.out.println(name + " еще не проплыл");
        }
        else {
            System.out.println(name + " проплыл " + b + " метров");
        }
    }

}
