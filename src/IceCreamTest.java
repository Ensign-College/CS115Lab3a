import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IceCreamTest {

	@Test
	public void testGetScoopCount() {
		IceCream supreme = new IceCream();
		supreme.getScoopCount();
		assertEquals(supreme.getScoopCount(), 0, 0.001);
	}

	@Test
	public void testGetPricePerScoop() {
		IceCream supreme = new IceCream();
		supreme.getPricePerScoop();
		assertEquals(supreme.getPricePerScoop(), 0, 0.001);
	}

	@Test
	public void testSetScoopCount() {
		IceCream supreme = new IceCream();
		supreme.setScoopCount(3);
		assertEquals(supreme.getScoopCount(), 3, 0.001);
	}

	@Test
	public void testSetPricePerScoop() {
		IceCream supreme = new IceCream();
		supreme.setPricePerScoop(4);
		assertEquals(supreme.getPricePerScoop(), 4, 0.001);
	}

}
