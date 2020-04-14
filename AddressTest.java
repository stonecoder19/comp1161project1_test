import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import snid.*;

public class AddressTest {
	@Test
	public void testCountry() {
		Address address = new Address("Spanish Town|John||Jamaica");
		assertEquals("Jamaica", address.getCountry());
	}

	@Test
	public void testToString() {
		Address address = new Address("Spanish Town|107 Drysdale||Jamaica");
		assertEquals(address.toString(), "Spanish Town\n107 Drysdale\nJamaica");
	}

}