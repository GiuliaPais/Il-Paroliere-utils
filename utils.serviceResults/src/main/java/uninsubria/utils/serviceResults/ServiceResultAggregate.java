package uninsubria.utils.serviceResults;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of AbstractServiceResult. Represents an aggregate or a component in pattern Composite.
 * 
 * @author Giulia Pais
 * @version 0.9.0
 */
public class ServiceResultAggregate extends AbstractServiceResult {
	
	/*---Fields---*/
	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The list of components of type ServiceResult
	 */
	private List<ServiceResult> components;
	
	/*---Constructors---*/
	/**
	 * Returns an object of type ServiceResultAggregate.
	 * @param name the name of this aggregate
	 */
	public ServiceResultAggregate(String name) {
		super(name);
		this.components = new ArrayList<>(5);
	}
	/**
	 * Returns an object of type ServiceResultAggregate.
	 * @param name the name of this aggregate
	 * @param resultList the initial result list of this aggregate
	 */
	public ServiceResultAggregate(String name, List<Result<?>> resultList) {
		super(name, resultList);
		this.components = new ArrayList<>(5);
	}
	/**
	 * Returns an object of type ServiceResultAggregate.
	 * @param name the name of this aggregate
	 * @param resultList the initial result list of this aggregate
	 * @param components the initial components list of this aggregate
	 */
	public ServiceResultAggregate(String name, List<Result<?>> resultList, List<ServiceResult> components) {
		super(name, resultList);
		this.components = components;
	}


	/*---Methods---*/
	/**
	 * Returns the component list of this aggregate
	 * @return the value of the field components
	 */
	public List<ServiceResult> getComponents() {
		return components;
	}
	/**
	 * Sets the component list of this aggregate
	 * @param components a list of components of type ServiceResult
	 */
	public void setComponents(List<ServiceResult> components) {
		this.components = components;
	}
	/**
	 * Adds a component to the list
	 * @param component a component of type ServiceResult
	 */
	public void addComponent(ServiceResult component) {
		if (!components.contains(component)) {
			components.add(component);
		}
	}

}
