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

    public enum LobbyStatus{
        OPEN, CLOSED
    }

    /*---Constructors---*/
    public Lobby(String roomName, int numPlayers, Language language, Ruleset ruleset, LobbyStatus status) {
        this.roomId = UUID.randomUUID();
        this.roomName = roomName;
        this.numPlayers = numPlayers;
        this.language = language;
        this.ruleset = ruleset;
        this.status = status;
    }

    public Lobby(UUID roomId, String roomName, int numPlayers, Language language, Ruleset ruleset, LobbyStatus status) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.numPlayers = numPlayers;
        this.language = language;
        this.ruleset = ruleset;
        this.status = status;
    }

    /*---Methods---*/
    public UUID getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public Language getLanguage() {
        return language;
    }


    public void setLanguage(Language language) {
        this.language = language;
    }

    public Ruleset getRuleset() {
        return ruleset;
    }

    public void setRuleset(Ruleset ruleset) {
        this.ruleset = ruleset;
    }

    public LobbyStatus getStatus() {
        return status;
    }

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
