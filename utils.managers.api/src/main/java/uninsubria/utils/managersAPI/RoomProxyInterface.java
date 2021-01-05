package uninsubria.utils.managersAPI;

import uninsubria.utils.business.GameScore;
import uninsubria.utils.business.WordRequest;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Collection of methods that must be implemented by room proxies.
 *
 * @author Giulia Pais
 * @version 0.9.6
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
     * Signals the current game has finished, returning the set of words that were
     * requested by this player.
     *
     * @throws IOException the io exception
     * @return A set of requested words
     */
    HashSet<WordRequest> endGame() throws IOException, ClassNotFoundException;

    /**
     * Start new match.
     *
     * @param faces the faces
     * @param numbs the numbs
     * @throws IOException the io exception
     */
    void startNewMatch(String[] faces, Integer[] numbs) throws IOException, ClassNotFoundException;

    /**
     * Sets timeout match.
     *
     * @return the timeout match
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    boolean setTimeoutMatch() throws IOException, ClassNotFoundException;
}
