package Curs36_Ex2;

public class Flash extends Hero {
    public Flash(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void speedRun() {
        System.out.println(name + " foloseste viteza luminii.");
    }
}
