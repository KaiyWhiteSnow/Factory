public class Sklad {
    private static Sklad instance;

    private int pocetGramuPlastu = 10000;
    private int pocetKusuVlasu = 1000;

    // Metody
    synchronized int getPocetGramuPlastu(){
        return pocetGramuPlastu;
    }
    synchronized int getPocetKusuVlasu(){
        return pocetKusuVlasu;
    }
    synchronized void removePocetGramuPlastu(int subtract){
        pocetGramuPlastu -= subtract;
    }
    synchronized void removePocetKusuVlasu(int subtract){
        pocetKusuVlasu -= subtract;
    }

    private Sklad() {}
    public static Sklad getInstance() {
        if (instance == null) { instance = new Sklad(); }
        return instance;
    }
}
