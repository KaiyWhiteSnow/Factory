public class SkladSoucastek {
    private static SkladSoucastek instance;

    private int pocetHlav = 0;
    private int pocetNohou = 0;
    private int pocetRukou = 0;
    private int pocetTel = 0;

    public int getPocetHlav() {
        return pocetHlav;
    }

    public void setPocetHlav(int pocetHlav) {
        this.pocetHlav = pocetHlav;
    }

    public int getPocetNohou() {
        return pocetNohou;
    }

    public void setPocetNohou(int pocetNohou) {
        this.pocetNohou = pocetNohou;
    }

    public int getPocetRukou() {
        return pocetRukou;
    }

    public void setPocetRukou(int pocetRukou) {
        this.pocetRukou = pocetRukou;
    }

    public int getPocetTel() {
        return pocetTel;
    }

    public void setPocetTel(int pocetTel) {
        this.pocetTel = pocetTel;
    }

    private SkladSoucastek() {}
    public static SkladSoucastek getInstance() {
        if (instance == null) { instance = new SkladSoucastek(); }
        return instance;
    }
}
