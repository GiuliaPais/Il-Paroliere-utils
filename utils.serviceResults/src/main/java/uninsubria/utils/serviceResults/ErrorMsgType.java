package uninsubria.utils.serviceResults;

/**
 * @author Giulia Pais
 * @version 0.9.0
 */
public enum ErrorMsgType {
    /*---Enum constants---*/
    LOGIN_ERR_NOMATCH("No user found with this id"),
    LOGIN_ERR_PW("Password is incorrect"),
    LOGIN_ERR_USER_ONLINE("User already logged in");

    /*---Fields---*/
    private String message;

    /*---Constructors---*/
    ErrorMsgType(String s) {
        this.message = s;
    }

    /*---Methods---*/
    public String getMessage() {
        return message;
    }
}
