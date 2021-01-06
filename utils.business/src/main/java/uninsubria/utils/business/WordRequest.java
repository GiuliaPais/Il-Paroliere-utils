package uninsubria.utils.business;

import java.io.Serializable;
import java.util.Objects;

/**
 * Utility objects, wraps a word definition request by saving the word as a string and the match in which the
 * word was requested.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public class WordRequest implements Serializable {
    /*---Fields---*/
    private String word;
    private final int matchRequested;

    /*---Constructors---*/

    /**
     * Instantiates a new Word request.
     *
     * @param word           the word
     * @param matchRequested the match requested
     */
    public WordRequest(String word, int matchRequested) {
        this.word = word;
        this.matchRequested = matchRequested;
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
     * Gets match requested.
     *
     * @return the match requested
     */
    public int getMatchRequested() {
        return matchRequested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordRequest that = (WordRequest) o;
        return matchRequested == that.matchRequested &&
                word.equals(that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, matchRequested);
    }

    @Override
    public String toString() {
        return "WordRequest{" +
                "word='" + word + '\'' +
                ", matchRequested=" + matchRequested +
                '}';
    }
}
