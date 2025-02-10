public class VyrobceRukou extends Delnik{
    Sklad s = Sklad.getInstance();
    SkladSoucastek ss = SkladSoucastek.getInstance();

    public VyrobceRukou(String jmeno) {
        super(jmeno);
    }

    @Override
    public void run(){
        while(true){
            System.out.println("Vyrobce rukou " + jmeno + " zacal pracovat na dalsi ruce");
            if (s.getPocetGramuPlastu() < 20){
                System.out.println("Nedostatek surovin na tvorbu ruky!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            s.removePocetGramuPlastu(20);
            ss.setPocetRukou(ss.getPocetRukou() + 1);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
