package uninsubria.utils.serviceResults;

import java.io.Serializable;
import java.util.Objects;
/**
 * Generic class representing some kind of result. A result is always characterized by a name and a value.
 * This class is used as a low-level component for implementing heterogeneous collections of values, mostly useful
 * for example when extracting data from a database.
 * @author Giulia Pais
 * @version 0.9.0
 * @param <T> the type of the value represented in this result. Must implement the Serializable interface.
 */
public class Result<T extends Serializable> implements Serializable {
	
	/*---Fields---*/
	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The name of this Result
	 */
	private String name;
	/**
	 * The value of this Result
	 */
	private T value;
	
	/*---Constructors---*/
	/**
	 * Returns an object of type Result
	 * @param name the name for the Result
	 * @param value the value for the Result
	 */
	public Result(String name, T value) {
		this.name = name;
		this.value = value;
	}

	
	/*---Methods---*/
	/**
	 * Returns the value of the field name
	 * @return the value of the field name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns the value of the field value
	 * @return the value of the field value
	 */
	public T getValue() {
		return value;
	}


	@Override
	public final int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Result))
			return false;
		Result<?> other = (Result<?>) obj;
		return Objects.equals(name, other.name);
	}
	
}
