public class Zaehler extends Thread {

    /* Beispiel für Threads:
     Ein Zaehler mit Namen name zählt von 1 bis 10,
     zwischen jedem Zählschritt wartet er eine bestimmte
     wartezeit (in ms) und gibt dann den Stand des zaehlers
     auf dem Bildschirm aus. */

    private String name;
    private int zaehler;
    private int wartezeit;

    //Konstruktor
    public Zaehler (String n , int w) {
        name = n;
        zaehler = 0;
        wartezeit = w;
    }

    // Methode run() überschreibt die gleichnamige Methode der Oberklasse.
    public void run() {
        try { // try und catch wegen sleep() nötig
            for (int i = 1 ; i <= 20 ; i++) {
                zaehler = i;
                sleep(wartezeit);
                System.out.println("Stand von " + name + " : " + zaehler);
            }
            System.out.println("Endstand von " + name + " : " + zaehler);
        } catch (InterruptedException e) { }
    }

}
