package uninsubria.utils.managersAPI;

import uninsubria.utils.business.GameScore;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

/**
 * Collection of methods that must be implemented by room proxies.
 *
 * @author Giulia Pais
 * @version 0.9.4
 */
public interface RoomProxyInterface {
    /**
     * Quits connection with the server.
     *
     * @throws IOException the io exception
     */
    void quit() throws IOException;

    /**
     * Requests words found in a match to the player.
     *
     * @return the list of words received
     * @throws IOException the io exception
     */
    ArrayList<String> readWords() throws IOException;

    /**
     * Sends the score summary to the player at the end of the match.
     *
     * @param gameScore the game score
     * @throws IOException the io exception
     */
    void sendScores(GameScore gameScore) throws IOException;

    /**
     * Signals the player a new game is starting, sending a future instant when the countdown should start.
     * The future time is calculated taking into account the ping with the client.
     *
     * @return the future time to start the timer
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    Instant startNewGame() throws IOException, ClassNotFoundException;

    /**
     * Signals players a game was interrupted.
     *
     * @throws IOException the io exception
     */
    void interruptGame() throws IOException;

    /**
     * Start new match.
     *
     * @param faces the faces
     * @param numbs the numbs
     * @throws IOException the io exception
     */
    void startNewMatch(String[] faces, Integer[] numbs) throws IOException;

    /**
     * Sets timeout match.
     *
     * @return the timeout match
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    boolean setTimeoutMatch() throws IOException, ClassNotFoundException;
}
