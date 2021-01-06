package uninsubria.utils.business;

import java.io.Serializable;
import java.util.Objects;

/**
 * Object representing the result of a player statistic query.
 * It includes a playerID field and a score.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public class PlayerStatResult implements Serializable {
    /*---Fields---*/
    private static final long serialVersionUID = 1L;
    private String playerID;
    private Double score;

    /*---Constructors---*/

    /**
     * Instantiates a new Player stat result.
     *
     * @param playerID the player id
     * @param score    the score
     */
    public PlayerStatResult(String playerID, Double score) {
        this.playerID = playerID;
        this.score = score;
    }

    /*---Methods---*/
    /**
     * Gets player id.
     *
     * @return the player id
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Sets player id.
     *
     * @param playerID the player id
     */
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerStatResult that = (PlayerStatResult) o;
        return Objects.equals(playerID, that.playerID) &&
                Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerID, score);
    }
}
