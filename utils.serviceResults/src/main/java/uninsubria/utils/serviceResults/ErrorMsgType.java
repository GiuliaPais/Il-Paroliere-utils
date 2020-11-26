package uninsubria.utils.serviceResults;

/**
 * Enumerative class that contains possible errors raised during services execution.
 * These are language localized on the client side.
 *
 * @author Giulia Pais
 * @version 0.9.2
 */
public enum ErrorMsgType {
    /*---Enum constants---*/
    GENERIC_DB_ERROR,
    REG_ERR_USERID,
    REG_ERR_EMAIL,
    REG_DUPL_REQUEST,
    REG_EMAIL_FAILURE,
    LOGIN_ERR_NOMATCH,
    LOGIN_ERR_PW,
    LOGIN_ERR_USER_ONLINE;
}
