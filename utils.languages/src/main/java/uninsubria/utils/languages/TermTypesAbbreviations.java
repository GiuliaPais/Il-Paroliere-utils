package uninsubria.utils.languages;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;

/**
 * Enumerative class containing references to type abbreviations for parsing of dictionary files.
 * @author Giulia Pais
 * @version 0.9.0
 *
 */
enum TermTypesAbbreviations {
	/*---Enum constants---*/
	ITALIAN(TermType.ITALIAN, "agg.", "v.", "s.m.", "s.f.", "avv.", "cong.", "prep.", "inter.");
	
	/*---Fields---*/
	/**
	 * Internal structure holding a pair key-value where keys are abbreviations and values are corresponding types.
	 */
	private Hashtable<String, String> abbrev;
	
	/*---Constructor---*/
	/**
	 * Builds an object of type TermTypesAbbreviations.
	 * @param tType TermType object associated with this language
	 * @param abb A series of abbreviations (same order as TermType types)
	 */
	TermTypesAbbreviations(TermType tType, String...abb) {
		List<String> abbr = Arrays.asList(abb);
		abbrev = new Hashtable<String, String>(abb.length, 1.0f);
		ListIterator<String> iter = tType.getWordTypes().listIterator();
		for (String a : abbr) {
			abbrev.put(a, iter.next());
		}
	}
	
	/*---Methods---*/
	/**
	 * Returns the value of abbrev field.
	 * @return The value of abbrev field
	 */
	public Hashtable<String, String> getAbbreviations() {
		return this.abbrev;
	}
}
