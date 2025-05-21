package oop.oopExample;

public abstract class Persoana implements AngajatInterface {
//    oop= programare orientata pe obiect (object oriented programming).
//    patru principii importante: mostenire, incapsulare, polimorfism si abstractizare.

//    Mostenirea in Java este conceptul prin care o clasa(clasa copil) mosteneste o alta clasa(clasa parinte).
//    In momentul in care o clasa mosteneste o alta clasa, clasa copil are vizibilitate asupra variabilelor/metodelor
//    din clasa parinte.
//    In java se poate mosteni o singura clasa cu ajutorul cuvantului cheie "extends".
//    In momentul in care o clasa mosteneste o alta clasa, clasa copil apeleraza constructorul din parinte
//    si constructorul din clasa parinte spre copil se apeleaza cu cuvantul cheie "super".

//    Incapsularea = procesul prin care tinem private anumite informatii in asa fel incat acestea sa nu poata fi modificate.
//    Ca sa putem face informatiile private vom face variabilele/metodelem din "public" in "private".
//    Modificatori DE ACCES:
//    public = codul se poate accesa de oriunde si din orice clasa.
//    private = codul se poate accesa doar din clasa unde s-a scris codul.
//    protected = codul se poate accesa doar din pachetul din care s-a scris codul, dar si de catre sub-clase (oop de mostenire).
//    default = codul se poate accesa doar din pachetul din care s-a scris codul.
//
//    Ca sa extragem(modificam) o valoare a unie valori variabile private ne folosim de metode de get/set(getter si setter)


//    Polimorfism= conceptul prin care definim mai multe implementari pentru o metoda
//    Esste de 2 tipuri: static(overloading), dinamic(overreading).

//    Polimorfismul dinamic intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite.
//    Polimorfism static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau
//    numarului de parametrii


//    ABSTRACTIZARE
//    Abstractizarea este procesul de reducere a complexitatii prin ascunderea detaliilor de implementare si
//    expunerea doar a functionalitatii
//    - Se realizeaza prin clase abstracte si/sau interfete
//    Clasele abstracte se declara folosind cuvantul cheie abstract
//    - pot contine atat metode abstracte( fara corp sau implementare) cat si metode concrete( metode obisnuite, cu implementare)
//      -clasele abstracte nu pot fi instantiate( nu poti sa faci un obiect din clasa abstracta)
//    - ea poate fi utilizata numai ca superclasa pt alte clase care extind clasa abstracta
//    - poate avea variabile si atribute ca si o clasa normala

//    INTERFETE
//    Interfata e un protocol pe care clasele trebuie sa-l implementeze (ofera raspuns la lipsa mostenirii multiple)
//    O clasa poate mosteni mai multe interfete
//    Interfata contine doar metode abstracte * la ultimele versiuni de Java interfata poate sa contina si metode cu implementare
//    dar poti sa ai doua tipuri de metode ( default : public void sau static void)
//    Interfetele pot contine alte interfete
//     cuvantul cheie este 'interface' la denumirea clasei
//    Pentru a mosteni o interfata folosim cuvantul cheie 'implements'


    private String nume;
    private String prenume;
    private String varsta;

    public Persoana(String nume, String prenume, String varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }

    //    Fortam implementarea actiunii in clasele copil
    public abstract void doarme();

    //    polimorfism dinamic -> prima implementare a metodei
    public void mananca() {
        System.out.println("Persoana mananca de plictiseala");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
