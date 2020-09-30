package uninsubria.utils.dictionary;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single definition for a term contained in the dictionary.
 * @author Giulia Pais
 * @version 0.9.0
 */
public class Definition implements Serializable{
	/*---Fields---*/
	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The type of the definition, dependent on the language in use (ex: adjective, adverb, noun...)
	 */
	private String type;
	/**
	 * The actual content of the definition
	 */
	private String definition;
	/**
	 * A list of synonyms for the definition
	 */
	private List<String> synonyms;
	
	/*---Constructors---*/
	/**
	 * Returns an object of type Definition
	 * @param type The type of the definition
	 * @param def The actual content of the definition
	 */
	public Definition(String type, String def) {
		this.type = type;
		this.definition = def;
		this.synonyms = new ArrayList<>();
	}

	/*---Methods---*/
	/**
	 * Returns the type of this definition
	 * @return The type of the definition
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Returns the content of this definition
	 * @return The content of the definition
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * Return the list of synonyms for this definition
	 * @return The list of synonyms
	 */
	public List<String> getSynonyms() {
		return synonyms;
	}
	
	/**
	 * Add a synonym to the list
	 * @param s The string for the synonym
	 */
	public void addSynonym(String s) {
		this.synonyms.add(s);
	}

	@Override
	public String toString() {
		return this.type+": "+ this.definition+"\n"+this.synonyms;
	}	
}
