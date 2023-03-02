import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
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
    private Tooltip t;
    //private MenuBar m;

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
    Menu menuOne = new Menu("Menu");
    MenuItem iOne = new MenuItem("Clear text");
    MenuItem iTwo = new MenuItem("Rules");
    t = new Tooltip();
    t.setText("Terms: \n 1. Bet card: a grid of numbers (1-80) that the player uses to choose what numbers to play \n 2. Number of spots: a player can choose to play 1 number(1 spot), 4 numbers(4 spots), 8 numbers(8 spots) or 10 numbers(10 spots) \n    One bet card plays only one of the designated number of spots. \n 3. Drawings: each unique selection of 20 random numbers, with no duplicates, by the game. Players may play a single bet card for a minimum of 1 and maximum of 4 drawings.");
    t.setShowDuration(new Duration(5000000));
    iOne.setOnAction(e->t1.clear());
    iTwo.setToolTip(t);
    
    menuOne.getItems().add(iOne);
//    Menu menuTwo = new Menu("Option 2");
//    Menu menuThree = new Menu("Option 3");
//    Menu menuFour = new Menu("Option 4");
    m.getMenus().addAll(menuOne);
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