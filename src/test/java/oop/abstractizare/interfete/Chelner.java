package oop.abstractizare.interfete;

public class Chelner implements ServesteInterface, CurataInterface{
    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Chelnerul curata masa cu numarul " + numarMasa + ".");
    }

    @Override
    public void spalaVase() {
        System.out.println("Chelnerul spala vasele dupa inchiderea restaurantului.");
    }

    @Override
    public void primesteComanda(int numarComanda) {
        System.out.println("Chelnerul primeste comanta cu numarul " + numarComanda + ".");
    }

    @Override
    public void servesteMancarea(String tipulMancarii, String numeleClientului) {
        System.out.println("Chelnerul duce mancarea " + tipulMancarii + " la clientul " + numeleClientului + ".");
    }
}
