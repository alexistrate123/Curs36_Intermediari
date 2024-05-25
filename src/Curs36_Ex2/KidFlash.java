package Curs36_Ex2;

public class KidFlash extends Flash {
    public KidFlash(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void savePerson() {
        System.out.println(name + " are abilitatea de a salva oameni. ");
    }
}
