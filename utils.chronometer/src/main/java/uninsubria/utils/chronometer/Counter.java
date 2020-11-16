package uninsubria.utils.chronometer;

public class Counter {

    private int min, sec, millis;

    /*-----Constructor-----*/

    /**
     * Costruttore del counter. Il conteggio parte dai valori passati come parametro fino a zero.
     * @param min i minuti.
     * @param sec i secondi.
     * @param millis i millisecondi.
     */
    public Counter(int min, int sec, int millis) {
        this.min = min;
        this.sec = sec;
        this.millis = millis;
    }

    /*-----Methods-----*/

    /**
     * Restituisce i minuti attuali.
     * @return i minuti.
     */
    public int getMin() {
        return min;
    }

    /**
     * Restituisce i secondi attuali.
     * @return i secondi.
     */
    public int getSec() {
        return sec;
    }

    /**
     * Restituisce i millisecondi attuali.
     * @return i millisecondi.
     */
    public int getMillis() {
        return millis;
    }

    /**
     * Decrementa i millisecondi del valore passato come parametro.
     * @param ml il quantitativo di millisecondi di cui decrementare.
     */
    public void decrementMillis(int ml) {
        millis -= ml;
        this.setMillis();
    }

    /**
     * Decrementa i secondi del valore passato come parametro.
     * @param s il quantitativo di secondi di cui decrementare.
     */
    public void decrementSec(int s) {
        sec -= s;
        this.setSec();
    }

    /**
     * Decrementa i minuti del valore passato come parametro.
     * @param mn il quantitativo di minuti di cui decrementare.
     */
    public void decrementMin(int mn) {
        min -= mn;
        this.setMin();
    }

    /**
     * Stabilisce se il counter è arrivato a zero o a meno di zero, nel caso i parametri siano stati decrementati
     * con un valore più alto.
     * @return true se minuti, secondi e millisecondi hanno valore zero o minore. False altrimenti.
     */
    public boolean isEnded() {
        if(this.toString().equals("00:00:00"))
            return true;
        else
            return false;
    }

    /**
     * Restituisce una stringa nella forma "mm:ss:xx".
     * @return La stringa contenente i valori del counter.
     */
    public String toString() {
        return intAsString(min) + ":" + intAsString(sec) + ":" + intAsString(millis);
    }

    /*-----Private Methods-----*/

    // Per trasformare int in stringhe tenendo conto dei valori minori di 10.
    private String intAsString(int i) {
        if(i <= 0)
            return "0" + i;
        else
            return "" + i;
    }

    // Per far ripartire il conteggio da 100 quando i millisecondi scendono sotto lo 0.
    private void setMillis() {
        if(millis < 0) {
            sec--;
            this.setSec();
            millis += 100;

            if(millis < 0)
                this.setMillis();
        }
    }

    // Per far ripartire il conteggio da 60quando i secondi scendono sotto lo 0.
    private void setSec() {
        if(sec < 0) {
            min--;
            this.setMin();
            sec += 60;

            if(sec < 0)
                this.setSec();
        }
    }

    // Raggiunto il minimo, il conteggio si ferma.
   private void setMin() {
        if(min < 0) {
            min = 0;
            sec = 0;
            millis = 0;
        }
   }
}
