package uninsubria.utils.managersAPI;

import uninsubria.utils.connection.CommProtocolCommands;

import java.io.IOException;

/**
 * Collection of methods to be implemented by classes that represent proxies or skeletons in
 * Proxy-Skeleton communication pattern. Mainly consists of methods that read and write on sockets.
 *
 * @author Giulia Pais
 * @version 0.9.1
 */
public interface ProxySkeletonInterface {
    /**
     * Writes a command on the socket by writing the command first
     * and any other object just after.
     *
     * @param command the command
     * @param params  the params
     * @throws IOException the io exception
     */
    void writeCommand(CommProtocolCommands command, Object ... params) throws IOException;

    /**
     * Reads a command from the socket and executes a reserved
     * portion of code according to the type of command.
     *
     * @param command the command
     * @throws IOException            the io exception
     * @throws ClassNotFoundException the class not found exception
     */
    void readCommand(String command) throws IOException, ClassNotFoundException;
}
