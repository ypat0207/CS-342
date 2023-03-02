import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class JavaFXTemplate extends Application {
	private Button b1,b2;
	private TextField t1,t2;
	private VBox root;
	private Scene scene;
	private BorderPane borderPane;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Yash Patel Homework 3");
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b1.setFont(Font.font("Arial"));
		b2.setFont(Font.font("Arial"));
		b1.setPrefSize(125,50);
		b2.setPrefSize(125,50);
		t1 = new TextField();
		t1.setPromptText("enter text here then press button 1");
		t1.setFont(Font.font("Arial"));
		t2 = new TextField();
		t2.setText("Final string goes here");
		t2.setFont(Font.font("Arial"));
		t2.setEditable(false);
		t2.setDisable(true);
		borderPane = new BorderPane();
		borderPane.setCenter(t1);
		borderPane.setRight(t2);
		t2.setTranslateY(336);
		b1.setTranslateY(250);
		b2.setTranslateY(350);
		
		root = new VBox(20,b1,b2);
		borderPane.setLeft(root);
		borderPane.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
		
		
		b1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String textFieldText = t1.getText();
				t2.setText(textFieldText + " : from the center text field!");
				b1.setDisable(true);
				b1.setText("Pressed");
				b1.setPrefSize(75, 50);
			}
		});

		b2.setOnAction(e-> {
			t1.clear(); 
			t2.clear(); 
			t2.setText("final string goes here");
			b1.setDisable(false); 
			b1.setText("Button 1");
			b1.setPrefSize(125,50);
			});
		scene = new Scene(borderPane, 700,700);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	

}
