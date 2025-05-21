package oop.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaurantTest {
    @Test
    public void activitateRestaurant(){
        System.out.println("=== BUCATAR ===");
        Bucatar Ion = new Bucatar();
        Ion.pregatesteMancarea("Mititei");
        System.out.println("=== CHELNER ===");
        Chelner Petre = new Chelner();
        Petre.primesteComanda(3);
        Petre.servesteMancarea("Mititei", "Ileana");
        Petre.curataMasa(14);
        Petre.spalaVase();

        System.out.println("=== OSPATAR ===");
        Ospatar Vasile = new Ospatar();
        Vasile.primesteComanda(5);
        Vasile.servesteMancarea("Mamaliga" , "Anuta");

        System.out.println("=== ASISTENT BUCATAR ===");
        AsistentBucatar Maria = new AsistentBucatar();
        Maria.curataMasa(6);
        Maria.spalaVase();
    }
}
