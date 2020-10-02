//Klasa sadrzi GUI za meni

package paket1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class View1 extends Application {

	//Promenljive
	private Label imeRadnika;
	private Label naslov;
	private Button bt1;
	private Button bt2;
	private Button bt3;
	private Button bt4;
	
	@Override
	public void start(Stage primary) throws Exception {
		
		Main m = new Main(); //Main objekat
		
//--------------Konfig. i podesavanje GUI-a-------------------------------------------------------------		
		
		imeRadnika = new Label();
			imeRadnika.setFont(Font.font(null, FontWeight.BOLD, 40));
			imeRadnika.setTextFill(Color.web("#266bff"));
			imeRadnika.setAlignment(Pos.CENTER);
			imeRadnika.setPadding(new Insets(10));
			imeRadnika.setText("Dobrodosao");
		
		naslov = new Label("Meni");
			naslov.setFont(Font.font(null, FontWeight.BOLD, 32));
			naslov.setTextFill(Color.web("#34eb7d"));
			naslov.setAlignment(Pos.CENTER);
			naslov.setPadding(new Insets(10));
			
		bt1 = new Button("Unesi pazar");
			bt1.setPrefSize(400, 50);
			bt1.setAlignment(Pos.CENTER);
			bt1.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt1.setTextFill(Color.web("#34eb7d"));
			bt1.setPadding(new Insets(20));
			
		bt2 = new Button("Unesi trosak");
			bt2.setPrefSize(400, 50);
			bt2.setAlignment(Pos.CENTER);
			bt2.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt2.setTextFill(Color.web("#ff2659"));
			bt2.setPadding(new Insets(20));
			
		bt3 = new Button("Statistika");
			bt3.setPrefSize(400, 50);
			bt3.setAlignment(Pos.CENTER);
			bt3.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt3.setTextFill(Color.web("#ff2659"));	
			bt3.setPadding(new Insets(20));
			
		bt4 = new Button("Log");
			bt4.setPrefSize(400, 50);
			bt4.setAlignment(Pos.CENTER);
			bt4.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt4.setTextFill(Color.web("#ffff26"));	
			bt4.setPadding(new Insets(20));	
			
		VBox vbox = new VBox(20);	
			vbox.getChildren().addAll(imeRadnika, naslov, bt1, bt2, bt3, bt4);
			vbox.setAlignment(Pos.CENTER);
			
//--------------------------------------------------------------------------------------------	
			
//------------Hvatanje i odredjivanje dogadjaja-------------------------------			
			
		bt1.setOnAction(e -> {
			ViewUnos vu = new ViewUnos();
			
			try {
				vu.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});	
		
		bt2.setOnAction(e -> {
			ViewTrosak vt = new ViewTrosak();
			
			try {
				vt.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		bt3.setOnAction(e -> {
			ViewSta vs = new ViewSta();
			
			try {
				vs.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		bt4.setOnAction(e -> {
			Admin a = new Admin();
			
			try {
				a.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
//------------------------------------------------------------------			
		Scene scene = new Scene(vbox, 700, 700);
			primary.setTitle("Meni");
			primary.setScene(scene);
			primary.show();
		
	}

}
