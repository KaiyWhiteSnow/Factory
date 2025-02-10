public class VyrobceTel extends Delnik{
    Sklad s = Sklad.getInstance();
    SkladSoucastek ss = SkladSoucastek.getInstance();

    public VyrobceTel(String jmeno) {
        super(jmeno);
    }

    @Override
    public void run(){
        while(true){
            System.out.println("Vyrobce tel " + jmeno + " zacal pracovat na dalsim tele");
            if (s.getPocetGramuPlastu() < 50){
                System.out.println("Nedostatek surovin na tvorbu těla!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            s.removePocetGramuPlastu(50);
            ss.setPocetNohou(ss.getPocetNohou() + 1);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
