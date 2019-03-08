import contact.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {


	@Test
	public void testDOB() {
		Person person = new Person("John","Brown","Male",19970316);
		assertEquals(19970316, person.getDOB());
	}

	@Test
	public void testName() {
		Person person = new Person("Cindy","Brown","Male",19970316);
		assertEquals("Cindy Brown",person.getName());
	}

	@Test 
	public void testGender() {
		Person person = new Person("Jack", "Hall", "Female",19930415);
		assertEquals(person.getGender(), Gender.FEMALE);
	}

	@Test
	public void testChangeLastName() {
		Person person = new Person("Jane", "Doe", "Male", 19930316);
		person.changeLastName("Doey");
		assertEquals(person.getName(), "Jane Doey");
	}





}