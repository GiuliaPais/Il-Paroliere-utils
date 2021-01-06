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

    /**
     * Standard ruleset.
     */
    STANDARD(Duration.ofSeconds(30), Duration.ofMinutes(3), Duration.ofMinutes(3), true, 5);

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
     * Should the game interrupt if someone leaves?
     *
     * @return the boolean
     */
    public boolean interruptIfSomeoneLeaves() {
        return interruptIfSomeoneLeaves;
    }

    /**
     * Gets the minimum amount of points to declare a winner.
     *
     * @return the max score to win
     */
    public int getMaxScoreToWin() {
        return maxScoreToWin;
    }

    /**
     * Gets the duration of the pre-game timer.
     *
     * @return the time to start
     */
    public Duration getTimeToStart() {
        return timeToStart;
    }

    /**
     * Gets the duration of the match timer.
     *
     * @return the time to match
     */
    public Duration getTimeToMatch() {
        return timeToMatch;
    }

    /**
     * Gets the duration of the timeout between matches.
     *
     * @return the time to wait from match to match
     */
    public Duration getTimeToWaitFromMatchToMatch() {
        return timeToWaitFromMatchToMatch;
    }

}
