public class Thread_Bsp {

    public Thread_Bsp() {
        Zaehler t1 = new Zaehler ("Thread Nr. 1 zählt: " , 450);
        Zaehler t2 = new Zaehler ("Thread Nr. 2 zählt: " , 500);
        // startet die Threads, die dann ihre run-Methode ausführen
        t1.start();
        t2.start();        
    }

}
