package Backend;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;


public class GameMain extends Application{


    @Override
    public void start(Stage primaryStage){
        BorderPane rootNode = new BorderPane();
        GridPane centerPane = new GridPane();

        centerPane.add(new Button("Button A"), 13, 13);
        centerPane.add(new Button("Button A"), 12, 12);

        rootNode.setBottom(new Button("Button TestBot"));
        // NOTE! Can change where centerPane shows from here.
        rootNode.setTop(centerPane);





        Scene scene = new Scene(rootNode, 1250, 750);





        // what should it show
      //  Scene scene2 = new Scene(centerPane, 300, 250);




        primaryStage.setTitle("BorderPane Test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    @Override
    public void stop()
    {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
