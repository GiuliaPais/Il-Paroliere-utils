package uninsubria.utils.languages;

import java.util.Arrays;
import java.util.List;

/**
 * Enumerative class that contains term types for each language.
 * @author Giulia Pais
 * @version 0.9.0
 *
 */
enum TermType {
	/*---Enum constants---*/
	ITALIAN("Altro","Aggettivo", "Verbo", "Sostantivo maschile", "Sostantivo femminile", "Avverbio", "Congiunzione", "Preposizione", 
			"Interiezione"), 
	ENGLISH("Other", "Adjective", "Adverb", "Noun", "Verb");
	
	/*---Fields---*/
	/**
	 * String representing the type attributed to any other type of term that is not contained in types
	 */
	private String other;
	/**
	 * The list of types
	 */
	private List<String> types;
	
	/*---Constructor---*/
	/**
	 * Builds an object of type TermType
	 * @param other String representing the type attributed to any other type of term that is not contained in types
	 * @param types The list of types for that language
	 */
	TermType(String other, String... types) {
		this.other = other;
		this.types = Arrays.asList(types);
	}
	
	/*---Methods---*/
	/**
	 * Returns the value of types field.
	 * @return List of types
	 */
	public List<String> getWordTypes() {
		return this.types;
	}
	/**
	 * Returns the value of other field.
	 * @return The value of other field.
	 */
	public String getAltType() {
		return this.other;
	}
}
