import contact.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class NameTest {


	@Test
	public void testName() {
		Name name = new Name("John", "Brown");
		assertEquals("John", name.getFirstName());
		assertEquals("Brown", name.getLastName());
	}

	@Test
	public void testChangeLastName() {
		Name name = new Name("Jenny", "Chang");
		name.changeLastName("Zuckerberg");
		assertEquals("Zuckerberg", name.getLastName());
	}


}