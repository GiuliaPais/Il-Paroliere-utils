package uninsubria.utils.languages;

/**
 * Enumerative class containing supported languages and references to files and objects for each one.
 * 
 * @author Giulia Pais
 * @version 0.9.0
 *
 */
public enum Language {
	/*---Enum constants---*/
	ITALIAN("/dictionaries/dict-it.oxt", TermType.ITALIAN, ValidType.ITALIAN, TermTypesAbbreviations.ITALIAN);
	
	/*---Fields---*/
	/**
	 * Path to the dictionary file.
	 */
	private String dict;
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
	 * @param wordTypes Reference to the TermType object related to this language
	 * @param validTypes Reference to the ValidType object related to this language
	 * @param abbrev Reference to the TermTypesAbbreviations object related to this language
	 */
	Language(String dictionary, TermType wordTypes, ValidType validTypes, TermTypesAbbreviations abbrev) {
		this.dict = dictionary;
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

}
