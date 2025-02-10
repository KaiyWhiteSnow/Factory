public class VyrobceHlav extends Delnik {
    Sklad s = Sklad.getInstance();
    SkladSoucastek ss = SkladSoucastek.getInstance();

    public VyrobceHlav(String jmeno) {
        super(jmeno);
    }

    @Override
    public void run(){
        while(true){
            System.out.println("Vyrobce Hlav " + jmeno + " zacal pracovat na dalsi hlave");
            if (s.getPocetGramuPlastu() < 10 || s.getPocetKusuVlasu() < 1){
                System.out.println("Nedostatek surovin na tvorbu hlavy!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            s.removePocetGramuPlastu(10);
            s.removePocetKusuVlasu(1);
            ss.setPocetHlav(ss.getPocetHlav() + 1);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
