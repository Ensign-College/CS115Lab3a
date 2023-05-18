/*Name: Ismatulla Mansurov
 * Date: 9/30/2020
 * Instructor: Jeffrey Light
 * description: Super and sub classes
 */

//DessertItemTest class start

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DessertItemTest {

	@Test
	public void testGetName() {
		DessertItem supreme = new DessertItem();
		supreme.getName();
		assertEquals(supreme.getName(), "");
	}

	@Test
	public void testSetName() {
		DessertItem supreme = new DessertItem();
		supreme.setName("Travis");
		assertEquals(supreme.getName(), "Travis");

	}

}
