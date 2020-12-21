package uninsubria.utils.connection;

/**
 * Represents possible commands to send over a socket stream.
 *
 * @author Giulia Pais
 * @version 0.9.4
 */
public enum CommProtocolCommands {
    /*---Enum constants---*/
    ACTIVATION_CODE,
    CONFIRM_ACTIVATION_CODE,
    RESEND_CODE,
    LOGIN,
    LOGOUT,
    QUIT,
    SEND_GRID,
    SEND_WORDS,
    SEND_SCORE,
    SET_SYNC,
    UPDATE_PLAYER_INFO,
    CHANGE_USER_ID,
    CHANGE_PW,
    RESET_PW,
    DELETE_PROFILE,
    PING_SERVER,
    END_GAME,
    SEND_ROOM_LIST,
    CREATE_ROOM,
    LEAVE_ROOM,
    SEND_PLIST,
    JOIN_ROOM;

    /*---Fields---*/
    private final String command;

    /*---Constructors---*/
    CommProtocolCommands() {
        this.command = "<" + this.name() + ">";
    }

    /*---Methods---*/
    /**
     * Gets the command as a string. Every command is contained in angular brackets,
     * for example: <ACTIVATION_CODE>
     *
     * @return the command string
     */
    public String getCommand() {
        return command;
    }

    /**
     * Gets the enum constant by passing the value of the command (with angular brackets).
     *
     * @param command the command string
     * @return the enum constant associated with that string
     */
    public static CommProtocolCommands getByCommand(String command) {
        for (CommProtocolCommands com : values()) {
            if (command.equals(com.getCommand())) {
                return com;
            }
        }
        return null;
    }
}
