import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CookieTest {

	@Test
	public void testGetCookieQty() {
		Cookie supreme = new Cookie();
		supreme.getCookieQty();
		assertEquals(supreme.getCookieQty(), 0, 0.001);
	}

	@Test
	public void testGetPricePerDozen() {
		Cookie supreme = new Cookie();
		supreme.getPricePerDozen();
		assertEquals(supreme.getPricePerDozen(), 0, 0.001);
	}

	@Test
	public void testSetCookieQty() {
		Cookie supreme = new Cookie();
		supreme.setCookieQty(2);
		assertEquals(supreme.getCookieQty(), 2);
	}// end of SetCookieQty

	@Test
	public void testSetToppingPricePricePerDozen() {
		Cookie supreme = new Cookie();
		supreme.setToppingPricePricePerDozen(4);
		assertEquals(supreme.getPricePerDozen(), 4, 0.001);
	}// end of SetToppingPricePerDozen

}// end of CookieTest
