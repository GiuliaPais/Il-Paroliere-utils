package uninsubria.utils.serviceResults;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ResultTest {

	@Test
	void test_instantiationAndGetters() {
		Result<String> res = new Result<> ("test1", "value1");
		assertEquals("value1", res.getValue());
		assertEquals("test1", res.getName());
	}

}
