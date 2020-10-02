package paket1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class RacunajeTest {

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
	public void testRacunanje() {
		System.out.println("Testiranje pazara(racunanje)");
		//Promenljive
		int t10 = 10;
		int t20 = 10;
		int t50 = 10;
		int t100 = 10;
		int t200 = 10;
		int t500 = 10;
		int t1000 = 10;
		int t2000 = 10;
		int t5000 = 10;
		int t1 = 10;
		double t2 = 10;
		double exp = 88900; //Ocekivano
		Racunanje r = new Racunanje(); //Instanca
		double rez = r.pazarUkupno(t10, t20, t50, t100, t200, t500, t1000, t2000, t5000, t1, t2);
		assertEquals(exp, rez); //Test
	}
	
}
