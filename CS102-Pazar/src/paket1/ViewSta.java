package paket1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ViewSta extends Application {
	
	//Promenljive
	private Label naziv;
	private Label ukupanBrPazara;
	private Label ukupanBrTro;
	private Label ukupanPazara;
	private Label ukupanTro;
	private Label raz;
	private ListView p;
	private ListView t;
	
	private Button bt1;
	
	private double razlika;
	
	@Override
	public void start(Stage primary) throws Exception {
		
//---------------Konf. i pod. GUI-a------------------------------------------------------------------		
		
		ukupanBrPazara = new Label();
			ukupanBrPazara.setFont(Font.font(null, FontWeight.BOLD, 15));
			ukupanBrPazara.setTextFill(Color.web("#035efc"));
			ukupanBrPazara.setAlignment(Pos.CENTER);
			ukupanBrPazara.setPadding(new Insets(10));
			ukupanBrPazara.setText("Ukupan br. pazara: " + BazaSta.brojPazara());
			
		ukupanBrTro = new Label();
			ukupanBrTro.setFont(Font.font(null, FontWeight.BOLD, 15));
			ukupanBrTro.setTextFill(Color.web("#eb345e"));
			ukupanBrTro.setAlignment(Pos.CENTER);
			ukupanBrTro.setPadding(new Insets(10));
			ukupanBrTro.setText("Ukupan br. troskova: " + BazaSta.brojTroskova());
			
		ukupanPazara = new Label();
			ukupanPazara.setFont(Font.font(null, FontWeight.BOLD, 15));
			ukupanPazara.setTextFill(Color.web("#035efc"));
			ukupanPazara.setAlignment(Pos.CENTER);
			ukupanPazara.setPadding(new Insets(10));
			ukupanPazara.setText("Ukupna vrednost Pazara: " + BazaSta.ukupnoPazar());
			
		ukupanTro = new Label();
			ukupanTro.setFont(Font.font(null, FontWeight.BOLD, 15));
			ukupanTro.setTextFill(Color.web("#eb345e"));
			ukupanTro.setAlignment(Pos.CENTER);
			ukupanTro.setPadding(new Insets(10));
			ukupanTro.setText("Ukupna vrednost Troska: " + BazaSta.ukupnoTrosak());	
			
		naziv = new Label("Statistika");
			naziv.setFont(Font.font(null, FontWeight.BOLD, 40));
			naziv.setTextFill(Color.web("#035efc"));
			naziv.setAlignment(Pos.CENTER);
			naziv.setPadding(new Insets(20));
			
		raz = new Label();
			raz.setFont(Font.font(null, FontWeight.BOLD, 15));
			raz.setTextFill(Color.web("#42adf5"));
			raz.setAlignment(Pos.CENTER);
			raz.setPadding(new Insets(5));
			razlika = razlika(BazaSta.ukupnoPazar(), BazaSta.ukupnoTrosak());
			raz.setText("Razlika izmedju Pazara i Troskova: " + stanje(razlika));
				
		p = new ListView();
			p.setPrefSize(300, 500);
			p.getItems().addAll(BazaSta.prikaziPazar());
			p.setStyle("-fx-background-color: #42f54b");

		t = new ListView();
			t.setPrefSize(300, 500);
			t.getItems().addAll(BazaSta.prikaziTrosak());
			t.setStyle("-fx-background-color: #de2163");
			
		bt1 = new Button("Nazad");
			bt1.setPrefSize(200, 50);
			bt1.setAlignment(Pos.CENTER);
			bt1.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt1.setTextFill(Color.web("#ff2659"));
			bt1.setPadding(new Insets(20));
				
		VBox vbox = new VBox(20);	
			vbox.getChildren().add(naziv);
			vbox.setAlignment(Pos.CENTER);
		
		HBox hbox = new HBox(20);	
			hbox.getChildren().addAll(p, t);
			hbox.setPadding(new Insets(20));
			hbox.setAlignment(Pos.CENTER);
			
		HBox hbox2 = new HBox(10);	
			hbox2.getChildren().addAll(ukupanBrPazara, ukupanBrTro);
			hbox2.setPadding(new Insets(10));
			hbox2.setAlignment(Pos.CENTER);	
			
		HBox hbox3 = new HBox(10);	
			hbox3.getChildren().addAll(ukupanPazara, ukupanTro);
			hbox3.setPadding(new Insets(10));
			hbox3.setAlignment(Pos.CENTER);		
			
		VBox vbox2 = new VBox(10);	
			vbox2.getChildren().addAll(hbox2, hbox3, raz, bt1);
			vbox2.setAlignment(Pos.CENTER);	
			vbox2.setPadding(new Insets(20));
			
			
		BorderPane bp = new BorderPane();	
			bp.setTop(vbox);
			bp.setCenter(hbox);
			bp.setBottom(vbox2);
		
//--------------------------------------------------------------------------------------------		
			
//-----------Hvatanje i obradjivanje dogadjaja--------------------------------------------			
		bt1.setOnAction(e -> {
			View1 v1 = new View1();
			
			try {
				v1.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});	
//-----------------------------------------------------------------------------------------------			
		Scene scene = new Scene(bp, 650, 750);
			primary.setTitle("Statistika");
			primary.setScene(scene);
			primary.show();
		
	}
	
	
	//Metoda za racunanje razlike
	public static double razlika(double pazari, double trosak) {
		double razlika = 0;
		
		razlika = pazari - trosak;
		
		return razlika;
	}
	
	
	//Metoda za stanje
	public static String stanje(double razlika) {
		String stanje;
		
		if(razlika < 0) {
			stanje = razlika + " U MINUSU ste!";
		} else {
			stanje = razlika + " U PLUSU ste!";
		}
		return stanje;
	}

}
