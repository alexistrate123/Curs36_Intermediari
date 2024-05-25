package Curs36_Tema_Ex2;

public class Autobuz extends Automobil {
    public Autobuz(String model) {
        super(model);
    }

    int maxPassengers;
    int currentPassenger;

    public Autobuz(String model, int maxPassengers) {
        super(model);
        this.maxPassengers = maxPassengers;
        this.currentPassenger = 0;
    }

    // Metoda pentru a adăuga pasageri
    public void addPassengers(int passengers) {
        if (started) {
            if (currentPassenger + passengers <= maxPassengers) {
                currentPassenger += passengers;
                System.out.println(model + " - Au fost adăugați " + passengers + " pasageri. Pasageri curenti: " + currentPassenger);
            } else {
                System.out.println(model + " - Nu mai este loc pentru atât de mulți pasageri.");
            }
        } else {
            System.out.println(model + " - Autobuzul nu este pornit. Porniți motorul înainte de a adăuga pasageri.");
        }
    }
}
