package uninsubria.utils.managersAPI;


import uninsubria.utils.business.Player;
import uninsubria.utils.serviceResults.ServiceResultInterface;

import java.io.IOException;

/**
 * This interface represents all the services that a player can request to the server.
 * It should be implemented both on client and on server side.
 *
 * @author Giulia Pais
 * @version 0.9.3
 *
 */
public interface PlayerManagerInterface {
    ServiceResultInterface requestActivationCode(String name, String lastname, String userID, String email, String password) throws IOException;
    ServiceResultInterface confirmActivationCode(String email, String code) throws IOException;
    ServiceResultInterface resendConde(String email, String requestType) throws IOException;
    ServiceResultInterface login(String user, String pw) throws IOException;
    void logout(String userid) throws IOException;
    void updatePlayerInfo(Player player) throws IOException;
    ServiceResultInterface changeUserId(String oldUserID, String newUserID) throws IOException;
    ServiceResultInterface changePassword(String email, String oldPassword, String newPassword) throws IOException;
}
