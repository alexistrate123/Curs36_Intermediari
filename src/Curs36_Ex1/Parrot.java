package Curs36_Ex1;

public class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void talk(String whatToSay) {
        System.out.println(whatToSay);
    }
}
