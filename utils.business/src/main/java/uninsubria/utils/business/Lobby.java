package uninsubria.utils.business;

import javafx.beans.property.*;
import uninsubria.utils.languages.Language;
import uninsubria.utils.ruleset.Ruleset;

import java.io.Serializable;
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
    private StringProperty roomName;
    private IntegerProperty numPlayers;
    private ObjectProperty<Language> language;
    private ObjectProperty<Ruleset> ruleset;
    private ObjectProperty<LobbyStatus> status;

    public enum LobbyStatus{
        OPEN, CLOSED
    }

    /*---Constructors---*/
    public Lobby(String roomName, int numPlayers, Language language, Ruleset ruleset, LobbyStatus status) {
        this.roomId = UUID.randomUUID();
        this.roomName = new SimpleStringProperty(roomName);
        this.numPlayers = new SimpleIntegerProperty(numPlayers);
        this.language = new SimpleObjectProperty<>(language);
        this.ruleset = new SimpleObjectProperty<>(ruleset);
        this.status = new SimpleObjectProperty<>(status);
    }

    public Lobby(UUID roomId, String roomName, int numPlayers, Language language, Ruleset ruleset, LobbyStatus status) {
        this.roomId = roomId;
        this.roomName = new SimpleStringProperty(roomName);
        this.numPlayers = new SimpleIntegerProperty(numPlayers);
        this.language = new SimpleObjectProperty<>(language);
        this.ruleset = new SimpleObjectProperty<>(ruleset);
        this.status = new SimpleObjectProperty<>(status);
    }

    /*---Methods---*/
    public UUID getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName.get();
    }

    public StringProperty roomNameProperty() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName.set(roomName);
    }

    public int getNumPlayers() {
        return numPlayers.get();
    }

    public IntegerProperty numPlayersProperty() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers.set(numPlayers);
    }

    public Language getLanguage() {
        return language.get();
    }

    public ObjectProperty<Language> languageProperty() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language.set(language);
    }

    public Ruleset getRuleset() {
        return ruleset.get();
    }

    public ObjectProperty<Ruleset> rulesetProperty() {
        return ruleset;
    }

    public void setRuleset(Ruleset ruleset) {
        this.ruleset.set(ruleset);
    }

    public LobbyStatus getStatus() {
        return status.get();
    }

    public ObjectProperty<LobbyStatus> statusProperty() {
        return status;
    }

    public void setStatus(LobbyStatus status) {
        this.status.set(status);
    }
}
