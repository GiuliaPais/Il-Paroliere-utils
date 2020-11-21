package uninsubria.utils.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Giulia Pais
 * @version 0.9.0
 */
public class PasswordEncryptor {
    /*---Fields---*/

    /*---Constructors---*/
    public PasswordEncryptor() {}

    /*---Methods---*/
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(password.getBytes());
        byte[] bytes = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            stringBuilder.append(Integer.toHexString(bytes[i] & 0xff));
        }
        String generatedPw = stringBuilder.toString();
        return generatedPw;
    }
}
