package uninsubria.utils.ruleset;

import java.time.Duration;

/**
 * Represents a set of rules for a game.
 *
 * @author Giulia Pais
 * @version 0.9.2
 */
public enum Ruleset {

    /*---Enum constants---*/
    STANDARD(Duration.ofSeconds(30), Duration.ofMinutes(3), Duration.ofMinutes(3), true, 50);

    /*---Fields---*/
    private Duration timeToStart, timeToMatch, timeToWaitFromMatchToMatch;
    private boolean interruptIfSomeoneLeaves;
    private int maxScoreToWin;

    /*---Constructors---*/
    Ruleset(Duration timeToStart, Duration timeToMatch, Duration timeToWaitFromMatchToMatch,
            boolean interruptIfSomeoneLeaves, int maxScoreToWin) {
        this.timeToStart = timeToStart;
        this.timeToMatch = timeToMatch;
        this.timeToWaitFromMatchToMatch = timeToWaitFromMatchToMatch;
        this.interruptIfSomeoneLeaves = interruptIfSomeoneLeaves;
        this.maxScoreToWin = maxScoreToWin;
    }

    /*---Methods---*/
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
