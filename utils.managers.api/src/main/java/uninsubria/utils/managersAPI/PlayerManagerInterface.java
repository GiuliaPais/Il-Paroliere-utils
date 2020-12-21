package uninsubria.utils.managersAPI;


import uninsubria.utils.business.Lobby;
import uninsubria.utils.business.Player;
import uninsubria.utils.serviceResults.ServiceResultInterface;

import java.io.IOException;
import java.util.UUID;

/**
 * This interface represents all the services that a player can request to the server.
 * It should be implemented both on client and on server side.
 *
 * @author Giulia Pais
 * @version 0.9.6
 */
public interface PlayerManagerInterface {
    /**
     * Request an activation code for the registration of a new user.
     *
     * @param name     the name
     * @param lastname the lastname
     * @param userID   the user id
     * @param email    the email
     * @param password the password
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface requestActivationCode(String name, String lastname, String userID, String email, String password) throws IOException;

    /**
     * Confirm the activation code to complete the registration of a new user.
     *
     * @param email the email
     * @param code  the code
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface confirmActivationCode(String email, String code) throws IOException;

    /**
     * Resends a code if the user didn't receive it via email.
     *
     * @param email       the email
     * @param requestType the request type
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface resendCode(String email, String requestType) throws IOException;

    /**
     * Logs in a user if the credentials are correct.
     *
     * @param user the user
     * @param pw   the pw
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface login(String user, String pw) throws IOException;

    /**
     * Logs out a user.
     *
     * @param userid the userid
     * @throws IOException the io exception
     */
    void logout(String userid) throws IOException;

    /**
     * Updates some non-critical player informations (such as profile image, background image color etc...).
     *
     * @param player the player
     * @throws IOException the io exception
     */
    void updatePlayerInfo(Player player) throws IOException;

    /**
     * Changes the userID for a user if the chosen new ID is available.
     *
     * @param oldUserID the old user id
     * @param newUserID the new user id
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface changeUserId(String oldUserID, String newUserID) throws IOException;

    /**
     * Changes password for a user and notifies the change via email.
     *
     * @param email       the email
     * @param oldPassword the old password
     * @param newPassword the new password
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface changePassword(String email, String oldPassword, String newPassword) throws IOException;

    /**
     * Quits the session for a user that exits the application.
     *
     * @throws IOException the io exception
     */
    void quit() throws IOException;

    /**
     * Resets the password for a user that has forgotten it.
     *
     * @param email the email
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface resetPassword(String email) throws IOException;

    /**
     * Deletes a user if the user exists and the password is correct.
     *
     * @param id       the id
     * @param password the password
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface deleteProfile(String id, String password) throws IOException;

    /**
     * Creates a new room on the RoomList.
     *
     * @param lobby the lobby
     * @return true if correctly added
     * @throws IOException the io exception
     */
    boolean createRoom(Lobby lobby) throws IOException;

    /**
     * Lets a player exit from the room.
     *
     * @param roomID the room id
     * @throws IOException the io exception
     */
    void leaveRoom(UUID roomID) throws IOException;

    /**
     * Lets a player join a room.
     *
     * @param roomID the room id
     * @return An object wrapping the result of the service execution
     * @throws IOException the io exception
     */
    ServiceResultInterface joinRoom(UUID roomID) throws IOException;
}
