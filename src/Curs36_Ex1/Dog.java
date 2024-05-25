package Curs36_Ex1;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Cainele " + name + " latra.");
    }
}
