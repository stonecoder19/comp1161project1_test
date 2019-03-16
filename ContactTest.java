import contact.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;



public class ContactTest {

	@Test
	public void testGetName() {
		Contact contact = new Contact("Matthew", "Stone", "Male", 19950316);
		assertEquals("Stone,Matthew", contact.getName());
	}

	@Test
	public void testUpdateName() {
		Contact contact = new Contact("Jane", "Morgan", "Male", 19950316);
		contact.updateName("Stone");
		assertEquals("Stone,Jane", contact.getName());
	}

	@Test
	public void testAddress(){
		Contact contact = new Contact("Jane", "Morgan", "Female", 19950316);
		contact.setAddress("107 Jane Ave;Portmore;;;Jamaica");
		assertTrue(Arrays.equals(new String[]{"107 Jane Ave","Portmore","Jamaica"},
					contact.getAddress()));
	}

	@Test
	public void testAddAlias(){
		Contact contact = new Contact("Jane", "Morgan", "Female", 19950316);
		contact.setAlias("JaneyBoss");
		assertEquals("JaneyBoss", contact.getAlias());
	}

	@Test
	public void testMultipleAlias(){
		Contact contact = new Contact("Jane", "Morgan", "Female", 19950316);
		contact.setAlias("JaneySwag");
		Contact contact2 = new Contact("Jack", "Morgan", "Female", 19950316);
		contact2.setAlias("JaneySwag");
		assertEquals(null, contact2.getAlias());
	}

	@Test
	public void testAddEmail() {
		Contact contact = new Contact("Jack", "Morgan", "Male", 19950316);
		contact.addEmail("jacktheman@gmail.com");
		contact.addEmail("jackthebiggerman@gmail.com");
		assertTrue(Arrays.equals(new String[]{"jacktheman@gmail.com", "jackthebiggerman@gmail.com"},
			contact.getEmailList()));

	}

	@Test
	public void testDeleteEmail() {
		Contact contact = new Contact("Jack", "Morgan", "Male", 19950316);
		contact.addEmail("jacktheman@gmail.com");
		contact.addEmail("jackthebiggerman@gmail.com");
		contact.addEmail("jackthewasteman@gmail.com");
		contact.deleteEmail("jacktheman@gmail.com");
		assertTrue(Arrays.equals(new String[]{"jackthebiggerman@gmail.com","jackthewasteman@gmail.com"},
				contact.getEmailList()));

	} 

	@Test
	public void testAddPhone() {
		Contact contact = new Contact("John", "Daley", "Male", 19950316);
		contact.addPhone('H', 8769081130L);
		contact.addPhone('H',6739344401L);
		assertTrue(Arrays.equals(new String[]{"(876) 908-1130","(673) 934-4401"},
					contact.getPhoneList()));

	}

	@Test
	public void testMaxPhoneNum() {
		Contact contact = new Contact("John", "Daley", "Male", 19950316);
		contact.addPhone('H', 8769081130L);
		contact.addPhone('M',6739344401L);
		contact.addPhone('H',8189344401L);
		contact.addPhone('H',6569344401L);
		contact.addPhone('H',9199344401L);
		contact.addPhone('H',2769344401L);
		assertTrue(Arrays.equals(new String[]{"(876) 908-1130","(673) 934-4401", 
					"(818) 934-4401", "(656) 934-4401", "(919) 934-4401"},
					contact.getPhoneList()));
	}


	@Test
	public void testDeletePhone() {
		Contact contact = new Contact("John", "Daley", "Male", 19950316);
		contact.addPhone('M',8769081130L);
		contact.addPhone('H',6739344401L);
		contact.deletePhone(8769081130L);
		assertTrue(Arrays.equals(new String[]{"(673) 934-4401"},
			contact.getPhoneList()));

	}


	@Test
	public void testAge() {
		Contact contact = new Contact("Elvis", "Presley", "Male", 19950216);
		assertEquals(24,contact.getAge());
		Contact contact2 = new Contact("Elvis", "Hasley", "Male", 19951216);
		assertEquals(23, contact2.getAge());


	}
}
