package uninsubria.utils.languages;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * Enumerative class containing supported languages and references to files and objects for each one.
 * 
 * @author Giulia Pais
 * @version 0.9.1
 *
 */
public enum Language {
	/*---Enum constants---*/
	ITALIAN("Italian","/dictionaries/th_it_IT_v2.dat", StandardCharsets.ISO_8859_1, TermType.ITALIAN, ValidType.ITALIAN, TermTypesAbbreviations.ITALIAN,
			"it"),
	ENGLISH("English","/dictionaries/th_en_US_v2.dat", StandardCharsets.UTF_8, TermType.ENGLISH, ValidType.ENGLISH, TermTypesAbbreviations.ENGLISH,
			"en");
	
	/*---Fields---*/
	/**
	 * The name of the language.
	 */
	private String language;
	/**
	 * Path to the dictionary file.
	 */
	private String dict;
	/**
	 * Encoding charset for the dictionary file.
	 */
	private Charset encoding;
	/**
	 * Reference to the TermType object.
	 */
	private TermType termTypes;
	/**
	 * Reference to the ValidType object.
	 */
	private ValidType validTypes;
	/**
	 * Reference to the TermTypesAbbreviations object.
	 */
	private TermTypesAbbreviations abbreviations;
	
	private String localeID;
	/*---Constructor---*/
	/**
	 * Instantiates an object of type Language
	 * @param language The name of the language
	 * @param dictionary Path to the dictionary file
	 * @param encoding Encoding type for the dictionary file
	 * @param wordTypes Reference to the TermType object related to this language
	 * @param validTypes Reference to the ValidType object related to this language
	 * @param abbrev Reference to the TermTypesAbbreviations object related to this language
	 */
	Language(String language, String dictionary, Charset encoding, TermType wordTypes, ValidType validTypes, TermTypesAbbreviations abbrev, String localeID) {
		this.language = language;
		this.dict = dictionary;
		this.encoding = encoding;
		this.termTypes = wordTypes;
		this.validTypes = validTypes;
		this.abbreviations = abbrev;
		this.localeID = localeID;
	}
	
	/*---Methods---*/
	/**
	 * Returns the value of language field.
	 * @return The value of language field.
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * Returns the value of dict field.
	 * @return The value of dict field
	 */
	String getDict() {
		return this.dict;
	}
	/**
	 * Returns the value of termTypes field.
	 * @return The value of termTypes field.
	 */
	TermType getTermType() {
		return this.termTypes;
	}
	/**
	 * Returns the value of validTypes field.
	 * @return The value of validTypes field.
	 */
	ValidType getValidType() {
		return this.validTypes;
	}
	/**
	 * Returns the value of abbreviations field.
	 * @return The value of abbreviations field.
	 */
	TermTypesAbbreviations getAbbreviations() {
		return this.abbreviations;
	}
	
	/**
	 * Returns the value of encoding field.
	 * @return The value of encoding field.
	 */
	Charset getEncoding() {
		return this.encoding;
	}
	
	/**
	 * Returns the Locale associated with this language.
	 * @return A Locale object
	 */
	Locale getLocale() {
		return new Locale(this.localeID);
	}
}
