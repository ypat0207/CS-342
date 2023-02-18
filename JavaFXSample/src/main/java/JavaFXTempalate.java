import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.event.ActionEvent;

public class JavaFXTempalate extends Application 
{ 
    private Button b1,b2,b3;
    private TextField t1;
    private Label l1;
    private VBox root;
    private Scene scene;

  @Override
  public void start(Stage primaryStage) {
    b1 = new Button("Button 1");
    b2 = new Button("Button 2");
    l1 = new Label("Label");
    b1.setPrefSize(200,50);
    b2.setPrefSize(200,50);
    b1.setTranslateX(250);	
    b1.setTranslateY(10);
    b2.setTranslateX(250);
    b2.setTranslateY(100);
    l1.setTranslateX(332);
    l1.setTranslateY(100);
    
    t1 = new TextField();
    MenuBar m = new MenuBar();
    Menu menuOne = new Menu("Option 1");
    MenuItem iOne = new MenuItem("Clear text");
    iOne.setOnAction(e->t1.clear());
    menuOne.getItems().add(iOne);
    Menu menuTwo = new Menu("Option 2");
    Menu menuThree = new Menu("Option 3");
    Menu menuFour = new Menu("Option 4");
    m.getMenus().addAll(menuOne,menuTwo,menuThree,menuFour);
    root = new VBox(m,b1,b2,t1,l1);
 
    scene = new Scene(root,700,700);
    scene.getStylesheets().add("style.css");
    primaryStage.setScene(scene);
    primaryStage.setResizable(true);
    primaryStage.show();
  
    
    
    b1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        		t1.setText("Yo yo");
        	
        }
    });
    b2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        	t1.setStyle("-fx-text-fill: red; -fx-background-color: yellow");

        	t1.setText("Welcome");
        	
        }
    });
  b2.setOnAction(e->t1.setText("Using Lambda expression"));
  	
   
    
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 
