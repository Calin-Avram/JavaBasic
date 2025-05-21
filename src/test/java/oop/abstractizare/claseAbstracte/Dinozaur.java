package oop.abstractizare.claseAbstracte;

public class Dinozaur extends Animal {
    @Override
    public void mananca() {
        System.out.println("Dinozaurul "+ getNume() + " mananca carne.");
    }

    @Override
    public void infoAnimal() {
        System.out.println("Dinozaurul " + getNume() + " de culoarea " + getCuloare() + " are " + getGreutate() + " kg.");
    }
}
