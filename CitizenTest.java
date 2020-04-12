import snid.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;



public class CitizenTest {

	//Test a citizen's gender, can be either M or F (Male/Female)
	@Test
	public void testGetGender() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		assertEquals('M', citi.getGender());
	}

	@Test
	public void testGetYOB() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		assertEquals(1995, citi.getYOB());
	}

	@Test
	public void testLifeStatus() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		citi.setLifeStatus(0);
		assertEquals('A', citi.getLifeStatus());
		citi.setLifeStatus(1);
		assertEquals('D', citi.getLifeStatus());
	}


	@Test
	public void testParent() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		Citizen mom = new Citizen('F', 1962, "Jane", "G", "Goodhart");
		citi.setParent('M', mom);
		assertEquals(mom, citi.getParent('M'));
		Citizen dad = new Citizen('M', 1955, "Jack", "G", "Stone");
		citi.setParent('F', dad);
		assertEquals(dad, citi.getParent('F'));
	}

	@Test
	public void testAddress() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		Address address = new Address("Spanish Town|John||Jamaica");
		citi.setAddress(address);
		assertEquals(address, citi.getAddress());
	}

	@Test
	public void testId() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		Citizen citi2 = new Citizen('F', 1995, "Jane", "Mark", "Luke");
		assertEquals(false, citi.getId().equals(citi2.getId()));
	}

	@Test
	public void testCompare() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		Citizen citi2 = new Citizen('F', 1995, "Jane", "Mark", "Luke");
		assertEquals(false, citi.compareTo(citi2)==0);
	}

	@Test
	public void testGetName() {
		Citizen citi = new Citizen('M', 1995, "Mat", "Mark", "Luke");
		citi.changeLastName("Goldberg");
		assertEquals("GOLDBERG, Mat M.", citi.getName());
		
	}






	// @Test
	// public void testUpdateName() {
	// 	Contact contact = new Contact("Jane", "Morgan", Gender.MALE, 19950316);
	// 	contact.updateName("Stone");
	// 	assertEquals("Stone,Jane", contact.getName());
	// }

	// @Test
	// public void testAddress(){
	// 	Contact contact = new Contact("Jane", "Morgan", Gender.FEMALE, 19950316);
	// 	contact.setAddress("107 Jane Ave;Portmore;;;Jamaica");
	// 	assertTrue(Arrays.equals(new String[]{"107 Jane Ave","Portmore","Jamaica"},
	// 				contact.getAddress()));
	// }

	// @Test
	// public void testAddAlias(){
	// 	Contact contact = new Contact("Jane", "Morgan", Gender.FEMALE, 19950316);
	// 	contact.setAlias("JaneyBoss");
	// 	assertEquals("JaneyBoss", contact.getAlias());
	// }

	// // @Test
	// // public void testMultipleAlias(){
	// // 	Contact contact = new Contact("Jane", "Morgan", Gender.FEMALE, 19950316);
	// // 	contact.setAlias("JaneySwag");
	// // 	Contact contact2 = new Contact("Jack", "Morgan", Gender.FEMALE, 19950316);
	// // 	contact2.setAlias("JaneySwag");
	// // 	assertEquals(null, contact2.getAlias());
	// // }

	// @Test
	// public void testAddEmail() {
	// 	Contact contact = new Contact("Jack", "Morgan", Gender.MALE, 19950316);
	// 	contact.addEmail("jacktheman@gmail.com");
	// 	contact.addEmail("jackthebiggerman@gmail.com");
	// 	assertTrue(Arrays.equals(new String[]{"jacktheman@gmail.com", "jackthebiggerman@gmail.com"},
	// 		contact.getEmailList()));

	// }

	// @Test
	// public void testDeleteEmail() {
	// 	Contact contact = new Contact("Jack", "Morgan", Gender.MALE, 19950316);
	// 	contact.addEmail("jacktheman@gmail.com");
	// 	contact.addEmail("jackthebiggerman@gmail.com");
	// 	contact.addEmail("jackthewasteman@gmail.com");
	// 	contact.deleteEmail("jacktheman@gmail.com");
	// 	assertTrue(Arrays.equals(new String[]{"jackthebiggerman@gmail.com","jackthewasteman@gmail.com"},
	// 			contact.getEmailList()));

	// } 

	// @Test
	// public void testAddPhone() {
	// 	Contact contact = new Contact("John", "Daley", Gender.MALE, 19950316);
	// 	contact.addPhone('H', 8769081130L);
	// 	contact.addPhone('H',6739344401L);
	// 	assertTrue(Arrays.equals(new String[]{"(876) 908-1130","(673) 934-4401"},
	// 				contact.getPhoneList()));

	// }

	// @Test
	// public void testMaxPhoneNum() {
	// 	Contact contact = new Contact("John", "Daley", Gender.MALE, 19950316);
	// 	contact.addPhone('H', 8769081130L);
	// 	contact.addPhone('M',6739344401L);
	// 	contact.addPhone('H',8189344401L);
	// 	contact.addPhone('H',6569344401L);
	// 	contact.addPhone('H',9199344401L);
	// 	contact.addPhone('H',2769344401L);
	// 	assertTrue(Arrays.equals(new String[]{"(876) 908-1130","(673) 934-4401", 
	// 				"(818) 934-4401", "(656) 934-4401", "(919) 934-4401"},
	// 				contact.getPhoneList()));
	// }


	// @Test
	// public void testDeletePhone() {
	// 	Contact contact = new Contact("John", "Daley", Gender.MALE, 19950316);
	// 	contact.addPhone('M',8769081130L);
	// 	contact.addPhone('H',6739344401L);
	// 	contact.deletePhone(8769081130L);
	// 	assertTrue(Arrays.equals(new String[]{"(673) 934-4401"},
	// 		contact.getPhoneList()));

	// }


	// @Test
	// public void testAge() {
	// 	Contact contact = new Contact("Elvis", "Presley", Gender.MALE, 19950216);
	// 	assertEquals(24,contact.getAge());
	// 	Contact contact2 = new Contact("Elvis", "Hasley", Gender.MALE, 19951216);
	// 	assertEquals(23, contact2.getAge());


	// }
}
