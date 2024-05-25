package Curs36_Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // [   Mostenire    ]


    // Scrieti clasa Animal cu proprietatile String name, int age si metoda eat();
    // clase copil : Dog cu metoda bark(), cat cu metoda miau(), si clasa parrot cu metoda talk(String whatToSay);
    // Creeaza 3 caini , patru pisici si 5 papagali.




    public static void main(String[] args) {

        Dog caine1 = new Dog("Rex", 6);
        Dog caine2 = new Dog("Max", 4);
        Dog caine3 = new Dog("Plamber", 10);
        ArrayList<Dog> listaCaini = new ArrayList<>();
        listaCaini.add(caine1);
        listaCaini.add(caine2);
        listaCaini.add(caine3);

        for (Dog caine : listaCaini) {
            caine.bark();
            caine.eat();
        }



        System.out.println("__________________________________________________________________________");
        System.out.println();

        ArrayList<Cat> listaPisici = new ArrayList<>(Arrays.asList(
                new Cat("Felix", 3),
                new Cat("Pasma", 6),
                new Cat("Bubuiala", 8)));

        for (Cat pisica : listaPisici) {
            pisica.miau();
            pisica.eat();
        }


        System.out.println("______________________________________________________________________________");
        System.out.println();


        ArrayList<Parrot> listaPapagali = new ArrayList<>(Arrays.asList(
                new Parrot("Bonjorno", 12),
                new Parrot("Rocco", 5),
                new Parrot("Pocoloco", 2)));

        for (Parrot papagal : listaPapagali) {
            papagal.talk("Salut, numele meu este: " + papagal.name + " si am varsta de: " + papagal.age);
            papagal.eat();
        }






    }
}
