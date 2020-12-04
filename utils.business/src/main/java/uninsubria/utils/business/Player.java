package uninsubria.utils.business;


import java.io.Serializable;

/**
 * Class representing a player instance and all associated information with the account.
 *
 * @author Alessandro Lerro
 * @author Giulia Pais
 * @version 0.9.2
 */
public class Player implements Serializable {
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
	private boolean logStatus;
	/**
	 * The hex string representing the color of the profile image
	 */
	private String imgColor;
	/**
	 * The hex string representing the color of the background in the profile image
	 */
	private String bgColor;

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
	 * @param imgColor     the img color
	 * @param bgColor      the bg color
	 */
	public Player(String playerID, String email, String name, String surname, String password,
				  int profileImage, boolean log_Status, String imgColor, String bgColor) {
		this.playerID = playerID;
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.profileImage = profileImage;
		this.logStatus = log_Status;
		this.imgColor = imgColor;
		this.bgColor = bgColor;
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
	 * Is log status boolean.
	 *
	 * @return the boolean
	 */
	public boolean isLogStatus() {
		return logStatus;
	}

	/**
	 * Sets log status.
	 *
	 * @param logStatus the log status
	 */
	public void setLogStatus(boolean logStatus) {
		this.logStatus = logStatus;
	}

	/**
	 * Gets img color.
	 *
	 * @return the img color
	 */
	public String getImgColor() {
		return imgColor;
	}

	/**
	 * Sets img color.
	 *
	 * @param imgColor the img color
	 */
	public void setImgColor(String imgColor) {
		this.imgColor = imgColor;
	}

	/**
	 * Gets bg color.
	 *
	 * @return the bg color
	 */
	public String getBgColor() {
		return bgColor;
	}

	/**
	 * Sets bg color.
	 *
	 * @param bgColor the bg color
	 */
	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	@Override
	public String toString() {
		return "Player{" +
				"playerID='" + playerID + '\'' +
				", email='" + email + '\'' +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", password='" + password + '\'' +
				", profileImage=" + profileImage +
				", logStatus=" + logStatus +
				'}';
	}
}
