package uninsubria.utils.serviceResults;

import java.util.List;
/**
 * Concrete implementation of AbstractServiceResult. Represents a leaf or a component in pattern Composite.
 * 
 * @author Giulia Pais
 * @version 0.9.0
 */
public class ServiceResult extends AbstractServiceResult {
	
	/*---Fields---*/	
	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;

	/*---Constructors---*/
	/**
	 * Returns an object of type ServiceResult.
	 * @param name the name of this ServiceResult
	 * @param resList the result list
	 */
	public ServiceResult(String name, List<Result<?>> resList) {
		super(name, resList);
	}
	/**
	 * Returns an object of type ServiceResult.
	 * @param name the name of this ServiceResult
	 */
	public ServiceResult(String name) {
		super(name);
	}
	
	/*---Methods---*/

}
