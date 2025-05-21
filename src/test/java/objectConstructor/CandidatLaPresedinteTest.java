package objectConstructor;

import org.testng.annotations.Test;

public class CandidatLaPresedinteTest {

    @Test
    public void verificatPresedinteTest() {
        System.out.println("==== Exemplul 1 ====");
        CandidatLaPresedinte candidatPromitator = new CandidatLaPresedinte("Ionescu", 10000);
        System.out.println("Numele candidatului promitator este: " + candidatPromitator.getNume() + " si are: " + candidatPromitator.getNumarVoturi() + " de voturi.");
        System.out.println("==== Exemplul 2 ====");
        CandidatLaPresedinte candidatSlab = new CandidatLaPresedinte("Popescu", 2000);
        System.out.println("Numele candidatului promitator este: " + candidatSlab.getNume() + " si are: " + candidatSlab.getNumarVoturi() + " de voturi.");
        System.out.println("==== Exemplul 3 ====");
        CandidatLaPresedinte candidatNecunoscut = new CandidatLaPresedinte("", 300);
        System.out.println("Numele candidatului promitator este: " + candidatNecunoscut.getNume() + " si are: " + candidatNecunoscut.getNumarVoturi() + " de voturi.");
    }
}
