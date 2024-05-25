package Curs36_Ex2;

public class Main {

    // Creeaza clasa Hero , cu proprietatile String name, String hiddenIdentity, metoda attack(),
    // creeaza clasele copii : Superman cu metoda fly(), Batman cu metoda useGadgets(), Flash cu metoda speedRun();
    // Clasa Flash va avea 3 clase copii: Speedster, KidFlash si TornadoTwins;
    // Speedster cu metoda timeTravel(), KidFlash cu metoda savePerson(), si TornadoTwins cu metoda doubleRun();

    public static void main(String[] args) {
        Superman superman = new Superman("Superman", "Chriss Evan");
        Batman batman = new Batman("Batman", "Bruce Wayne");
        Flash flash = new Flash("Flash", "Berry Alan");
        Speedster speedster = new Speedster("Speedster", "Berry Jr.");
        KidFlash kidFlash = new KidFlash("KidFlash", "Evan Hawk");
        TornadoTwins tornadoTwins = new TornadoTwins("TornadoTwins", "Vctor&Ethan");

        System.out.println(superman);
        superman.fly();
        superman.attack();

        System.out.println(batman);
        batman.useGadgets();
        batman.attack();

        System.out.println(flash);
        flash.speedRun();
        flash.attack();

        System.out.println(speedster);
        speedster.timeTravel();
        speedster.attack();

        System.out.println(kidFlash);
        kidFlash.savePerson();
        kidFlash.attack();

        System.out.println(tornadoTwins);
        tornadoTwins.doubleRun();
        tornadoTwins.attack();






    }
}
