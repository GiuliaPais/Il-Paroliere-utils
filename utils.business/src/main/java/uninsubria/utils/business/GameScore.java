package uninsubria.utils.business;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Serializable representation of a score summary that can be sent over socket.
 *
 * @author Giulia Pais
 * @version 0.9.2
 */
public class GameScore implements Serializable {
    /*---Fields---*/
    private static final long serialVersionUID = 1L;
    private Hashtable<String, Integer[]> scores;
    private Hashtable<String, Word[]> matchWords;
    private String winner;

    /*---Constructors---*/
    /**
     * Instantiates a new GameScore.
     */
    public GameScore() {
        this.scores = new Hashtable<>();
        this.matchWords = new Hashtable<>();
        this.winner = "";
    }

    /*---Methods---*/
    /**
     * Gets scores.
     *
     * @return the scores
     */
    public Hashtable<String, Integer[]> getScores() {
        return scores;
    }

    /**
     * Gets match words.
     *
     * @return the match words
     */
    public Hashtable<String, Word[]> getMatchWords() {
        return matchWords;
    }

    /**
     * Gets winner.
     *
     * @return the winner
     */
    public String getWinner() {
        return winner;
    }

    /**
     * Sets scores for player.
     *
     * @param playerId   the player id
     * @param matchScore the match score
     * @param gameScore  the game score
     * @param wordList   the word list
     */
    public void setScoresForPlayer(String playerId, Integer matchScore, Integer gameScore, Word[] wordList) {
        scores.put(playerId, new Integer[] {matchScore, gameScore});
        matchWords.put(playerId, wordList);
    }

    /**
     * Sets winner.
     *
     * @param winner the winner
     */
    public void setWinner(String winner) {
        this.winner = winner;
    }

    /**
     * Sets scores.
     *
     * @param scores the scores
     */
    public void setScores(Hashtable<String, Integer[]> scores) {
        this.scores = scores;
    }

    /**
     * Sets match words.
     *
     * @param matchWords the match words
     */
    public void setMatchWords(Hashtable<String, Word[]> matchWords) {
        this.matchWords = matchWords;
    }

    @Override
    public String toString() {
        return "GameScore{\n" +
                "scores=" + scores +
                ", \nmatchWords=" + matchWords +
                ", \nwinner='" + winner + '\'' +
                '}';
    }
}
