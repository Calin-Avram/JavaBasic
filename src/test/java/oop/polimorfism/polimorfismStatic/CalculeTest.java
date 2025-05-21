package oop.polimorfism.polimorfismStatic;

import org.testng.annotations.Test;

public class CalculeTest {
    @Test
    public void testAdunare() {

        Calcule adunarePolimorfism = new Calcule();
        System.out.println("Adunarea a doua INT-uri este: " + adunarePolimorfism.adunare(3, 4));
        System.out.println("Adunarea a doua double-uri este: " + adunarePolimorfism.adunare(3.15, 4.20));
       // System.out.println("Adunarea a doua String-uri este: " + adunarePolimorfism.adunare("Buna ", "seara"));
        System.out.println("Adunarea a doua String-uri este: " + adunarePolimorfism.adunare("74", "3"));

    }

}
