import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CandyTest {

	@Test
	public void testGetCandyWeight() {
		Candy supreme = new Candy();
		supreme.getCandyWeight();
		assertEquals(supreme.getCandyWeight(), 0, 0.001);
	}

	@Test
	public void testGetPricePerPound() {
		Candy supreme = new Candy();
		supreme.getPricePerPound();
		assertEquals(supreme.getPricePerPound(), 0, 0.001);
	}

	@Test
	public void testSetCandyWeight() {
		Candy supreme = new Candy();
		supreme.setCandyWeight(3);
		assertEquals(supreme.getCandyWeight(), 3, 0.001);
	}

	@Test
	public void testSetPricePerPound() {
		Candy supreme = new Candy();
		supreme.setPricePerPound(3.5);
		assertEquals(supreme.getPricePerPound(), 3.5, 0.001);
	}
}
