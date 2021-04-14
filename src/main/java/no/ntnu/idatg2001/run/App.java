package no.ntnu.idatg2001.run;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import no.ntnu.idatg2001.Backend.*;
// import no.ntnu.idatg1002.gruppe4.work.MainForTestingLive;

public class App extends Application {

    public static DeckOfCards cardList = new DeckOfCards();

    public static HandOfCards handOfCards = new HandOfCards(cardList);

  //  public static DeckOfCards deckOfCards = new DeckOfCards();

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




