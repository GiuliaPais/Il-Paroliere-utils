package uninsubria.utils.chronometer;

public class Chronometer extends Thread {

    private final Counter counter;
    private boolean started;

    /*-----Constructor-----*/

    /**
     * Il costruttore di Chronometer. Una volta passatogli il counter, inizia immediatamente a decrementarlo
     * fino al raggiungimento dello 0. Se i valori sono negativi, il cronometro considera già terminato il suo
     * compito.
     * @param c il counter da decrementare.
     */
    public Chronometer(Counter c) {
        counter = c;
        this.start();
    }

    /*-----Methods-----*/

    @Override
    public void run() {
        started = true;

        while(started) {
            this.decrementMillis();

            if(counter.isEnded())
                this.interrupt();
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        started = false;
    }

    /*-----Private Methods-----*/

    // Decrementa i millisecondi del counter di 1 e attende il tempo necessario per ripetere.
    private void decrementMillis() {
        counter.decrementMillis(1);
        try {
            sleep(10);
        } catch (InterruptedException e) { }
    }
}
