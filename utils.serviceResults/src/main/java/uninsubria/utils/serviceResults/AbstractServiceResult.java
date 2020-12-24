package uninsubria.utils.serviceResults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Abstract class for ServiceResult objects.
 * @author Giulia Pais
 * @version 0.9.2
 */
public abstract class AbstractServiceResult implements ServiceResultInterface {
	/*---Fields---*/
	/**
	 * The serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The name of this ServiceResult
	 */
	protected String name;
	/**
	 * The list of results
	 */
	private List<Result<?>> resultList;
	
	
	/*---Constructors---*/
	/**
	 * Returns an object of type AbstractServiceResult. Can't be called directly.
	 * @param name the name of this ServiceResult
	 */
	protected AbstractServiceResult(String name) {
		this.name = name;
		this.resultList = new ArrayList<>(5);
	}
	/**
	 * Returns an object of type AbstractServiceResult. Can't be called directly.
	 * @param name name the name of this ServiceResult
	 * @param resList the list of results
	 */
	protected AbstractServiceResult(String name, List<Result<?>> resList) {
		this.name = name;
		this.resultList = resList;
	}
	
	
	/*---Methods---*/
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public List<Result<?>> getResultList() {
		return this.resultList;
	}

	@Override
	public void addResult(Result<?> res) {
		if (!resultList.contains(res)) {
			resultList.add(res);
		}
	}

	@Override
	public <T extends Serializable> void addResult(String name, T value) {
		Result<T> res = new Result<>(name, value);
		if (!resultList.contains(res)) {
			resultList.add(res);
		}
	}

	@Override
	public Result<?> getResult(String resultName) {
		for (Result<?> res : resultList) {
			if (res.getName().equals(resultName)) {
				return res;
			}
		}
		return null;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AbstractServiceResult that = (AbstractServiceResult) o;
		return name.equals(that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "AbstractServiceResult{" +
				"name='" + name + '\'' +
				", resultList=" + resultList +
				'}';
	}
}
