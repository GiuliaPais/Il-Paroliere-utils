package uninsubria.utils.languages;

import java.util.Arrays;
import java.util.List;

/**
 * Enumerative class containing a subset of types which are considered to be valid for the game.
 * @author Giulia Pais
 * @version 0.9.0
 */
enum ValidType {
	/*---Enum constants---*/
	ITALIAN("Aggettivo", "Verbo", "Sostantivo maschile", "Sostantivo femminile"), 
	ENGLISH("Adjective", "Noun", "Verb");
	
	/*---Fields---*/
	/**
	 * The list of types
	 */
	private final List<String> types;
	
	/*---Constructor---*/
	/**
	 * Builds an object of type ValidType.
	 * @param types The list of valid types for this language
	 */
	ValidType(String... types) {
		this.types = Arrays.asList(types);
	}
	
	/*---Methods---*/
	/**
	 * Returns the value of types field.
	 * @return List of types
	 */
	public List<String> getValidTypes() {
		return this.types;
	}
}
