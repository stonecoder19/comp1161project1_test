import contact.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class NameTest {


	@Test
	public void testName() {
		Name name = new Name("John", "Brown");
		assertEquals(name.getFirstName(), "John");
		assertEquals(name.getLastName(), "Brown");
	}

	@Test
	public void testChangeLastName() {
		Name name = new Name("Jenny", "Chang");
		name.changeLastName("Zuckerberg");
		assertEquals(name.getLastName(), "Zuckerberg");
	}


}