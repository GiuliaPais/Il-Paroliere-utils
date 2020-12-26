package uninsubria.utils.managersAPI;

import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;

/**
 * Collection of methods that must be implemented by room proxies.
 *
 * @author Giulia Pais
 * @version 0.9.3
 */
public interface RoomProxyInterface {
    /**
     * Quits connection with the server.
     *
     * @throws IOException the io exception
     */
    void quit() throws IOException;

    String[] readWords() throws IOException;
    void sendScores(HashMap<String, Integer> matchScores, HashMap<String, Integer> gameScores) throws IOException;

    /**
     * Signals the player a new game is starting, sending the game grid and a future instant when the countdown should start.
     * The future time is calculated taking into account the ping with the client.
     *
     * @param faces the faces of the dices on the grid
     * @param numbs the numbers of the dices on the grid
     * @return the future time to start the timer
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    Instant startNewGame(String[] faces, Integer[] numbs) throws IOException, ClassNotFoundException;

    /**
     * Signals players a game was interrupted.
     *
     * @throws IOException the io exception
     */
    void interruptGame() throws IOException;
}
