package objectConstructor;

public class ContBancar {
    public String numeTitular;
    public Double soldTitular;

    //    facem un constructor parametrizat care verifica soldul initial
    public ContBancar(String numeTitular, double soldInitial) {
        this.numeTitular = numeTitular;
//        verificam soldul initial
        if (soldInitial >= 100) {
            this.soldTitular = soldInitial;
        } else {
            System.out.println("Soldul initial trebuie sa fie minim 100 Ron. Resetam la 0 .");
            this.soldTitular = 0.0;
        }
    }

    public void infoCont() {
        System.out.println("Titularul " + numeTitular + " are soldul: " + soldTitular);
    }
}
