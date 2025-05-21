package oop.oopExample;

public class Student extends Persoana implements StudentInterface {

    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public Student(String nume, String prenume, String varsta, String facultate, String cursuri, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }

    public void infoStudent() {
        System.out.println("Studentul " + getNume() + " studiaza la facultatea: " + facultate);
        System.out.println("Studentul " + getPrenume() + " are cursuri de: " + cursuri);
        System.out.println("Varsta studentului " + getNume() + " " + getPrenume() + " este " + getVarsta() + " ani"
                + " si are/nu are bursa: " + bursa);
    }

    @Override
    public void doarme() {
        System.out.println("Studentul doarme cand nu invata pentru examen sau nu merge in club.");
    }

    //    Polimorfism dinamic -> a doua implementare a metodei
    public void mananca (){
        System.out.println("Studentul mananca cand are bani");
    }

//    Polimorfism static
    public void invata(){
        System.out.println("Studentul invata doar in sesiuni.");
    }

    @Override
    public void sustineExamene() {
        System.out.println("");
    }

    @Override
    public void mergeLaPetreceri() {

    }

    @Override
    public void mergeLaSeminar() {

    }

    public void invata(String curs){
        System.out.println("Studentul invata pentru cursul." + curs);
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

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }


    @Override
    public void primesteSalar() {

    }

    @Override
    public void mergeLaMunca() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void isiIaConcediu() {

    }
}
