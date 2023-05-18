import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SundaeTest {

	@Test
	public void testGetToppingName() {
		Sundae supreme = new Sundae();
		supreme.getToppingName();
		assertEquals(supreme.getToppingName(), "");
	}

	@Test
	public void testGetToppingPrice() {
		Sundae supreme = new Sundae();
		supreme.getToppingPrice();
		assertEquals(supreme.getToppingPrice(), 0, 0.001);
		;
	}

	@Test
	public void testSetToppingName() {
		Sundae supreme = new Sundae();
		supreme.setToppingName("Banana Sundae");
		assertEquals(supreme.getToppingName(), "Banana Sundae");

	}

	@Test
	public void testSetToppingPrice() {
		Sundae supreme = new Sundae();
		supreme.setPricePerScoop(43);
		assertEquals(supreme.getPricePerScoop(), 43, 0.001);
	}

}
