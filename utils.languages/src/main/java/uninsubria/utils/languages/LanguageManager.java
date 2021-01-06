package uninsubria.utils.languages;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Class that acts as an interface for client modules.
 * @author Giulia Pais
 * @version 0.9.1
 *
 */
public class LanguageManager {
	/*---Fields---*/
	/**
	 * The language this object is managing.
	 */
	private Language lang;
	
	/*---Constructors---*/
	/**
	 * Builds an object of type LanguageManager
	 * @param lang The language to manage
	 */
	public LanguageManager(Language lang) {
		this.lang = lang;
	}
	
	/*---Methods---*/
	/**
	 * Gets a file from resources from the specified path.
	 * @param filename The string representing the relative path to the file
	 * @return The file or NULL
	 * @throws URISyntaxException If there were issues in converting the URL to URI
	 */
	private File getAssociatedFile(String filename) throws URISyntaxException {
		URL res = this.getClass().getResource(filename);
		if (res == null) {
			return(null);
		} else {
			return new File(res.toURI());
		}
	}
	
	/**
	 * Gets the actual dictionary file of this language in the resources and returns it as a File object.
	 * @return The dictionary file or NULL if no resource was found
	 * @throws URISyntaxException If issues were found with the conversion of URL to URI
	 */
	public File getDictionaryFile() throws URISyntaxException {
		File dict;
		dict = this.getAssociatedFile(lang.getDict());
		return(dict);
	}
	
	/**
	 * Gets the abbreviations table for this language. The table contains abbreviations as found in the dictionary and
	 * corresponding term types.
	 * @return The abbreviations table
	 */
	public HashMap<String, String> getAbbreviations() {
		return lang.getAbbreviations().getAbbreviations();
	}
	
	/**
	 * Gets all the term types for the language.
	 * @return A list of term types
	 */
	public List<String> getTermTypes() {
		return lang.getTermType().getWordTypes();
	}
	
	/**
	 * Gets the alternative type (a type that is associated with a term when none of the term types was applicable) for the language.
	 * @return The alternative type as a string
	 */
	public String getAlternativeTermType() {
		return lang.getTermType().getAltType();
	}
	
	/**
	 * Gets only the the subset of term types which are considered valid in the game for the language.
	 * @return The list of valid types
	 */
	public List<String> getValidTypes() {
		return lang.getValidType().getValidTypes();
	}
	
	/**
	 * Gets the encoding used in the dictionary file for the language.
	 * @return The encoding charset
	 */
	public Charset getDictEncoding() {
		return lang.getEncoding();
	}
	
	/**
	 * Builds the resource bundle for the GUI localization.
	 * @return A ResourceBundle object
	 */
	public ResourceBundle getResourcesBundle() {
		Locale loc = lang.getLocale();
		return ResourceBundle.getBundle("gui_localization.guitext", loc);
	}

	/**
	 * Gets the current value of lang.
	 * @return The value of lang
	 */
	public Language getLang() {
		return lang;
	}

	/**
	 * Sets the value of lang.
	 * @param lang A Language constant.
	 */
	public void setLang(Language lang) {
		this.lang = lang;
	}
}
