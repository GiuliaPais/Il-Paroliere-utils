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
     * Instantiates a new Turns result.
     */
    public TurnsResult() {
    }

    /*---Methods---*/
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getMaxTurns() {
        return maxTurns;
    }

    public void setMaxTurns(Integer maxTurns) {
        this.maxTurns = maxTurns;
    }

    public Integer getMinTurns() {
        return minTurns;
    }

    public void setMinTurns(Integer minTurns) {
        this.minTurns = minTurns;
    }

    public Double getAvgTurns() {
        return avgTurns;
    }

    public void setAvgTurns(Double avgTurns) {
        this.avgTurns = avgTurns;
    }

}
