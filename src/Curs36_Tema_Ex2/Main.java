package Curs36_Tema_Ex2;

public class Main {
    public static void main(String[] args) {
         /*
        1. Creeaza clasa Automobil cu prop. String Model, boolean started si metodele start/stopEngine();
        2. Fiecare metoda va orpi sau porni masina in functie de campul "started"
        3. Creeaza clasa Autobuz care sa mosteneasca clasa Automobil : int maxPassengers , int currentPassanger si
        metoda addPassengers();
        4. Creeaza clasa Tesla care sa mosteneasca clasa Automobil : int batteryPercentag ( care poate varia intre 0-100)
        metodele drive/charge()
        De fiecare data cand este condusa = -10% ;
        De fiecare data cand se incarca = +10%;
         */

        Autobuz autobuz = new Autobuz("Mercedes Bus", 30);
        Tesla tesla = new Tesla("Tesla Model S");

        autobuz.startEngine();
        autobuz.addPassengers(31);

        tesla.startEngine();
        tesla.drive();
        tesla.charge();
        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.charge();
        tesla.drive();
    }
}
