package uninsubria.utils.business;

import java.io.Serializable;
import java.util.UUID;

/**
 * Represents the result of a word statistic query.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public class WordGameStatResult implements Serializable {
    /*---Fields---*/
    private static final long serialVersionUID = 1L;
    private UUID game;
    private String word;
    private Integer points;

    /*---Constructors---*/
    /**
     * Instantiates a new Word game stat result.
     *
     * @param game   the game
     * @param word   the word
     * @param points the points
     */
    public WordGameStatResult(UUID game, String word, Integer points) {
        this.game = game;
        this.word = word;
        this.points = points;
    }

    /*---Methods---*/
    /**
     * Gets game.
     *
     * @return the game
     */
    public UUID getGame() {
        return game;
    }

    /**
     * Sets game.
     *
     * @param game the game
     */
    public void setGame(UUID game) {
        this.game = game;
    }

    /**
     * Gets word.
     *
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets word.
     *
     * @param word the word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Gets points.
     *
     * @return the points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets points.
     *
     * @param points the points
     */
    public void setPoints(Integer points) {
        this.points = points;
    }
}
