package uninsubria.utils.business;

import java.io.Serializable;

/**
 * Represents the structure of a result for a query about match statistics.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public class TurnsResult implements Serializable {
    /*---Fields---*/
    private static final long serialVersionUID = 1L;
    private Integer category;
    private Integer maxTurns;
    private Integer minTurns;
    private Double avgTurns;

    /*---Constructors---*/

    /**
     * Instantiates a new TurnsResult.
     */
    public TurnsResult() {
    }

    /*---Methods---*/

    /**
     * Gets category.
     *
     * @return the category
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * Gets max turns.
     *
     * @return the max turns
     */
    public Integer getMaxTurns() {
        return maxTurns;
    }

    /**
     * Sets max turns.
     *
     * @param maxTurns the max turns
     */
    public void setMaxTurns(Integer maxTurns) {
        this.maxTurns = maxTurns;
    }

    /**
     * Gets min turns.
     *
     * @return the min turns
     */
    public Integer getMinTurns() {
        return minTurns;
    }

    /**
     * Sets min turns.
     *
     * @param minTurns the min turns
     */
    public void setMinTurns(Integer minTurns) {
        this.minTurns = minTurns;
    }

    /**
     * Gets avg turns.
     *
     * @return the avg turns
     */
    public Double getAvgTurns() {
        return avgTurns;
    }

    /**
     * Sets avg turns.
     *
     * @param avgTurns the avg turns
     */
    public void setAvgTurns(Double avgTurns) {
        this.avgTurns = avgTurns;
    }

}
