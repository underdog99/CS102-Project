//Ovo je Klasa koja sadrzi sve potrebne podatke i metode vezane za Bazu Troskova

package paket1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class BazaTrosak {
	//Promenljive
		private static Connection veza = null; //Konekcija
		private static String url = "jdbc:mysql://localhost/cs102_pazar"; //Url baze
		private static String un = "root"; //username za bazu
		private static String pass = ""; //pass za bazu
		
		//Metoda za unos troska
		public static void unosTroska(String naziv, double trosak, String uneo) {
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				PreparedStatement st = (PreparedStatement) veza.prepareStatement("INSERT INTO trosak (vrednost, naziv, uneo) " + 
				"VALUES (?, ?, ?)");
				
				st.setDouble(1, trosak);
				st.setString(2, naziv);
				st.setString(3, uneo);
				
				st.execute();
				veza.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
}
