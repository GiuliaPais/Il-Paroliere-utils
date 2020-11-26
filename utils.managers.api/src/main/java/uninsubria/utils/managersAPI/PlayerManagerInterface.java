package uninsubria.utils.managersAPI;


import uninsubria.utils.business.Player;
import uninsubria.utils.serviceResults.ServiceResultInterface;

import java.io.IOException;
import java.util.ArrayList;

/**
 * This interface represents all the services that a player can request to the server.
 * It should be implemented both on client and on server side.
 *
 * @author Giulia Pais
 * @version 0.9.1
 *
 */
public interface PlayerManagerInterface {
    public ServiceResultInterface requestActivationCode(String name, String lastname, String userID, String email, String password) throws IOException;
    public Player login(String user, String pw);
}
