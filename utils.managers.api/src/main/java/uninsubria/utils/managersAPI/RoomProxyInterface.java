package uninsubria.utils.managersAPI;

import java.io.IOException;
import java.util.HashMap;

/**
 * Collection of methods that must be implemented by room proxies.
 *
 * @author Giulia Pais
 * @version 0.9.2
 */
public interface RoomProxyInterface {
    /**
     * Represents the type of timer that should be set.
     */
    enum TimerType {
        /**
         * Pre game timer type.
         */
        PRE_GAME,
        /**
         * Match timer type.
         */
        MATCH,
        /**
         * Match end timer type.
         */
        MATCH_END,
        /**
         * Timeout timer type.
         */
        TIMEOUT
    }

    /**
     * Sets timer.
     *
     * @param timerType the timer type
     * @throws IOException the io exception
     */
    void setTimer(TimerType timerType) throws IOException;

    /**
     * Quit.
     *
     * @throws IOException the io exception
     */
    void quit() throws IOException;

    String[] readWords() throws IOException;
    void sendGrid(String[] faces, Integer[] numbs) throws IOException;
    void sendScores(HashMap<String, Integer> matchScores, HashMap<String, Integer> gameScores) throws IOException;
}
