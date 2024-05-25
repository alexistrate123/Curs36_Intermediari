package Curs36_Tema_Ex2;

public class Tesla extends Autobuz {
    int batteryPercentage;

    public Tesla(String model) {
        super(model);
        this.batteryPercentage = 100; // Tesla pornește cu bateria la 100%
    }




    // Metoda pentru a conduce
    public void drive() {
        if (started) {
            System.out.println(model + " - Conducere în curs...");
            batteryPercentage -= 10; // Consum de 10% la fiecare conducere
            System.out.println(model + " - Nivelul bateriei: " + batteryPercentage + "%");
        } else {
            System.out.println(model + " - Tesla nu este pornită. Porniți motorul înainte de a conduce.");
        }
    }

    // Metoda pentru a încărca bateria
    public void charge() {
       /* if (batteryPercentage < 100) {
            System.out.println(model + " - Încărcare în curs...");
            batteryPercentage += 10; // Încărcare de 10%
            System.out.println(model + " - Nivelul bateriei: " + batteryPercentage + "%");
        } else {
            System.out.println(model + " - Bateria este deja la capacitate maximă.");
        }

        */
        batteryPercentage = 100;
    }
}
