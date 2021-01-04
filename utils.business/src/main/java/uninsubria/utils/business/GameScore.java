package uninsubria.utils.business;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Serializable representation of a score summary that can be sent over socket.
 *
 * @author Giulia Pais
 * @version 0.9.1
 */
public class GameScore implements Serializable {
    /*---Fields---*/
    private static final long serialVersionUID = 1L;
    private Hashtable<String, Integer[]> scores;
    private Hashtable<String, Word[]> matchWords;
    private String winner;

    /*---Constructors---*/
    public GameScore() {
        this.scores = new Hashtable<>();
        this.matchWords = new Hashtable<>();
    }

    /*---Methods---*/
    public Hashtable<String, Integer[]> getScores() {
        return scores;
    }

    public Hashtable<String, Word[]> getMatchWords() {
        return matchWords;
    }

    public String getWinner() {
        return winner;
    }

    public void setScoresForPlayer(String playerId, Integer matchScore, Integer gameScore, Word[] wordList) {
        scores.put(playerId, new Integer[] {matchScore, gameScore});
        matchWords.put(playerId, wordList);
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void setScores(Hashtable<String, Integer[]> scores) {
        this.scores = scores;
    }

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
