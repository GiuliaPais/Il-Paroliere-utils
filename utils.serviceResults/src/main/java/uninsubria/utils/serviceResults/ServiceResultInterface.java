package uninsubria.utils.serviceResults;

import java.io.Serializable;
import java.util.List;

/**
 * Generic interface for objects representing results returned from the execution of a service.
 * 
 * @author Giulia Pais
 * @version 0.9.1
 */
public interface ServiceResultInterface extends Serializable {
	/**
	 * Returns the name of the result
	 * @return the value of the field name
	 */
	public String getName();
	/**
	 * Returns the result list
	 * @return the value of the field result list
	 */
	public List<Result<?>> getResultList();
	/**
	 * Adds an object of type Result to the result list
	 * @param res the Result object to add
	 */
	public void addResult(Result<?> res);
	/**
	 * Adds an object of type Result to the result list
	 * @param <T> The type of the value
	 * @param name name of the result
	 * @param value the value of the result
	 */
	public <T extends Serializable> void addResult(String name, T value);

	/**
	 * Gets a specific Result from the list by its name.
	 * @param resultName the result name
	 * @return A Result object or null if nothing was found
	 */
	public Result<?> getResult(String resultName);
}
