//Ovo je klasa namenjena za podatke i metode koji pripadaju Bazi za Statistiku

package paket1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BazaSta {
	
	//Promenljive
		private static Connection veza = null; //Konekcija
		private static String url = "jdbc:mysql://localhost/cs102_pazar"; //Url baze
		private static String un = "root"; //username za bazu
		private static String pass = ""; //pass za bazu

		
		//Metoda za prikaz pazara
		public static List<PazarList> prikaziPazar() {
			ArrayList<PazarList> listaPazar = new ArrayList<PazarList>();
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				String query = "SELECT * FROM pazari";
				
				Statement st = veza.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while (rs.next()) {
					int id = rs.getInt("id");
					double vrednost = rs.getDouble("vrednost");
					String datum = rs.getString("datum");
					String uneo = rs.getString("uneo");
					
					listaPazar.add(new PazarList(id, vrednost, datum, uneo));
				}
				st.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return listaPazar;
		}
		
		//Metoda za prikaz troskova
		public static List<TrosakList> prikaziTrosak() {
			ArrayList<TrosakList> listaTrosak = new ArrayList<TrosakList>();
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				String query = "SELECT * FROM trosak";
				
				Statement st = veza.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while (rs.next()) {
					int id = rs.getInt("id");
					String naziv = rs.getString("naziv");
					double vrednost = rs.getDouble("vrednost");
					String datum = rs.getString("datum");
					String uneo = rs.getString("uneo");
					
					listaTrosak.add(new TrosakList(id, naziv, vrednost, datum, uneo));
				}
				st.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return listaTrosak;
		}
		
		//Metoda za prikaz ukupnog broja unetih pazara
		public static int brojPazara() {
			int broj = 0;
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				String query = "SELECT * FROM pazari";
				
				Statement st = veza.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while (rs.next()) {
					broj++;
				}
				veza.close();
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			return broj;
		}
		
		//Metoda prikazuje broj ukupnih unetih troskova
		public static int brojTroskova() {
			int broj = 0;
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				String query = "SELECT * FROM trosak";
				
				Statement st = veza.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while (rs.next()) {
					broj++;
				}
				veza.close();
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			return broj;
		}
		
		//Metoda prikazuje ukupnu vrednost svih unetih pazara
		public static double ukupnoPazar() {
			double ukupno = 0;
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				String query = "SELECT * FROM pazari";
				
				Statement st = veza.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while (rs.next()) {
					ukupno += rs.getDouble("vrednost");
				}
				
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			return ukupno;
		}
		
		//Metoda prikazuje ukupnu vrednost svih unetih troskova
		public static double ukupnoTrosak() {
			double ukupno = 0;
			try {
				veza = DriverManager.getConnection(url, un, pass);
				
				String query = "SELECT * FROM trosak";
				
				Statement st = veza.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while (rs.next()) {
					ukupno += rs.getDouble("vrednost");
				}
				
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			return ukupno;
		}
		
}
