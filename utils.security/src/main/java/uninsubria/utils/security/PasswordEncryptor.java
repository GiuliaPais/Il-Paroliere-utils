package uninsubria.utils.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utility objects that provides methods for password hashing.
 *
 * @author Giulia Pais
 * @version 0.9.0
 */
public class PasswordEncryptor {
    /*---Constructors---*/
    /**
     * Instantiates a new Password encryptor.
     */
    public PasswordEncryptor() {}

    /*---Methods---*/
    /**
     * Hashes a given password.
     *
     * @param password the password
     * @return the string
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(password.getBytes());
        byte[] bytes = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder();
        for (byte aByte : bytes) {
            stringBuilder.append(Integer.toHexString(aByte & 0xff));
        }
        return stringBuilder.toString();
    }
}
