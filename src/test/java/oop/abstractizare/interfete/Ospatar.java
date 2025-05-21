package oop.abstractizare.interfete;

public class Ospatar implements ServesteInterface{
    @Override
    public void primesteComanda(int numarComanda) {
        System.out.println("Ospatarul preia comanda cu numarul " + numarComanda + ".");
    }

    @Override
    public void servesteMancarea(String tipulMancarii, String numeleClientului) {
        System.out.println("Ospatarul duce mancarea " + tipulMancarii + " la clientul " + numeleClientului + ".");
    }
}
