import contact.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhoneTest {

	@Test
	public void testAreaCode() {
		Phone phone = new Phone(8769821128L, 'H');
		assertEquals(876, phone.getAreaCode());
	}

	@Test
	public void testType() {
		Phone phone = new Phone(6542881902L, 'M');
		assertEquals('M',phone.getType());
	}

	@Test
	public void testGetNumber() {
		Phone phone = new Phone(7778211012L, 'M');
		assertEquals(7778211012L, phone.getNumber());
	}

	@Test
	public void testToString() {
		Phone phone = new Phone(6668180788L, 'H');
		assertEquals("(666) 818-0788", phone.toString());
	}
}