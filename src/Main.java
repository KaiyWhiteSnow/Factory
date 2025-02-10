public class Main {
    public static void main(String[] args) throws InterruptedException {
        Sestavitel sestavitel = new Sestavitel("Petr");
        VyrobceHlav v1 = new VyrobceHlav("Karel");
        VyrobceRukou v2 = new VyrobceRukou("Jirka");
        VyrobceNohou v3 = new VyrobceNohou("Marek");
        VyrobceTel v4 = new VyrobceTel("Panzerkampfwagen E 100");

        Thread s1 = new Thread(sestavitel);
        Thread t1 = new Thread(v1);
        Thread t2 = new Thread(v2);
        Thread t3 = new Thread(v3);
        Thread t4 = new Thread(v4);

        s1.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        s1.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();

    }
}