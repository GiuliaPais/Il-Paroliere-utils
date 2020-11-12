package uninsubria.utils.serviceResults;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ServiceResultAggregateTest {
	
	ServiceResultAggregate agg;
	
	@Test
	void test_addComponents() {
		agg = new ServiceResultAggregate("Aggregate1");
		ServiceResult sr = new ServiceResult("SR1");
		agg.getComponents().add(sr);
		assertEquals("SR1", agg.getComponents().get(0).getName());
		assertEquals(sr, agg.getComponents().get(0));
	}
	
//	@Test
//	void test_equalsHashcodeContract() {
//		EqualsVerifier.simple().forClass(Result.class).withOnlyTheseFields("name").verify();
//	}
}
