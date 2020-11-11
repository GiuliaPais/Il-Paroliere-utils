package uninsubria.utils.managersAPI;


import uninsubria.utils.business.Player;
import uninsubria.utils.serviceResults.ServiceResultInterface;

/**
 * @author Giulia Pais
 * @version 0.9.0
 *
 */
public interface PlayerManagerInterface {
    public Player login(String user, String pw);
    public Player registerUser();
}
