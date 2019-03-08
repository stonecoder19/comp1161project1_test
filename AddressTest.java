import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import contact.*;

public class AddressTest {
	@Test
	public void testCountry() {
		Address address = new Address("Spanish Town;;;;Jamaica");
		assertEquals("Jamaica", address.getCountry());
	}

	@Test
	public void testAddress() {
		Address address = new Address("Spanish Town;107 Drysdale;;;Jamaica");
		assertTrue(Arrays.equals(address.getAddress(), 
					new String[] {"Spanish Town", "107 Drysdale","Jamaica"}));
	}

	// @Test
	// public void testToString() {
	// 	Address address = new Address("Spanish Town;107 Drysdale;;;Jamaica");
	// 	assertEquals(address.toString(), "\nSpanish Town\n107 Drysdale\nJamaica");
	// }
}