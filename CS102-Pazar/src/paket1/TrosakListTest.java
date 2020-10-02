package paket1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TrosakListTest {

	@BeforeClass
	public static void setUpClass() {
	}
	@AfterClass
	public static void tearDownClass() {
	}
	@Before
	public void setUp() {
	}
	@After
	public void tearDown() {
	}

	@Test
	public void testTrosakList() {
		System.out.println("Ovo je test troskova");
		//Promenljive
		String naziv = "";
		double vrednost = 1000;
		TrosakList t = new TrosakList(); //Instanca
		String expNaziv = "";
		double expVre = 1000;
		assertEquals(expNaziv, naziv);
		assertEquals(expVre, vrednost);
	}

}
