/**
 * 
 */
package uninsubria.utils.business;


import java.io.Serializable;

/**
 * Class representing a player instance and all associated information with the account.
 *
 * @author Alessandro Lerro
 * @author Giulia Pais
 */
public class Player implements Serializable {
	/* Modifiche di @Giulia:
	* - Spostata classe Player da server.database a utils.business (serve sia lato client che server)
	* - Aggiunta interfaccia Serializable
	* - Corretti typo (nomi variabili in maiuscolo)
	* - Rimosso campo PlayerManager (al momento non serve)
	* - Sistemata documentazione
	* */
	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The player nickname (userID)
	 */
	private String playerID;
	/**
	 * The player email
	 */
	private String email;
	/**
	 * The player name, last name and the password
	 */
	private String name, surname, password;
	/**
	 * The code of the chosen profile image
	 */
	private int profileImage;
	/**
	 * The player log status
	 */
	private String log_Status;

	/**
	 * Instantiates a new Player.
	 */
	public Player() {}

	/**
	 * Builds an object of type Player.
	 *
	 * @param playerID     The playerID
	 * @param email        The email
	 * @param name         The name
	 * @param surname      The last name
	 * @param password     The password (hashed)
	 * @param profileImage The profile image code
	 * @param log_Status   The log status
	 */
	public Player(String playerID, String email, String name, String surname, String password, int profileImage, String log_Status) {
		super();
		this.playerID = playerID;
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.profileImage = profileImage;
		this.log_Status = log_Status;
	}


	/**
	 * Builds an object of type Player.
	 *
	 * @param playerID     The playerID
	 * @param email        The email
	 * @param name         The name
	 * @param surname      The last name
	 * @param password     The password (hashed)
	 * @param profileImage The profile image code
	 */
	protected Player(String playerID, String email, String name, String surname, String password, int profileImage) {
		super();
		this.playerID = playerID;
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.profileImage = profileImage;
	}

	/**
	 * Gets player id.
	 *
	 * @return the player id
	 */
	public String getPlayerID() {
		return playerID;
	}

	/**
	 * Sets player id.
	 *
	 * @param playerID the player id
	 */
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	/**
	 * Gets email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets email.
	 *
	 * @param email the email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets profile image.
	 *
	 * @return the profile image
	 */
	public int getProfileImage() {
		return profileImage;
	}

	/**
	 * Sets profile image.
	 *
	 * @param profileImage the profile image
	 */
	public void setProfileImage(int profileImage) {
		this.profileImage = profileImage;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets surname.
	 *
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets surname.
	 *
	 * @param surname the surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Gets password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets password.
	 *
	 * @param password the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets log status.
	 *
	 * @return the log status
	 */
	public String getLog_Status() {
		return log_Status;
	}

	/**
	 * Sets log status.
	 *
	 * @param log_Status the log status
	 */
	public void setLog_Status(String log_Status) {
		this.log_Status = log_Status;
	}
}
