package oop.oopExample;

import org.testng.annotations.Test;

public class OOPTest {
    @Test

    public void oopExampleTest(){
        System.out.println("==== Exemplu student ===");
        Student Ionel = new Student("Popescu", "Ionel", "20", "Facultatea de constructii",
                "Rezistenta materialelor", true);
//        Ionel.infoStudent();
//        Ionel.setNume("Porumbescu");
//        System.out.println("=== Info Persoana ===");
        Ionel.mananca();
        Ionel.infoPersoana();
        Ionel.infoStudent();
        Ionel.doarme();
        System.out.println("=== Exemplu angajat ===");
        Angajat Teodor = new Angajat("Ionescu", "Teodor", "30", "Oracle",
                7500.0, 4);
//        Teodor.infoAngajat();
//        Teodor.setSalariu(3500.0);
        Teodor.mananca();
        Teodor.doarme();

        Teodor.marire("Senior");
        Teodor.marire(10.5);
        Teodor.marire("de vechime", 3000);

//        System.out.println("=== Info Persoana ===");
//        Teodor.infoPersoana();
//        Teodor.infoAngajat();

        System.out.println("=== Exemplu Student Angajat ===");
        StudentAngajat Elena = new StudentAngajat("Ionescu", "Elena", "27");
        Elena.mergeLaPetreceri();
        Elena.mergeLaMunca();
        Elena.isiIaConcediu();
        Elena.primesteSalar();
        Elena.mergeLaSeminar();
        Elena.infoPersoana();
   }

}
