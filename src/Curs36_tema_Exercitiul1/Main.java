package Curs36_tema_Exercitiul1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    /*
    1. Scrie clasa Student cu prorietatile String name si int grade (ce nota obtine),
    2. Creeaza clasele Premiant , StudentMediu si Corigent ( mostenesc clasa parinte Student )
    3. Premiant cu metoda multumeste(), StudentMediu cu metoda citeste() si Corigent cu metoda invata();
    4. Creeaza 3 studenti de fiecare tip si introdui in listele lor specifice , fa toti sa apeleze metodele lor particulare.
   */

    public static void main(String[] args) {

      ArrayList<Premiant> premianti =new ArrayList<>();
      ArrayList<StudentMediu> studentiMedii =new ArrayList<>();
      ArrayList<Corigent> corigenti =new ArrayList<>();

      premianti.add(new Premiant("John",10));
      premianti.add(new Premiant("Jessica", 10));
      premianti.add(new Premiant("Marcus", 10));

      studentiMedii.add(new StudentMediu("Mirela", 7));
      studentiMedii.add(new StudentMediu("Adelin", 6));
      studentiMedii.add(new StudentMediu("Paulina", 8));

      corigenti.add(new Corigent("Hector", 4));
      corigenti.add(new Corigent("Felix", 2));
      corigenti.add(new Corigent("Andreas", 3));

        for (Premiant premiant : premianti) {
            premiant.multumeste();
        }

        for (StudentMediu studentMediu : studentiMedii) {
            studentMediu.citeste();
        }

        for (Corigent corigent : corigenti) {
            corigent.invata();
        }



    }
}
