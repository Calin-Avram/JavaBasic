package structuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    @Test
    public void testMethod() {

        colegiDeCursArray();
        colegiDeCursLista();
        afisareHashMap();
        afisareHashMapv2();
    }

//    in java un array (multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip
//    fie primitive fie obiecte
//    - dimensiunea este fixa, odata ce array este creat dimensiunea nu se poate schimba
//    - elementele trebuie sa fie de acelasi tip
//    - accesul la elemente se face prin indexul acestora

    public void colegiDeCursArray() {
//    creem o multime de string-uri

        String[] colegi = new String[6];
        colegi[0] = "Marius";
        colegi[1] = "Eugen";
        colegi[2] = "Gigi";
        colegi[3] = "Hilda";
        colegi[4] = "Gabi";
        colegi[5] = "Sinziana";
//        colegi[6] = "Razvan";
//        am mai adaugat un coleg de proba si mi-a aruncat eroare

        System.out.println("exemplu multimi: ");

//        "For" este o structura de control utilizata pentru a itera o secventa de instructiuni sau pt a parcurge un anumit interval de valori
//        Structura:
//         for(initializare; o conditie; incrementare/decrementare) {
//         bloc de cod care va fi executat repetat
//        }

        for (int index = 0; index < colegi.length; index++) {

            System.out.println("Numele colegului de la numarul: " + index + " Este: " + colegi[index]);

        }


    }

    public void colegiDeCursLista() {
//        Listele sunt o colectie ordonata de elemente de acelasi tip
//         -elementele sunt stocate in ordinea in care sunt adaugata
//         - accesarea se face tot prin index
//         - elementele unui index pot fi parcurse folosind bucle sau iterator
//         - in liste sunt permise elemente duplicate
//         - in java sunt mai multe clase care implementeaza liste, cele mai comune folosite sunt ArrayList si LinkedList

//        Exemplu lista

        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Maria");
        colegiLista.add("Calin");
        colegiLista.add("Petronela");
        colegiLista.add("Gabriel");
        colegiLista.add("Adrian");
        colegiLista.add("Demetra");

//        "While" este o structura de control utila pt a executa repetat un bloc de cod atata timp cat o anumita conditie este adevarata
//        in timp ce structura "For" este utilizata pt a itera printr-o secventa de instructiuni un numar cunoscut de iteratii
//        structura "While" este folosita atunci cand nr de iteratii nu este cunoscut in avans dar se stie doar conditia

//        Structura/sintaxa
//        initializare index
//        While(conditia){
//
//        bloc de cod (care va fi executat atata timp cat conditia e adevarata)
//
//        incrementare/decrementare
//        }

        System.out.println("Exemplu Liste: ");

        int index = 0;
        while (index < colegiLista.size()) {
            System.out.println("Numele colegului de la numarul: " + index + " este: " + colegiLista.get(index));
            index++;
        }


    }

    public void afisareHashMap() {

//        "HashMap" ofera o implementare a unei colectii de tip pereche (cheie-valoare)
//            - intr-un HashMap cheile sunt unice, nu pot exista duplicate , fiecare cheie poate fi asociata cu cel mult o valoare
        HashMap<String, String> categoriiObiecte = new HashMap<>();

        categoriiObiecte.put("Fructe" , "mar");
        categoriiObiecte.put("Animale" , "catel");
        categoriiObiecte.put("Flori" , "liliac");

        System.out.println("Exemplu HashMap: ");

//        "Foreach" este o structura de control cunoscuta si sub numele de enhancedforloop
//        - se utilizeaza pt a itera o colectie fara sa fie nevoie de un iterator explicit sau sa se lucreze cu indici
//        Sintaxa:
//        For-Foreach(tip element , numeElement : colectia){
//        bloc de cod (care va fi executat pt fiecare element din colectie)
//        }

        for(String key: categoriiObiecte.keySet()){
            System.out.println("Categoria este: " + key + " valoarea este: " + categoriiObiecte.get(key));
        }

    }

    public void afisareHashMapv2(){

        System.out.println("Exemplu HashMapv2: ");
        HashMap<String , List<String>> tariOrase = new HashMap<>();
//        adaugam 3 seturi de liste pe care le vom folosi in  HashMap

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Targu Mures");
        oraseRomania.add("Cluj Napoca");
        oraseRomania.add("Ploiesti");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Valencia");
        oraseSpania.add("MADRID");
        oraseSpania.add("Barcelona");

        List<String> oraseUSA = new ArrayList<>();
        oraseUSA.add("New York");
        oraseUSA.add("Chicago");
        oraseUSA.add("Las Vegas");

//        adaugam valorile in HashMap
        tariOrase.put("Romania" , oraseRomania);
        tariOrase.put("Spania" , oraseSpania );
        tariOrase.put("USA" , oraseUSA);

        for (String key: tariOrase.keySet()) {


            System.out.println(" Tara este: " + key + " orasele sunt: " + tariOrase.get(key));
        }
    }

}
