import snid.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NameTest {


	@Test
	public void testName() 
	{
		Name name = new Name("Jake", "Adam", "Brown");
		assertEquals("Jake", name.getFirstName());
		assertEquals("Adam", name.getMiddleName());
		assertEquals("Brown", name.getLastName());
	}

	@Test
	public void testChangeLastName() 
	{
		Name name = new Name("Jenny", "Baker", "Chang");
		name.setLastName("Zuckerberg");
		assertEquals("Zuckerberg", name.getLastName());
	}

	@Test
	public void testToString()
	{
		Name name = new Name("Jenny", "Baker", "Chang");
		assertEquals(name.toString(), "Jenny Baker Chang");
	}

	@Test
	public void testEquals()
	{
		Name name = new Name("Jack", "Forrest", "Hill");
		assertEquals(name.equals(new Name("Jack", "Forrest", "Hill")), true);
		
		assertEquals(name.equals(new Name("Jack", "Jerry", "Hill")), false);
		assertEquals(name.equals(new Name("Jack", "Forrest", "Hillibilie")), false);
		assertEquals(name.equals(new Name("Jill", "Jerry", "Hill")), false);
	
	}


}