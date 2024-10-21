package org.example;

 class Miska {
    private int food;
    public Miska(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("Добавили " + amount + " еды в миску. Теперь еды: " + food);
    }

    public  void printFood() {
        System.out.println("Осталось еды в миске " + food);
    }
 }


