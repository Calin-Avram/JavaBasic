package oop.oopExample;

public class StudentAngajat extends Persoana implements StudentInterface, AngajatInterface {
    public String companie;
    public Double salariu;
    public Integer experienta;

    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public StudentAngajat(String nume, String prenume, String varsta, String companie, Double salariu,
                          Integer experienta, String facultate, String cursuri, Boolean bursa) {
        super(nume, prenume, varsta);
        this.companie = companie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }

    public StudentAngajat(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void doarme() {
        System.out.println("Studentul angajat doarme cand poate.");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Studentul angajat primeste salariul d e2 ori pe luna.");
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Studentul angajat merge la munca dupa ce invata.");
    }

    @Override
    public void munceste() {
        System.out.println("Studentul angajat munceste part-time.");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Studentul angajat munceste part-time.");
    }

    @Override
    public void invata() {
        System.out.println("Studentul angajat munceste part-time.");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul angajat munceste part-time.");
    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Studentul angajat munceste part-time.");
    }

    @Override
    public void mergeLaSeminar() {
        System.out.println("Studentul angajat munceste part-time.");
    }

    public String getFacultate() {
        return facultate;
    }

    public String getCursuri() {
        return cursuri;
    }

    public Boolean getBursa() {
        return bursa;
    }
}
