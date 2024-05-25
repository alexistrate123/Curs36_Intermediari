package Curs36_Tema_Ex2;

public class Automobil {
    String model;
    boolean started;

    public Automobil(String model) {
        this.model = model;
        this.started = false;
    }

    // Metoda pentru a porni motorul
    public void startEngine() {
        if (!started) {
            System.out.println(model + " - Motorul a fost pornit.");
            started = true;
        } else {
            System.out.println(model + " - Motorul este deja pornit.");
        }
    }

    // Metoda pentru a opri motorul
    public void stopEngine() {
        if (started) {
            System.out.println(model + " - Motorul a fost oprit.");
            started = false;
        } else {
            System.out.println(model + " - Motorul este deja oprit.");
        }
    }
}
