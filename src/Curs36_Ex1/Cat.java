package Curs36_Ex1;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void miau() {
        System.out.println("Pisica " + name + " miauna.");
    }
}
