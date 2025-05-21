package objectConstructor;

public class Avion {
//    constructorul are rolul sa initializeze variabile unei clase
//    recunoastem un constructor dupa numele clasei
//    pentru o clasa putem avea n constructori ,care se diferenteaza dupa nr. sau tipul de parametrii
//    intr-o clasa exista tot timpul un constructor default (fara parametrii)
//    constructorul trebuie sa fie intotdeauna public
//    obiect = instanta unei clase
//    dintr-o clasa putem sa facem mai multe obiecte
//    ca sa initializezi un obiect ne folosim de cuvantul cheie "new"
//    cand se initializeaza un obiect se apeleaza constructorul clasei

    public String marca;
    public String model;
    public String tip;
    public String taraOrigine;
    public Integer capacitatePasageri;
    public Integer numarBagaje;
    public Integer echipajAvion;

    public Avion(String marca, String model, String tip, String taraOrigine, Integer capacitatePasageri, Integer numarBagaje, Integer echipajAvion) {
        this.marca = marca;
        this.model = model;
        this.tip = tip;
        this.taraOrigine = taraOrigine;
        this.capacitatePasageri = capacitatePasageri;
        this.numarBagaje = numarBagaje;
        this.echipajAvion = echipajAvion;
    }


    public Avion(String marca, String model, String tip, String taraOrigine, Integer capacitatePasageri, Integer echipajAvion) {
        this.marca = marca;
        this.model = model;
        this.tip = tip;
        this.taraOrigine = taraOrigine;
        this.capacitatePasageri = capacitatePasageri;
        this.echipajAvion = echipajAvion;
    }

    public void infoAvion() {
        System.out.println(" Marca avionului este: " + marca);
        System.out.println(" Modelul avionului este: " + model);
        System.out.println(" Tipul avionului este: " + tip);
        System.out.println(" Tara de origine a avionului este: " + taraOrigine);
        System.out.println(" Capacitatea de pasageri a avionului este: " + capacitatePasageri);
        System.out.println(" Echipajul avionului este de: " + echipajAvion + " persoane.");
        if (numarBagaje != null) {
            System.out.println("Numarul de bagaje suportat de avion este : " + numarBagaje);
        } else {
            System.out.println("Avionul nu are bagaje.");
        }
    }

}

