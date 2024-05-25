package Curs36_Ex2;

public class Hero {
    String name;
    String hiddenIdentity;

    public Hero(String name, String hiddenIdentity) {
        this.name = name;
        this.hiddenIdentity = hiddenIdentity;
    }

    public void attack() {
        System.out.println(name + " ataca.");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hiddenIdentity='" + hiddenIdentity + '\'' +
                '}';
    }
}
