//Glavna Main klasa, sadrzi GUI za pocetni login


//Autor: Mladen Simeonovic 3668

package paket1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
	
	//Promenljive
	private String imeradnika = ""; 
	
	private Integer prijava;
	private Label naziv;
	private Label netacno;
	private Button bt1;
	private TextField tf1;
	private PasswordField pf;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primary) throws Exception {
		
//------------Konf. i podesavanje GUI-a--------------------------------------------		
		
		naziv = new Label("Log In");
			naziv.setFont(Font.font(null, FontWeight.BOLD, 40));
			naziv.setTextFill(Color.web("#34eb7d"));
			naziv.setAlignment(Pos.CENTER);
			naziv.setPadding(new Insets(20));
			
		netacno = new Label();
			netacno.setFont(Font.font(null, FontWeight.BOLD, 20));
			netacno.setTextFill(Color.web("#eb345f"));
			netacno.setAlignment(Pos.CENTER);
			netacno.setPadding(new Insets(20));
			
		tf1 = new TextField();	
			tf1.setPrefSize(400, 50);
			tf1.setAlignment(Pos.CENTER);
			tf1.setText("Unesi username");
			tf1.setFont(Font.font(null, FontWeight.NORMAL, 20));
			
		pf = new PasswordField();
			pf.setPrefSize(400, 50);
			pf.setAlignment(Pos.CENTER);
			pf.setText("Unesi lozinku");
			pf.setFont(Font.font(null, FontWeight.NORMAL, 20));
			
		bt1 = new Button("Log In");
			bt1.setPrefSize(300, 50);
			bt1.setAlignment(Pos.CENTER);
			bt1.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt1.setTextFill(Color.web("#34eb7d"));
			
		VBox vbox = new VBox(30);
			vbox.getChildren().addAll(naziv, tf1, pf, bt1, netacno);
			vbox.setPadding(new Insets(30));
			vbox.setAlignment(Pos.CENTER);
		
//------------------------------------------------------------------------------
			
//----------Hvatanje i obradjivanje dogadjaja-----------------			
			
		bt1.setOnAction(e -> {
			prijava = Baza.login(tf1.getText(), pf.getText());
			if (prijava == 1) {
				netacno.setText("");
				
				View1 v1 = new View1();
				
				try {
					v1.start(primary);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				Log l = new Log();
					l.setPoruka(tf1.getText() + " se uspesno prijavio(Log in)");
					BazaLog.upisLog(l);
			} else {
				netacno.setText("Netacna lozinka ili username!");
				Log l = new Log();
					l.setPoruka(tf1.getText() + " je pogresno uneo lozinku ili je username netacan!");
					BazaLog.upisLog(l);
			}
		});	
		
//----------------------------------------------------------------------------------------		
			
		Scene scene = new Scene(vbox, 500, 500);
			primary.setTitle("Log In");
			primary.setScene(scene);
			primary.show();
	}

//------Getter i Setter-------------------------------------------------------	
	public String getImeradnika() {
		return imeradnika;
	}

	public void setImeradnika(String imeradnika) {
		this.imeradnika = imeradnika;
	}
	
	

}
