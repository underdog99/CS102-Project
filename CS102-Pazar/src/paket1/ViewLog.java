//Klasa za GUI Log-a

package paket1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ViewLog extends Application{

	//Promenljiva
	private Label naziv;
	private ListView logList;
	private Button bt;
	
	@Override
	public void start(Stage primary) throws Exception {
		
//------------Konf. i podesavanje GUI-a-----------------------------------------		
		
		naziv = new Label("LOG");
			naziv.setAlignment(Pos.CENTER);
			naziv.setFont(Font.font(null, FontWeight.BOLD, 40));
			naziv.setTextFill(Color.web("#faed00"));
			naziv.setPadding(new Insets(20));
			
		logList = new ListView();
			logList.setPrefSize(400, 500);
			logList.getItems().addAll(BazaLog.prikazLog());
			logList.setStyle("-fx-background-color: #faed00");
			
		bt = new Button("Nazad");
			bt.setPrefSize(200, 50);
			bt.setAlignment(Pos.CENTER);
			bt.setFont(Font.font(null, FontWeight.BOLD, 30));
			bt.setTextFill(Color.web("#ff2659"));
			bt.setPadding(new Insets(20));
			
		VBox vbox = new VBox(20);	
			vbox.getChildren().addAll(naziv, logList, bt);
			vbox.setAlignment(Pos.CENTER);
			vbox.setPadding(new Insets(20));
		
//------------------------------------------------------------------------
			
//-------------Hvatanje i Obradjivanje dogadjaja------------------------------			
			
		bt.setOnAction(e -> {
			View1 v1 = new View1();
			
			try {
				v1.start(primary);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});	
//------------------------------------------------------------------------------			
		Scene scene = new Scene(vbox, 500, 600);	
			primary.setTitle("Log");
			primary.setScene(scene);
			primary.show();
		
	}

}
