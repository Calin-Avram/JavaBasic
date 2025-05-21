package structuriRepetitive;
//WORK IN PROGRESS
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeworkStructuriRepetitive {

//  Faceti o metoda care  sa gaseasca un cuvant dintr-o lista si cand il gaseste sa il printeze in consola
//	Lista de fructe, masini, etc
//  Faceti o metoda care  sa gaseasca un cuvant dintr-un hash map si cand il gaseste sa il printeze in consola
//  Hash map de obiecte, animale, etc
@Test
    public void testMethod(){
    masiniNoiEpocaAnCurentList();

}

    public void masiniNoiEpocaAnCurentList(){

        String[] masini = new String[5];
          masini[0] = "Bmw Seria 5 E39";
          masini[1] = "Peugeot 406";
          masini[2] = "Audi A4 B5";
          masini[3] = "Mercedes Benz E-Class W210";
          masini[4] = "Honda Civic 6th Gen.";

        System.out.println("Exemplu din lista de masini de epoca ale anului 2025: " +masini[0]);


    }



}
