package oop.abstractizare.claseAbstracte;

public class Aligator extends Animal {
    @Override
    public void mananca() {
        System.out.println("Aligatorul mananca oameni.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Aligatorul de culoarea " + getCuloare() + " are numele " + getNume() + " si are " + getGreutate() + " kg.");
    }
}
