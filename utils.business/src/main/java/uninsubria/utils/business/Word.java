package uninsubria.utils.business;

import java.io.Serializable;

/**
 * A serializable representation of a word with associated flags (duplicated, wrong) and associated score.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public class Word implements Serializable {
    /*---Fields---*/
    private static final long serialVersionUID = 1L;
    private String word;
    private boolean duplicated;
    private boolean wrong;
    private int points;


    /*---Constructors---*/

    /**
     * Instantiates a new Word.
     *
     * @param word       the word
     * @param duplicated the duplicated
     * @param wrong      the wrong
     * @param points     the points
     */
    public Word(String word, boolean duplicated, boolean wrong, int points) {
        this.word = word;
        this.duplicated = duplicated;
        this.wrong = wrong;
        this.points = points;
    }

    /**
     * Instantiates a new Word.
     */
    public Word() {
    }

    /*---Methods---*/

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
     * Is duplicated boolean.
     *
     * @return the boolean
     */
    public boolean isDuplicated() {
        return duplicated;
    }

    /**
     * Sets duplicated.
     *
     * @param duplicated the duplicated
     */
    public void setDuplicated(boolean duplicated) {
        this.duplicated = duplicated;
    }

    /**
     * Is wrong boolean.
     *
     * @return the boolean
     */
    public boolean isWrong() {
        return wrong;
    }

    /**
     * Sets wrong.
     *
     * @param wrong the wrong
     */
    public void setWrong(boolean wrong) {
        this.wrong = wrong;
    }

    /**
     * Gets points.
     *
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Sets points.
     *
     * @param points the points
     */
    public void setPoints(int points) {
        this.points = points;
    }
}
