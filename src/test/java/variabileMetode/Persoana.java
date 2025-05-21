package variabileMetode;

import org.testng.annotations.Test;

public class Persoana {
//    o clasa in java este o structura care defineste atat atributele/variabilele cat si metodele unui obiect.
//    Tipurile de date in java sunt de 2 feluri:
//    1. Tipuri de date PRIMITIVE ---> stocheaza direct valoarea -- sunt 8 tipuri de date:
//     - byte - (8 biti)
//     - short - (16 biti)
//     - int - (32 biti)
//     - long - (64 biti)
//     - double (numere zecimale)
//     - float (numere zecimale dar cu o precizie mai mica)
//     - char (caractere individuale)
//     - boolean (valori logice true/false)
//
//    2. Tipuri de date de REFERINTA sau NE-PRIMITIVE: stocheaza doar referintele(adresa in memorie) catre un obiect:
//     - clase
//     - interfete
//     - arrays
//
//    Tipuri de VARIABILE in java:
//    1. Variabile de instanta (sau variabile globale)
//    2. Variabile locale (variabile din interiorul metodelor)
//
//    O metoda este un bloc de cod care indeplieste o functie specifica (o actiune, un comportament)
//
//    METODE:
//    1. Metode fara return VOID - ruleaza logica din interior si nu returneaza nimic
//    - modificator de acces (public /private /protected void numeleMetodei (cu/fara parametri){
//    Logica /corpul metodei
//    }
//    2. Metode cu RETURN - sa returneze un rezultat
//     - modoficator de acces (public/privat/protected) tipulReturnat (int/string) numeleMetodei (cu/fara parametri{
//     Logica/corpul metodei
//    return valoarea de tipulReturnat
//     }

    //    Declaram variabile de instanta sau globale:
    String numelePersoanei = "Popescu";
    String prenumelePersoanei = "Andrei";
    char sexulPersoanei = 'M';
    int anDeNastere = 2000;

    //Metoda de test:
    @Test//annotare
    public void afisareVariabileGlobaleTest() {
        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Prenumele peersoanei este: " + prenumelePersoanei);
        System.out.println("Persoana este de sex: " + sexulPersoanei);
    }

    @Test
    public void afisareDetaliiPersoana() {
// Declaram niste variabile locale:
        double inaltimeaPersoanei = 1.85;
        int varstaPersoanei = 25;
        String adresaPersoanei = "Bucuresti , Str. Aviatorilor , nr. 3";
        System.out.println("Detaliile persoanei sunt: ");
        System.out.println("- Persoana are numele: " + numelePersoanei);
        System.out.println("- Prenumele peersoanei este: " + prenumelePersoanei);
        System.out.println("- Persoana este de sex: " + sexulPersoanei);
        System.out.println("- Inaltimea persoanei este: " + inaltimeaPersoanei);
        System.out.println("- Varsta persoanei este: " + varstaPersoanei);
        System.out.println("- Adresa persoanei este: " + adresaPersoanei);
    }

    @Test
    public void afisareDetaliiProfesionale() {
        System.out.println("Varsta actuala apersoanei este: " + calculeazaVarsta(2025));
        System.out.println("Persoana este adulta? " + esteAdult(calculeazaVarsta(2025)));
    }

    public int calculeazaVarsta(int anulActual) {
        return anulActual - anDeNastere;
    }

    public boolean esteAdult(int varsta) {
        return varsta > +18;
    }
}
