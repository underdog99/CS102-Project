//--------Klasa omogucava GUI za admina(login) za LOG

package paket1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Admin extends Application {

	//Promenljive
	private Label naziv;
	private Label tacnoPass;
	private TextField un;
	private PasswordField pw;
	private Button bt1;
	private Button bt2;
	
	@Override
	public void start(Stage primary) throws Exception {
		
//---------------Konf. i podesavanje GUI-a----------------------------------------------		
		
		naziv = new Label("Admin Log In");
			naziv.setAlignment(Pos.CENTER);
			naziv.setFont(Font.font(null, FontWeight.BOLD, 40));
			naziv.setTextFill(Color.web("#faed00"));
			naziv.setPadding(new Insets(20));
			
		tacnoPass = new Label();
			tacnoPass.setAlignment(Pos.CENTER);
			tacnoPass.setFont(Font.font(null, FontWeight.BOLD, 20));
			tacnoPass.setTextFill(Color.web("#ff2659"));
			tacnoPass.setPadding(new Insets(20));	
			
		un = new TextField();
			un.setPrefSize(300, 50);
			un.setAlignment(Pos.CENTER);
			un.setFont(Font.font(null, FontWeight.BOLD, 30));
			un.setText("Unesite username");
			un.setPadding(new Insets(20));
			
		pw = new PasswordField();
			pw.setPrefSize(300, 50);
			pw.setAlignment(Pos.CENTER);
			pw.setFont(Font.font(null, FontWeight.BOLD, 30));
			pw.setText("Lozinka");
			pw.setPadding(new Insets(20));
		
		bt1 = new Button("Potvrdi");
			bt1.setPrefSize(200, 50);
			bt1.setAlignment(Pos.CENTER);
			bt1.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt1.setTextFill(Color.web("#34eb7d"));
			
		bt2 = new Button("Nazad");
			bt2.setPrefSize(200, 50);
			bt2.setAlignment(Pos.CENTER);
			bt2.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt2.setTextFill(Color.web("#ff2659"));
			
		HBox hb = new HBox(20);	
			hb.getChildren().addAll(bt1, bt2);
			hb.setAlignment(Pos.CENTER);
			hb.setPadding(new Insets(20));
			
		VBox vb = new VBox(20);
			vb.getChildren().addAll(naziv, un, pw, tacnoPass, hb);
			vb.setAlignment(Pos.CENTER);
			vb.setPadding(new Insets(20));
			
//-----------------------------------------------------------------------------------	
			
			
//--------Hvatanje i obradjivanje dogadjaja----------------------------------------------			
		bt1.setOnAction(e -> {
			int tacno = 0;
			tacno = Baza.loginAdmin(un.getText(), pw.getText());
			
			if (tacno == 1) {
				ViewLog vl = new ViewLog();
				Log l = new Log();
				l.setPoruka(un.getText() + " se uspesno prijavio(Log In)");
				BazaLog.upisLog(l);
				try {
					vl.start(primary);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} else {
				tacnoPass.setText("Netacna lozinka ili username");
				tacnoPass.setTextFill(Color.web("#ff2659"));
				Log l = new Log();
				l.setPoruka(un.getText() + " je pogresno uneo lozinku ili username nije tacan");
				BazaLog.upisLog(l);
			}
		});	
			
		bt2.setOnAction(e -> {
			View1 v1 = new View1();
			
			try {
				v1.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});	
		
//--------------------------------------------------------------
		
		Scene scene = new Scene(vb, 500, 500);	
			primary.setTitle("Admin Log In");
			primary.setScene(scene);
			primary.show();
			
	}

}
