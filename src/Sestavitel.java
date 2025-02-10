public class Sestavitel extends Delnik {
    SkladSoucastek ss = SkladSoucastek.getInstance();

    public Sestavitel(String jmeno) {
        super(jmeno);
    }

    @Override
    public void run(){
        while(true){
            if (
                ss.getPocetHlav() < 1 &&
                ss.getPocetNohou() < 2 &&
                ss.getPocetRukou() < 2 &&
                ss.getPocetTel() < 1
            ){
                System.out.println("Nedostatek soucastek na postaveni panenky");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
