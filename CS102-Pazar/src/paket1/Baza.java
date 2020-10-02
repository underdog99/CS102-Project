//------------Klasa namenjena za rad sa BAZOM(cs102-pazar)-------------------------

package paket1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Baza {
	
	//Promenljive
	private static Connection veza = null; //Konekcija
	private static String url = "jdbc:mysql://localhost/cs102_pazar"; //Url baze
	private static String un = "root"; //username za bazu
	private static String pass = ""; //pass za bazu
	
	//Metoda za izvlacenje podataka iz tabele korisnik
	public static int login(String username, String pw) {
		int tacno = 0;
		try {
			veza = DriverManager.getConnection(url, un, pass); //Konekcija
			
			PreparedStatement st = veza.prepareStatement("SELECT * FROM korisnik WHERE username=? AND pass=?"); //Upit
			PreparedStatement st2 = veza.prepareStatement("SELECT * FROM admin WHERE username=? AND pass=?"); //Upit
			
			st.setString(1, username); //Setovanje
			st.setString(2, pw);
			
			ResultSet rs = st.executeQuery(); //Rezultat
			
			st2.setString(1, username);
			st2.setString(2, pw);
			
			ResultSet rs2 = st2.executeQuery();
			
			if(rs.next() || rs2.next()) {
				tacno = 1;
			} else {
				tacno = 0;
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return tacno;
	}
	
	//Metoda za login Admina
	public static int loginAdmin(String username, String pw) {
		int tacno = 0;
		try {
			veza = DriverManager.getConnection(url, un, pass); //Konekcija
			
			PreparedStatement st = veza.prepareStatement("SELECT * FROM admin WHERE username=? AND pass=?"); //Upit
			
			st.setString(1, username); //Setovanje
			st.setString(2, pw);
			
			ResultSet rs = st.executeQuery(); //Rezultat

			if(rs.next()) {
				tacno = 1;
			} else {
				tacno = 0;
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return tacno;
	}
	
	public static String korisnik(String username, String pw) {
		String imeRadnika = "";
		String ime = "";
		String prezime = "";
		try {
			veza = DriverManager.getConnection(url, un, pass);//Konekcija
			
			PreparedStatement st = veza.prepareStatement("SELECT * FROM korisnik WHERE username=? AND pass=?"); //Upit
			
			st.setString(1, username); //Setovanje
			st.setString(2, pw);
			
			ResultSet rs = st.executeQuery(); //Rezultat
			
			while (rs.next()) {
				ime = rs.getString("ime");
				prezime = rs.getString("prezime");
			}
			
			imeRadnika = ime + " " + prezime;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return imeRadnika;
	}
	
	//Metoda za unos pazara u bazu
	public static void unosPazara(double ukupno, String uneo) {
		try {
			veza = DriverManager.getConnection(url, un, pass);
			
			PreparedStatement st = veza.prepareStatement("INSERT INTO pazari (vrednost, uneo) " + "VALUE (?, ?)");
			
			st.setDouble(1, ukupno);
			st.setString(2, uneo);
			
			st.execute();
			veza.close();
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	//Metoda za unos specifikacije pazara u bazu
	public static void unosSpec(List<Pazar> list, String uneo) {
		
		try {
			veza = DriverManager.getConnection(url, un, pass);
			
			PreparedStatement st = veza.prepareStatement("INSERT INTO spec(specifikacija, uneo) VALUES (?, ?)");
			
			String specifikacija = list.get(0).toString();
			
			st.setString(1, specifikacija);
			st.setString(2, uneo);
			
			st.execute();
			veza.close();
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}
