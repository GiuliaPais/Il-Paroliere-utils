package uninsubria.utils.ruleset;

import uninsubria.utils.chronometer.Counter;

import java.time.Duration;

/**
 * Represents a set of rules for a game.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public enum Ruleset {

    /*---Enum constants---*/
//    STANDARD(new Counter(0, 30, 0), new Counter(3, 0, 0), new Counter(0, 10, 0),true, 50);
    STANDARD(Duration.ofSeconds(30), Duration.ofMinutes(3), Duration.ofMinutes(3), true, 50);

    /*---Fields---*/
//    private Counter timeToStart, timeToMatch, timeToWaitFromMatchToMatch;
    private Duration timeToStart, timeToMatch, timeToWaitFromMatchToMatch;
    private boolean interruptIfSomeoneLeaves;
    private int maxScoreToWin;

    /*---Constructors---*/
//    Ruleset(Counter timeToStart, Counter timeToMatch, Counter timeToWaitFromMatchToMatch,
//            boolean interruptIfSomeoneLeaves, int maxScoreToWin) {
//        this.timeToStart = timeToStart;
//        this.timeToMatch = timeToMatch;
//        this.timeToWaitFromMatchToMatch = timeToWaitFromMatchToMatch;
//        this.interruptIfSomeoneLeaves = interruptIfSomeoneLeaves;
//        this.maxScoreToWin = maxScoreToWin;
//    }

    Ruleset(Duration timeToStart, Duration timeToMatch, Duration timeToWaitFromMatchToMatch,
            boolean interruptIfSomeoneLeaves, int maxScoreToWin) {
        this.timeToStart = timeToStart;
        this.timeToMatch = timeToMatch;
        this.timeToWaitFromMatchToMatch = timeToWaitFromMatchToMatch;
        this.interruptIfSomeoneLeaves = interruptIfSomeoneLeaves;
        this.maxScoreToWin = maxScoreToWin;
    }

    /*---Methods---*/
//    /**
//     * Il timer che stabilisce il tempo di inizio della partita da quando la stanza è piena.
//     * @return counter del pre partita.
//     */
//    public Counter getTimeToStart() {
//        return timeToStart;
//    }
//
//    /**
//     * Il timer che stabilisce la durata di ogni singolo match.
//     * @return counter del match.
//     */
//    public Counter getTimeToMatch() {
//        return timeToMatch;
//    }
//
//    /**
//     * Il timer che stabilisce l'attesa tra un match e l'altro.
//     * @return counter di attesa tra i match.
//     */
//    public Counter getTimeToWaitFromMatchToMatch() { return timeToWaitFromMatchToMatch; }

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

    public Duration getTimeToStart() {
        return timeToStart;
    }

    public Duration getTimeToMatch() {
        return timeToMatch;
    }

    public Duration getTimeToWaitFromMatchToMatch() {
        return timeToWaitFromMatchToMatch;
    }

}
