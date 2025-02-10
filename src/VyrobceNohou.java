public class VyrobceNohou extends Delnik {
    Sklad s = Sklad.getInstance();
    SkladSoucastek ss = SkladSoucastek.getInstance();

    public VyrobceNohou(String jmeno) {
        super(jmeno);
    }

    @Override
    public void run(){
        while(true){
            System.out.println("Vyrobce nohou " + jmeno + " zacal pracovat na dalsi noze");
            if (s.getPocetGramuPlastu() < 30){
                System.out.println("Nedostatek surovin na tvorbu nohy!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            s.removePocetGramuPlastu(30);
            ss.setPocetNohou(ss.getPocetNohou() + 1);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
