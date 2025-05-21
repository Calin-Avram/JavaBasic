package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class AnimalTest {
    @Test
    public void testMethod(){
        System.out.println("=== ELEFANT ===");
        Elefant Cici = new Elefant();
        Cici.mananca();
        Cici.infoAnimal();
        Cici.doarme();
        System.out.println("=== ALIGATOR ===");

        Aligator Mimi = new Aligator();
        Mimi.mananca();
        Mimi.setNume("Mimi");
        Mimi.setCuloare("verde");
        Mimi.setGreutate(980);
        Mimi.infoAnimal();
        Mimi.doarme();

        System.out.println("=== DINOZAUR ===");

        Dinozaur Gigi = new Dinozaur();
        Gigi.setNume("Gigi");
        Gigi.setCuloare("Roz");
        Gigi.setGreutate(6875);
        Gigi.mananca();
        Gigi.infoAnimal();
        Gigi.doarme();

//      Clasa abstracta nu se poate instantia ( sa faci un obiect)
//        Animal Animal = new Animal();

    }
}
