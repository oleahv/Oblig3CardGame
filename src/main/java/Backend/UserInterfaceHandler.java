package Backend;
/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

import java.util.List;

public class UserInterfaceHandler extends Application {

    private class ButtonEventHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            DeckOfCards deckOfCards = new DeckOfCards();
            //Deals a hand
            deckOfCards.dealHand(5);
            System.out.println("Dealt a hand");
        }
    }

    public static void main(String[] args) {
    launch(args);
    }




    public Button createButtonForDealHandMethod(){
        Button buttonDealHand = new Button("Deal a hand");
        buttonDealHand.setOnAction(new ButtonEventHandler());
        buttonDealHand.setOnAction(e -> {
            System.out.println("Button selected");
            DeckOfCards deckOfCards = new DeckOfCards();
            deckOfCards.dealHand(5);
            System.out.println(deckOfCards.getCurrentHand());
            deckOfCards.showAllCards();
        });
        return buttonDealHand;
    }
    public Button createButtonForCheckingCards(){
        Button buttonCheckCards = new Button("Check cards");
        buttonCheckCards.setOnAction(new ButtonEventHandler());
        buttonCheckCards.setOnAction(e -> {
            System.out.println("Button Check selected");
            DeckOfCards deckOfCards = new DeckOfCards();
            System.out.println("Implement checking cards");
            deckOfCards.showAllCards();
        });
        return buttonCheckCards;
    }

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane(); // Create the root node.
        VBox topContainer = new VBox();  //Creates a container to hold all Button Objects.
        Button buttonDealHand = createButtonForDealHandMethod();
        Button buttonCheckCards = createButtonForCheckingCards();

        // Place the button in the topContainer
        topContainer.getChildren().addAll(buttonDealHand, buttonCheckCards);

        // Place the topcontainer in the top-section of the BorderPane
        root.setRight(topContainer);

        // Create the scene, adding the rootNode and setting the size
        Scene scene = new Scene(root, 1250, 750);
        // Set title of the stage (window) and add the scene
        stage.setTitle("Fortune rota volvitur");
        stage.setScene(scene);
        // Finally, make the stage (window) visible
        stage.show();
    }

    @Override
    public void stop() throws Exception{
        System.exit(0);
    }
}*/
