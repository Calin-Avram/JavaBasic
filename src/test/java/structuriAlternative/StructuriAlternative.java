package structuriAlternative;

import org.testng.annotations.Test;
// TEMA TRANSFORMATI METODA CU RETURN CARE LIPSESTE IN "evaluareNota"  !!!
public class StructuriAlternative {

    @Test
    public void testMethod() {
//        verificareNumar(-1);
//        verificareNumar(8);
//        verificareNumarParImparPozitivNegativ(-5);
//        verificareNumarParImparPozitivNegativ(-2);
//        verificareNumarParImparPozitivNegativ(0);
          System.out.println( "Evaluarea elevului este: " +evaluareNota('A'));
        System.out.println( "Evaluarea elevului este: " +evaluareNota('B'));
        System.out.println( "Evaluarea elevului este: " +evaluareNota('C'));
        System.out.println( "Evaluarea elevului este: " +evaluareNota('D'));
        System.out.println( "Evaluarea elevului este: " +evaluareNota('E'));
        System.out.println( "Evaluarea elevului este: " +evaluareNota('F'));
        System.out.println( "Evaluarea elevului este: " +evaluareNota('X'));
//          evaluareNota('A');
//          evaluareNota('B');
//          evaluareNota('C');
//          evaluareNota('D');
//          evaluareNota('F');
    }

//    Structura de control "if" este folosita pentru a evalua o conditie booleana si pt a executa un bloc de cod daca
//    aceasta conditie este adevarata.
//    if(conditie){
//    bloc de cod care va fi executat daca conditia este adevarata
//    } else {
//    bloc de cod care va fi executat daca conditia e falsa
//    }

    public void verificareNumar(int numar) {

        if (numar > 3) {
            System.out.println("Numarul: " + numar + " este mai mare decat 3 .");
        } else {
            System.out.println("Numarul: " + numar + " este mai mic decat 3 .");
        }
    }

//    diferenta intre "if" si "else if"
//    - daca "if e folosit pt prima conditie pe care vrem s-o evaluam
//    - ""else if" este folosit pt conditii suplimentare daca if este fals
//    - "else" se foloseste pt a executa un bloc de cod cand toate conditiile sunt false
//    Este indicat sa folosesti "if" si "else if" impreuna atunci cand ai mai multe conditii de evaluat

    public void verificareNumarParImparPozitivNegativ(int valoare) {

        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul: " + valoare + " este par si pozitiv.");
            } else {
                System.out.println("Numarul: " + valoare + " este impar si pozitiv.");
            }
        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul: " + valoare + " este par si negativ.");
            } else {
                System.out.println("Numarul: " + valoare + " este impar si negativ.");
            }
        } else {
            System.out.println("Numarul: " + valoare + " este egal cu 0 .");
        }
    }

//    "switch" este o structura de control care permite evaluarea unei expresii si executarea unuia din mai multe blocuri de cod
// este de obicei folosit cand sunt mai multe cazuri posibile si fiecare caz este asociat unui bloc dde cod specific
//    switch (expresia) {
//      case valoareaUnu :
//      bloc de cod pt cazul in care expresia are valoarea -> valoareaUnu
//      break;
//    case valoareaDoi:
//    bloc de cod pt cazul in care expresia are valoarea -> valoareaDoi
//    break;
//    alte case-uri posibile:
//    default:
//    bloc de cod care se executa daca nici unul dintre cazuri nu se potriveste
//    }

    public String evaluareNota (char nota){
         String rezultat;
         switch (nota){
            case 'A':
                rezultat = "Excelent!";
                break;
            //    return "Excelent!";
            case 'B':
                rezultat = "Foarte Bine!";
                break;
               // return "Foarte Bine!";
            case 'C':
                rezultat = "Bine!";
                break;
              //  return "Bine!";
            case 'D':
                rezultat = "Satisfacator";
                break;
               // return "Satisfacator!";
            case 'F':
                rezultat = "Repetent!";
                break;
              //  return "Repetent!";
            default:
                rezultat = nota + " Nu este un calificativ acceptat!";
                break;
               // return nota + "Nu este un calificativ acceptat";
        }
        return rezultat;
    }

}

