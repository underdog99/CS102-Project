//Klasa sluzi za GUI kod unosa pazara

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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ViewUnos extends Application {
	
	//Promenljive
	private Label naziv;
	private Label naziv2;
	
	private Label ukupno;
	
	private Label l10;
	private Label l20;
	private Label l50;
	private Label l100;
	private Label l200;
	private Label l500;
	private Label l1000;
	private Label l2000;
	private Label l5000;
	private TextField d1;
	private TextField d2;
	
	private Button bt1;
	private Button bt2;
	private Button bt3;
	
	private TextField t10;
	private TextField t20;
	private TextField t50;
	private TextField t100;
	private TextField t200;
	private TextField t500;
	private TextField t1000;
	private TextField t2000;
	private TextField t5000;
	
	private Label aut;
	private TextField un;
	private PasswordField pw;

	
	@Override
	public void start(Stage primary) throws Exception {
		
//----------------Konf. i pod. GUI-a-----------------------------------------		
		
		bt1 = new Button("Potvrdi");
			bt1.setPrefSize(200, 50);
			bt1.setFont(Font.font(null, FontWeight.BOLD, 35));
			bt1.setTextFill(Color.web("#26ff59"));
			bt1.setPadding(new Insets(10));
			bt1.setAlignment(Pos.CENTER);
			
		bt2 = new Button("Reset");
			bt2.setPrefSize(200, 50);
			bt2.setFont(Font.font(null, FontWeight.BOLD, 35));
			bt2.setTextFill(Color.web("#ff2659"));
			bt2.setPadding(new Insets(10));
			bt2.setAlignment(Pos.CENTER);	
			
		bt3 = new Button("Nazad");
			bt3.setPrefSize(200, 50);
			bt3.setFont(Font.font(null, FontWeight.BOLD, 35));
			bt3.setTextFill(Color.web("#ff2659"));
			bt3.setPadding(new Insets(10));
			bt3.setAlignment(Pos.CENTER);	
		
		naziv = new Label("Unesi Pazar");
			naziv.setFont(Font.font(null, FontWeight.BOLD, 45));
			naziv.setTextFill(Color.web("#26ff84"));
			naziv.setAlignment(Pos.CENTER);
			naziv.setPadding(new Insets(5));
			
		naziv2 = new Label("Novcanica(rsd) X Kolicina");
			naziv2.setFont(Font.font(null, FontWeight.BOLD, 40));
			naziv2.setTextFill(Color.web("#2659ff"));
			naziv2.setAlignment(Pos.CENTER);
			naziv2.setPadding(new Insets(5));	
			
		ukupno = new Label("");
			ukupno.setFont(Font.font(null, FontWeight.BOLD, 20));
			ukupno.setAlignment(Pos.CENTER);
			ukupno.setTextFill(Color.web("#38ff26"));
			ukupno.setPadding(new Insets(5));
			
		l10 = new Label("10");
			l10.setFont(Font.font(null, FontWeight.BOLD, 30));
			l10.setTextFill(Color.web("#26ff84"));
			l10.setAlignment(Pos.CENTER);
			l10.setPadding(new Insets(5));
			
		l20 = new Label("20");
			l20.setFont(Font.font(null, FontWeight.BOLD, 30));
			l20.setTextFill(Color.web("#26ff84"));
			l20.setAlignment(Pos.CENTER);
			l20.setPadding(new Insets(5));	
			
		l50 = new Label("50");
			l50.setFont(Font.font(null, FontWeight.BOLD, 30));
			l50.setTextFill(Color.web("#26ff84"));
			l50.setAlignment(Pos.CENTER);
			l50.setPadding(new Insets(5));
			
		l100 = new Label("100");
			l100.setFont(Font.font(null, FontWeight.BOLD, 30));
			l100.setTextFill(Color.web("#26ff84"));
			l100.setAlignment(Pos.CENTER);
			l100.setPadding(new Insets(5));
			
		l200 = new Label("200");	
			l200.setFont(Font.font(null, FontWeight.BOLD, 30));
			l200.setTextFill(Color.web("#26ff84"));
			l200.setAlignment(Pos.CENTER);
			l200.setPadding(new Insets(5));	
			
		l500 = new Label("500");	
			l500.setFont(Font.font(null, FontWeight.BOLD, 30));
			l500.setTextFill(Color.web("#26ff84"));
			l500.setAlignment(Pos.CENTER);
			l500.setPadding(new Insets(5));	
			
		l1000 = new Label("1000");	
			l1000.setFont(Font.font(null, FontWeight.BOLD, 30));
			l1000.setTextFill(Color.web("#26ff84"));
			l1000.setAlignment(Pos.CENTER);
			l1000.setPadding(new Insets(5));
			
		l2000 = new Label("2000");	
			l2000.setFont(Font.font(null, FontWeight.BOLD, 30));
			l2000.setTextFill(Color.web("#26ff84"));
			l2000.setAlignment(Pos.CENTER);
			l2000.setPadding(new Insets(5));
			
		l5000 = new Label("5000");	
			l5000.setFont(Font.font(null, FontWeight.BOLD, 30));
			l5000.setTextFill(Color.web("#26ff84"));
			l5000.setAlignment(Pos.CENTER);
			l5000.setPadding(new Insets(5));	
			
		d1 = new TextField();
			d1.setPrefSize(200, 50);
			d1.setAlignment(Pos.CENTER);
			d1.setFont(Font.font(null, FontWeight.BOLD, 20));
			d1.setPadding(new Insets(5));
			d1.setText("Unesi novcanicu");
			
		d2 = new TextField();
			d2.setPrefSize(200, 50);
			d2.setAlignment(Pos.CENTER);
			d2.setFont(Font.font(null, FontWeight.BOLD, 20));
			d2.setPadding(new Insets(5));
			d2.setText("Unesi kolicinu");	
			
		t10 = new TextField();
			t10.setPrefSize(200, 50);
			t10.setAlignment(Pos.CENTER);
			t10.setPadding(new Insets(5));
			t10.setFont(Font.font(null, FontWeight.BOLD, 30));
			
		t20 = new TextField();
			t20.setPrefSize(200, 50);
			t20.setAlignment(Pos.CENTER);
			t20.setPadding(new Insets(5));
			t20.setFont(Font.font(null, FontWeight.BOLD, 30));
			
		t50 = new TextField();
			t50.setPrefSize(200, 50);
			t50.setAlignment(Pos.CENTER);
			t50.setPadding(new Insets(5));
			t50.setFont(Font.font(null, FontWeight.BOLD, 30));
			
		t100 = new TextField();
			t100.setPrefSize(200, 50);
			t100.setAlignment(Pos.CENTER);
			t100.setPadding(new Insets(5));
			t100.setFont(Font.font(null, FontWeight.BOLD, 30));
			
		t200 = new TextField();
			t200.setPrefSize(200, 50);
			t200.setAlignment(Pos.CENTER);
			t200.setPadding(new Insets(5));
			t200.setFont(Font.font(null, FontWeight.BOLD, 30));	
			
			
		t500 = new TextField();
			t500.setPrefSize(200, 50);
			t500.setAlignment(Pos.CENTER);
			t500.setPadding(new Insets(5));
			t500.setFont(Font.font(null, FontWeight.BOLD, 30));
			
		t1000 = new TextField();
			t1000.setPrefSize(200, 50);
			t1000.setAlignment(Pos.CENTER);
			t1000.setPadding(new Insets(5));
			t1000.setFont(Font.font(null, FontWeight.BOLD, 30));	
			
		t2000 = new TextField();
			t2000.setPrefSize(200, 50);
			t2000.setAlignment(Pos.CENTER);
			t2000.setPadding(new Insets(5));
			t2000.setFont(Font.font(null, FontWeight.BOLD, 30));
			
		t5000 = new TextField();
			t5000.setPrefSize(200, 50);
			t5000.setAlignment(Pos.CENTER);
			t5000.setPadding(new Insets(5));
			t5000.setFont(Font.font(null, FontWeight.BOLD, 30));
			
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
			
		GridPane gp = new GridPane();
			gp.add(l10, 0, 0);
			gp.add(l20, 0, 1);
			gp.add(l50, 0, 2);
			gp.add(l100, 0, 3);
			gp.add(l200, 0, 4);
			gp.add(l500, 0, 5);
			gp.add(l1000, 0, 6);
			gp.add(l2000, 0, 7);
			gp.add(l5000, 0, 8);
			gp.add(d1, 0, 9);
			gp.add(aut, 0, 10);
			gp.add(un, 0, 11);
			
			gp.add(t10, 1, 0);
			gp.add(t20, 1, 1);
			gp.add(t50, 1, 2);
			gp.add(t100, 1, 3);
			gp.add(t200, 1, 4);
			gp.add(t500, 1, 5);
			gp.add(t1000, 1, 6);
			gp.add(t2000, 1, 7);
			gp.add(t5000, 1, 8);
			gp.add(d2, 1, 9);
			gp.add(ukupno, 1, 10);
			gp.add(pw, 1, 11);
			
			gp.setAlignment(Pos.CENTER);
			
		VBox vbox = new VBox(10);
			vbox.getChildren().addAll(naziv, naziv2);
			vbox.setPadding(new Insets(10));
			vbox.setAlignment(Pos.CENTER);

		HBox hbox = new HBox(10);	
			hbox.getChildren().addAll(bt1, bt2, bt3);
			hbox.setPadding(new Insets(10));
			hbox.setAlignment(Pos.CENTER);
			
		BorderPane bp = new BorderPane();	
			bp.setTop(vbox);
			bp.setCenter(gp);
			bp.setBottom(hbox);
			bp.setPadding(new Insets(10));

//------------------------------------------------------------------------------------------	
			
//--------Hvatanje i obradjivanje dogadjaja			
			
		bt1.setOnAction(e -> {
			
			try {
			Integer d10 = Integer.valueOf(t10.getText());
			Integer d20 = Integer.valueOf(t20.getText());
			Integer d50 = Integer.valueOf(t50.getText());
			Integer d100 = Integer.valueOf(t100.getText());
			Integer d200 = Integer.valueOf(t200.getText());
			Integer d500 = Integer.valueOf(t500.getText());
			Integer d1000 = Integer.valueOf(t100.getText());
			Integer d2000 = Integer.valueOf(t2000.getText());
			Integer d5000 = Integer.valueOf(t5000.getText());
			Integer D1 = Integer.valueOf(d1.getText());
			Integer D2 = Integer.valueOf(d2.getText());
			
			
			
			int tacno;
			
			tacno = Baza.login(un.getText(), pw.getText());
			
			if (tacno == 1) {
				
				
				Racunanje r = new Racunanje();
				Double pazar = r.pazarUkupno(d10, d20, d50, d100, d200, d500, d1000, d2000, d5000, D1, D2);
				
				ukupno.setText("Ukupno: " + pazar.toString());
				ukupno.setTextFill(Color.web("#84ff00"));
				
				Baza.unosPazara(pazar, un.getText());
				
				Baza.unosSpec(r.pazarSpec(d10, d20, d50, d100, d200, d500, d1000, d2000, d5000, D1, D2), un.getText());
				
				Log l = new Log();
					l.setPoruka(un.getText() + " se uspesno prijavio(log in) i UNEO NOVI PAZAR");
				BazaLog.upisLog(l);
				}
		
				
			 else {
				ukupno.setText("Pogresna lozinka ili username!");
				ukupno.setTextFill(Color.web("#ff3300"));
				
				Log l = new Log();
					l.setPoruka(un.getText() + " je pogresno uneo lozinku ili je username netacan, pokusao je upisati novi pazar");
					
					BazaLog.upisLog(l);
			} 
			} catch(Exception ex) {
				ukupno.setText("Niste uneli tacne vrednosti!");
				ukupno.setTextFill(Color.web("#ff3300"));
			}
			
		});	
			
		bt2.setOnAction(e -> {
			t10.setText("");
			t20.setText("");
			t50.setText("");
			t100.setText("");
			t200.setText("");
			t500.setText("");
			t1000.setText("");
			t2000.setText("");
			t5000.setText("");
			d1.setText("Unesi novcanicu");
			d2.setText("Unesi kolicinu");
		});
		
		bt3.setOnAction(e -> {
			View1 v1 = new View1();
			
			try {
				v1.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
//-------------------------------------------------------------		
		
		Scene scene = new Scene(bp, 1000, 1000);
			primary.setTitle("Unesi Pazar");
			primary.setScene(scene);
			primary.show();
			
	}

}
