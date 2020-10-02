//Klasa obezbedjuje GUI za Unos TROSKA------------------------------------

package paket1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ViewTrosak extends Application {

	
	//Promenljive
	private Label naziv;
	private Label trosak;
	private TextField tf1;
	private TextField tf2;
	
	private Button bt1;
	private Button bt2;
	private Button bt3;
	
	private Label aut;
	private TextField un;
	private PasswordField pw;
	
	@Override
	public void start(Stage primary) throws Exception {
		
//----------------Konfiguracija GUI-a --------------------------------------------------------------------------------
		
		naziv = new Label("Unesi trosak");
			naziv.setFont(Font.font(null, FontWeight.BOLD, 40));
			naziv.setTextFill(Color.web("#ff2659"));
			naziv.setPadding(new Insets(20));
			naziv.setAlignment(Pos.CENTER);
			
		trosak = new Label();	
			trosak.setFont(Font.font(null, FontWeight.BOLD, 25));
			trosak.setTextFill(Color.web("#ff2659"));
			trosak.setPadding(new Insets(20));
			trosak.setAlignment(Pos.CENTER);
			
		tf1 = new TextField();
			tf1.setPrefSize(400, 50);
			tf1.setAlignment(Pos.CENTER);
			tf1.setPadding(new Insets(10));
			tf1.setFont(Font.font(null, FontWeight.BOLD, 30));
			tf1.setText("Unesite Naziv troska");
			
		tf2 = new TextField();
			tf2.setPrefSize(400, 50);
			tf2.setAlignment(Pos.CENTER);
			tf2.setPadding(new Insets(10));
			tf2.setFont(Font.font(null, FontWeight.BOLD, 30));
			tf2.setText("Unesite vrednost troska u rsd");
			
		bt1 = new Button("Potvrdi");
			bt1.setPrefSize(200, 50);
			bt1.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt1.setTextFill(Color.web("#34eb7d"));
			bt1.setAlignment(Pos.CENTER);
			bt1.setPadding(new Insets(20));
			
		bt2 = new Button("Reset");
			bt2.setPrefSize(200, 50);
			bt2.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt2.setTextFill(Color.web("#ff2659"));
			bt2.setAlignment(Pos.CENTER);
			bt2.setPadding(new Insets(20));	
			
		bt3 = new Button("Nazad");
			bt3.setPrefSize(200, 50);
			bt3.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt3.setTextFill(Color.web("#ff2659"));
			bt3.setAlignment(Pos.CENTER);
			bt3.setPadding(new Insets(20));	
			
			aut = new Label("Autentifikacija");
			aut.setAlignment(Pos.CENTER);
			aut.setFont(Font.font(null, FontWeight.BOLD, 30));
			aut.setTextFill(Color.web("#008cff"));
			aut.setAlignment(Pos.CENTER);
			aut.setPadding(new Insets(20));
			
		un = new TextField();
			un.setPrefSize(200, 50);
			un.setAlignment(Pos.CENTER);
			un.setFont(Font.font(null, FontWeight.BOLD, 20));
			un.setPadding(new Insets(10));
			un.setText("Unesite username");
			
		pw = new PasswordField();
			pw.setPrefSize(200, 50);
			pw.setAlignment(Pos.CENTER);
			pw.setFont(Font.font(null, FontWeight.BOLD, 20));
			pw.setPadding(new Insets(10));	
			pw.setText("lozinku");	
			
		HBox hbox2 = new HBox(10);
			hbox2.getChildren().addAll(un, pw);
			hbox2.setAlignment(Pos.CENTER);
			hbox2.setPadding(new Insets(10));
			
		VBox vbox = new VBox(10);
			vbox.getChildren().add(naziv);
			vbox.setAlignment(Pos.CENTER);
			
		VBox vbox2 = new VBox(10);
			vbox2.getChildren().addAll(tf1, tf2, trosak, aut, hbox2);
			vbox2.setPadding(new Insets(10));
			vbox2.setAlignment(Pos.CENTER);
			
		HBox hbox = new HBox(10);	
			hbox.getChildren().addAll(bt1, bt2, bt3);
			hbox.setPadding(new Insets(10));
			hbox.setAlignment(Pos.CENTER);
			
		BorderPane bp = new BorderPane();	
			bp.setTop(vbox);
			bp.setCenter(vbox2);
			bp.setBottom(hbox);
			bp.setPadding(new Insets(10));
			
//-------------------------------------------------------------------------------------------------	
			
			
//------------Hvatanje i obradjivanje dogadjaja----------------------------------------			
		bt1.setOnAction(e -> {
			try {
			int tacno;
			tacno = Baza.login(un.getText(), pw.getText());
			Double trosakDouble = Double.valueOf(tf2.getText());
			
			if (tacno == 1) {
			
			BazaTrosak.unosTroska(tf1.getText(),trosakDouble, un.getText());
			trosak.setText("Trosak je: " + tf2.getText());
			trosak.setTextFill(Color.web("#84ff00"));
			
			Log l = new Log();
				l.setPoruka(un.getText() + " se uspesno prijavio (Log in), UNEO JE NOVE TROSKOVE(" + naziv.getText() + ")");
				
				BazaLog.upisLog(l);
			
			} else {
				trosak.setText("Netacna lozinka ili username!");
				trosak.setTextFill(Color.web("#ff3300"));
				
				Log l = new Log();
					l.setPoruka(un.getText() + " je pogresno uneo lozinku ili je username netacan, hteo je uneti NOVE TROSKOVE");
					
					BazaLog.upisLog(l);
			}
			} catch(Exception ex) {
				trosak.setText("Niste pravilno uneli vrednosti");
			}
		});	
		
		bt2.setOnAction(e -> {
			tf1.setText("Unesite Naziv troska");
			tf2.setText("Unesite vrednost troska u rsd");
		});
		
		bt3.setOnAction(e -> {
			View1 v1 = new View1();
			
			try {
				v1.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
//----------------------------------------------------------------------------------------------------		
			
		Scene scene = new Scene(bp, 700, 700);
			primary.setTitle("Unos Troska");
			primary.setScene(scene);
			primary.show();
	}
	
}
