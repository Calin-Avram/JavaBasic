package objectConstructor;

public class CandidatLaPresedinte {
    public String nume;
    public Integer numarVoturi;

    public CandidatLaPresedinte(String nume, Integer numarVoturi) {
        this.numarVoturi = validareNumarVoturi(numarVoturi);
        this.nume = verificaNume(nume);
    }

    //    o metoda pentru validarea numelui
    public String verificaNume(String nume) {
        if (nume == null || nume.isEmpty()) {
            return "Necunoscut!";
        }
        return nume;
    }

//    facem o metoda pentru validarea numarului de voturi

    public Integer validareNumarVoturi(Integer numarVoturi) {
        if (numarVoturi <= 5000) {
            return 0;
        }
        return numarVoturi;
    }

    public String getNume() {
        return nume;
    }

    public Integer getNumarVoturi() {
        return numarVoturi;
    }
}
