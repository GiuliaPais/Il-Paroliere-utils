package uninsubria.utils.managersAPI;

import uninsubria.utils.connection.CommProtocolCommands;

import java.io.IOException;

/**
 * Collection of methods to be implemented by classes that represent proxies or skeletons in
 * Proxy-Skeleton communication pattern. Mainly consists of methods that read and write on sockets.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public interface ProxySkeletonInterface {
    void writeCommand(CommProtocolCommands command, Object ... params) throws IOException;
    void readCommand(String command) throws IOException, ClassNotFoundException;
    String[] readWords() throws IOException;
}
