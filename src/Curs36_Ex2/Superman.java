package Curs36_Ex2;

public class Superman extends Hero {
    public Superman(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void fly() {
        System.out.println(name + " zboara.");
    }
}
