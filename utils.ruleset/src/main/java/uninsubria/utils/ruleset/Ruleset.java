package uninsubria.utils.ruleset;

import uninsubria.utils.chronometer.Counter;

/**
 * Represents a set of rules for a game.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public enum Ruleset {

    /*---Enum constants---*/
    STANDARD(new Counter(0, 30, 0), new Counter(3, 0, 0), true, 50);

    /*---Fields---*/
    private Counter timeToStart, timeToMatch;
    private boolean interruptIfSomeoneLeaves;
    private int maxScoreToWin;

    /*---Constructors---*/
    Ruleset(Counter timeToStart, Counter timeToMatch, boolean interruptIfSomeoneLeaves, int maxScoreToWin) {
        this.timeToStart = timeToStart;
        this.timeToMatch = timeToMatch;
        this.interruptIfSomeoneLeaves = interruptIfSomeoneLeaves;
        this.maxScoreToWin = maxScoreToWin;
    }

    /*---Methods---*/
    /**
     * Il timer che stabilisce il tempo di inizio della partita da quando la stanza è piena.
     * @return counter del pre partita.
     */
    public Counter getTimeToStart() {
        return timeToStart;
    }

    /**
     * Il timer che stabilisce la durata di ogni singolo match.
     * @return counter del match.
     */
    public Counter getTimeToMatch() {
        return timeToMatch;
    }

    /**
     * Il booleano che stabilisce se interrompere il gioco quando qualcuno abbandona o meno.
     * @return il booleano per interrompere o meno il game.
     */
    public boolean interruptIfSomeoneLeaves() {
        return interruptIfSomeoneLeaves;
    }

    /**
     * Il numero che stabilisce il risultato da raggiungere per terminare il game.
     * @return l'int da raggiungere per concludere il game.
     */
    public int getMaxScoreToWin() {
        return maxScoreToWin;
    }
}
