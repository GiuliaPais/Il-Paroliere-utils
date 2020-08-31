package uninsubria.utils.languages;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Enumerative class containing supported languages and references to files and objects for each one.
 * 
 * @author Giulia Pais
 * @version 0.9.0
 *
 */
public enum Language {
	/*---Enum constants---*/
	ITALIAN("/dictionaries/th_it_IT_v2.dat", StandardCharsets.ISO_8859_1, TermType.ITALIAN, ValidType.ITALIAN, TermTypesAbbreviations.ITALIAN),
	ENGLISH("/dictionaries/th_en_US_v2.dat", StandardCharsets.UTF_8, TermType.ENGLISH, ValidType.ENGLISH, TermTypesAbbreviations.ENGLISH);
	
	/*---Fields---*/
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
	
	/*---Constructor---*/
	/**
	 * Instantiates an object of type Language
	 * @param dictionary Path to the dictionary file
	 * @param encoding Encoding type for the dictionary file
	 * @param wordTypes Reference to the TermType object related to this language
	 * @param validTypes Reference to the ValidType object related to this language
	 * @param abbrev Reference to the TermTypesAbbreviations object related to this language
	 */
	Language(String dictionary, Charset encoding, TermType wordTypes, ValidType validTypes, TermTypesAbbreviations abbrev) {
		this.dict = dictionary;
		this.encoding = encoding;
		this.termTypes = wordTypes;
		this.validTypes = validTypes;
		this.abbreviations = abbrev;
	}
	
	/*---Methods---*/
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
}
