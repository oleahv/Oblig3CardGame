package no.ntnu.idatg2001.run;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import no.ntnu.idatg2001.Backend.DeckOfCards;
import no.ntnu.idatg2001.Backend.HandOfCards;
import no.ntnu.idatg2001.Backend.PlayingCard;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private Button dealHandButton;

    @FXML
    private ListView listOfCards;


    @FXML
    void handleDealHandButton(MouseEvent event) throws IOException {

        if (App.cardList.getCurrentHand().size() == 0)
        {
            System.out.println("First hand dealt");
            App.cardList.shuffleTheDeckOfCards();
            App.cardList.dealHand(5);
        }
        else {
            System.out.println("Following hands");
// returns hand to deck, shuffle, then deal new hand.
            App.cardList.unDealHand(5);
            App.cardList.shuffleTheDeckOfCards();
            System.out.println(App.cardList.getCollectionOfAllTheCards().size());
            App.cardList.dealHand(5);


        }


        Parent root = FXMLLoader.
                load((getClass().getClassLoader().getResource("MainView.fxml")));

        Stage window = (Stage) dealHandButton.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));
    }

/*

    @FXML
    public void handleDealHandButton(Mouseclick event) throws IOException {
        Parent root = FXMLLoader.
                load((getClass().getClassLoader().getResource("MainView.fxml")));

        Stage window = (Stage) dealHandButton.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        ObservableList<String> listOfPlayingCardsString = FXCollections.observableArrayList(new ArrayList<>());
        for (PlayingCard card : App.cardList.getCurrentHand()) {
            listOfPlayingCardsString.add(card.toString());
        }
        listOfCards.setItems(listOfPlayingCardsString);
        System.out.println(listOfPlayingCardsString.size());
    }
}
