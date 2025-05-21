package variabileMetode;
//    Tema:
//1. O clasa Casa
//	- Min 3 variabile globale
//	- Min 3 variabile locale in oricare metoda
//	- 2 metode void - 1 cu parametrii una fara
//	- 2 metode cu return - 1 cu parametrii una fara
//1 metoda de test - afisare in consola toate variabilele si metodele facute

import org.testng.annotations.Test;

//O clasa numita Casa
public class Casa {

// Minim 3 variabile globale
    int anulConstructiei = 1995;
    String intrebuintareaCasei = "casa de locuit";
    String adresaCasei = "Strada Plopilor, nr.1 , Comuna Raciu, Jud. Mures, Romania. ";
    int numarIncaperi = 7;

@Test
//    Minim 3 variabile locale
    public void afisareVariabileGlobale (){
        System.out.println("Casa este in folosinta drept: " +intrebuintareaCasei);
        System.out.println("Casa are " +numarIncaperi + " incaperi.");
        System.out.println("Casa este construita in anul " + anulConstructiei + " .");
        System.out.println("Adresa casei este: " +adresaCasei);
    System.out.println(calculeazaVarstaCasei(1995));
    }
@Test
    public void suprafataUtila (){

        double incapereaUnu = 3.2;
        double incapereaDoi = 2.5;
        double incapereaTei = 24.3;
        double incapereaPatru = 8.7;
        double incapereaCinci = 6.8;
        double incapereaSase = 12.6;
        double incapereaSapte = 13.8;

        double suprafataTotalaIncaperi = incapereaUnu + incapereaDoi + incapereaTei + incapereaPatru + incapereaCinci + incapereaSase + incapereaSapte;

        System.out.println("Suprafata totala a incaperilor este: " + suprafataTotalaIncaperi + " mp");

    }

    public String calculeazaVarstaCasei (int anulConstructiei){
        int anulCurent = 2025;
        int varstaCasei = anulCurent - anulConstructiei;
        return ("Varsta casei este: " + varstaCasei);
    }


}