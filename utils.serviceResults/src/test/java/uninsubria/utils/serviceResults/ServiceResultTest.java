package uninsubria.utils.serviceResults;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

class ServiceResultTest {
	
	ServiceResult sr;

	@Test
	void test_EqualsHashcodeContract() {
		EqualsVerifier.simple().forClass(Result.class).withOnlyTheseFields("name").verify();
	}
	
	@Test
	void test_addResWithResult() {
		sr = new ServiceResult("testRes");
		Result<String> toAdd1 = new Result<>("res1", "val1");
		assertTrue(sr.getResultList().isEmpty());
		sr.addResult(toAdd1);
		assertEquals(toAdd1, sr.getResultList().get(0));
	}
	
	@Test
	void test_addResWithResultDuplicate() {
		Result<String> toAdd1 = new Result<>("res1", "val1");
		List<Result<?>> resList = new ArrayList<>();
		resList.add(toAdd1);
		sr = new ServiceResult("testRes", resList);
		assertFalse(sr.getResultList().isEmpty());
		assertEquals(1, sr.getResultList().size());
		sr.addResult(toAdd1);
		assertEquals(1, sr.getResultList().size());
	}
	
	@Test
	void test_addResWithParam() {
		sr = new ServiceResult("testRes");
		assertTrue(sr.getResultList().isEmpty());
		sr.addResult("res1", "test1");
		assertEquals(1, sr.getResultList().size());
		assertEquals("res1", sr.getResultList().get(0).getName());
		assertEquals("test1", sr.getResultList().get(0).getValue());
	}
	
	@Test
	void test_addResWithParamDuplicate() {
		Result<String> toAdd1 = new Result<>("res1", "test1");
		List<Result<?>> resList = new ArrayList<>();
		resList.add(toAdd1);
		sr = new ServiceResult("testRes", resList);
		assertFalse(sr.getResultList().isEmpty());
		assertEquals(1, sr.getResultList().size());
		sr.addResult("res1", "test1");
		assertEquals(1, sr.getResultList().size());
		assertEquals("res1", sr.getResultList().get(0).getName());
		assertEquals("test1", sr.getResultList().get(0).getValue());
	}
	
	

}
