//---------Klasa namenjena za rad sa bazom, tj. tabelama koji pripadaju Log-u

package paket1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BazaLog {
	
	//Promenljive
		private static Connection veza = null; //Konekcija
		private static String url = "jdbc:mysql://localhost/cs102_pazar"; //Url baze
		private static String un = "root"; //username za bazu
		private static String pass = ""; //pass za bazu
		
		public static void upisLog(Log log) {
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				PreparedStatement st = veza.prepareStatement("INSERT INTO log (poruka) " + "VALUE (?)");
				
				st.setString(1, log.toString());
				
				st.execute();
				veza.close();
				
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		
		//Metoda za prikazivanje Log-ova
		public static List<Log> prikazLog() {
			ArrayList<Log> listaLog = new ArrayList<Log>();
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				String query = "SELECT * FROM log";
				
				Statement st = veza.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while (rs.next()) {
					int id = rs.getInt("id");
					String poruka = rs.getString("poruka");
					String datum = rs.getString("vreme");
					
					listaLog.add(new Log(id, poruka, datum));
				}
				st.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return listaLog;
		}
}
