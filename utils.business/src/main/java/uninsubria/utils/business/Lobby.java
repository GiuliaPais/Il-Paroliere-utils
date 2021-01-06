package uninsubria.utils.business;

import uninsubria.utils.languages.Language;
import uninsubria.utils.ruleset.Ruleset;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * Static object that maps a Room thread. Needed for display purposes on the GUI and serialization over socket.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public class Lobby implements Serializable {
    /*---Fields---*/
    private static final long serialVersionUID = 1L;
    private final UUID roomId;
    private String roomName;
    private Integer numPlayers;
    private Language language;
    private Ruleset ruleset;
    private LobbyStatus status;

    /**
     * The enum Lobby status.
     */
    public enum LobbyStatus{
        /**
         * Open lobby status.
         */
        OPEN,
        /**
         * Closed lobby status.
         */
        CLOSED
    }

    /*---Constructors---*/
    /**
     * Instantiates a new Lobby.
     *
     * @param roomName   the room name
     * @param numPlayers the num players
     * @param language   the language
     * @param ruleset    the ruleset
     * @param status     the status
     */
    public Lobby(String roomName, int numPlayers, Language language, Ruleset ruleset, LobbyStatus status) {
        this.roomId = UUID.randomUUID();
        this.roomName = roomName;
        this.numPlayers = numPlayers;
        this.language = language;
        this.ruleset = ruleset;
        this.status = status;
    }

    /**
     * Instantiates a new Lobby.
     *
     * @param roomId     the room id
     * @param roomName   the room name
     * @param numPlayers the num players
     * @param language   the language
     * @param ruleset    the ruleset
     * @param status     the status
     */
    public Lobby(UUID roomId, String roomName, int numPlayers, Language language, Ruleset ruleset, LobbyStatus status) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.numPlayers = numPlayers;
        this.language = language;
        this.ruleset = ruleset;
        this.status = status;
    }

    /*---Methods---*/

    /**
     * Gets room id.
     *
     * @return the room id
     */
    public UUID getRoomId() {
        return roomId;
    }

    /**
     * Gets room name.
     *
     * @return the room name
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets room name.
     *
     * @param roomName the room name
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * Gets num players.
     *
     * @return the num players
     */
    public int getNumPlayers() {
        return numPlayers;
    }

    /**
     * Sets num players.
     *
     * @param numPlayers the num players
     */
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    /**
     * Gets language.
     *
     * @return the language
     */
    public Language getLanguage() {
        return language;
    }


    /**
     * Sets language.
     *
     * @param language the language
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * Gets ruleset.
     *
     * @return the ruleset
     */
    public Ruleset getRuleset() {
        return ruleset;
    }

    /**
     * Sets ruleset.
     *
     * @param ruleset the ruleset
     */
    public void setRuleset(Ruleset ruleset) {
        this.ruleset = ruleset;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public LobbyStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(LobbyStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lobby lobby = (Lobby) o;
        return roomId.equals(lobby.roomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId);
    }

    @Override
    public String toString() {
        return "Lobby{" +
                "roomId=" + roomId +
                ", roomName=" + roomName +
                ", numPlayers=" + numPlayers +
                ", language=" + language +
                ", ruleset=" + ruleset +
                ", status=" + status +
                '}';
    }
}
