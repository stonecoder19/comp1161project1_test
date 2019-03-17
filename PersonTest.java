import contact.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {


	@Test
	public void testDOB() {
		Person person = new Person("John","Brown",Gender.MALE,19970316);
		assertEquals(19970316, person.getDOB());
	}

	@Test
	public void testName() {
		Person person = new Person("Cindy","Brown",Gender.MALE,19970316);
		assertEquals("Cindy Brown",person.getName());
	}

	@Test 
	public void testGender() {
		Person person = new Person("Jack", "Hall", Gender.FEMALE,19930415);
		assertEquals(Gender.FEMALE, person.getGender());
	}

	@Test
	public void testChangeLastName() {
		Person person = new Person("Jane", "Doe", Gender.MALE, 19930316);
		person.changeLastName("Doey");
		assertEquals("Jane Doey", person.getName());
	}





}