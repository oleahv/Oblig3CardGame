package no.ntnu.idatg2001.run;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.ntnu.idatg2001.Backend.*;


/**
 * The type App.
 */
public class App extends Application {

    /**
     * List to hold all the cards in the deck
     */
    public static DeckOfCards cardList = new DeckOfCards();

    /**
     * List to hold all the cards in the hand
     */
    public static HandOfCards handOfCards = new HandOfCards(cardList);


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.
                load((getClass().getClassLoader().getResource("MainView.fxml")));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}




