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
    public Word(String word, boolean duplicated, boolean wrong, int points) {
        this.word = word;
        this.duplicated = duplicated;
        this.wrong = wrong;
    }

    public Word() {
    }

    /*---Methods---*/
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isDuplicated() {
        return duplicated;
    }

    public void setDuplicated(boolean duplicated) {
        this.duplicated = duplicated;
    }

    public boolean isWrong() {
        return wrong;
    }

    public void setWrong(boolean wrong) {
        this.wrong = wrong;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
