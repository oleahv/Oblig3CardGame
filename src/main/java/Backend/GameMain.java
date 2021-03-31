package Backend;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;


public class GameMain extends Application{


    @Override
    public void start(Stage Stage) throws Exception {

        BorderPane rootNode = new BorderPane();

        GridPane centerPane = new GridPane();

        centerPane.add(new Button("Button A"), 1, 1);

        rootNode.setTop(new Button("Button TestTop"));

        Scene scene = new Scene(rootNode, 300, 300);


        Stage.setTitle("BorderPane Test");
        Stage.setScene(scene);
        Stage.show();

    }
}
