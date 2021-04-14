package no.ntnu.idatg2001.run;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import no.ntnu.idatg2001.Backend.PlayingCard;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class MainViewController implements Initializable {

    @FXML
    private Button dealHandButton;

    @FXML
    private ListView listOfCards;

    @FXML
    private TextArea textHeartsInHand;

    @FXML
    private TextArea textGotFlush;

    @FXML
    private TextArea textGotQueenOfSpades;

    @FXML
    private TextArea textSumOfCardsInHand;

    /** A variable to quickly change the amount of cards dealt to the hand.
     * Useful for testing purposes
     * NOTE: Since flush requires 5 cards, the minimum number should be set to at least 5
     * WARNING: ENTERING AN INTEGER THAT IS NEGATIVE OR IS GREATER THEN 52 WILL CAUSE AN ERROR.
     * SUPPORT FOR SPECIAL DECKS IS NOT SUPPORTED IN THIS VERSION.
     * */
    private static int NUMBER_OF_CARDS_TO_BE_DEALT_TO_THE_HAND = 5;


    @FXML
    void listOfHeartsMethod () {

        if (App.handOfCards.checkForNumberOfHeartsInHand() != 0) {
            textHeartsInHand.setText("Hearts in hand: " + App.handOfCards.printAllHeartsInTheHand());
        } else {
            textHeartsInHand.setText("There are no hearts in the hand");
        }
    }

    @FXML
    void gotFlushMethod () {
        textGotFlush.setText(App.handOfCards.checkForFlushType());
    }

    @FXML
    void gotQueenOfSpadesMethod () {

        if (App.handOfCards.checkForQueenOfSpadesInHand() != 0) {
            textGotQueenOfSpades.setText("You got queen of spades in the hand");
        } else {
            textGotQueenOfSpades.setText("You don't got queen of spades");
        }
    }

    @FXML
    void sumOfCardsInHandMethod () {

       textSumOfCardsInHand.setText("Sum of cards in hand: " + App.handOfCards.theTotalSumOfAllCardsInHandStream());
    }

    @FXML
    void handleDealHandButton(MouseEvent event) throws IOException {

        if (App.cardList.getCurrentHand().size() == 0)
        {
            //Deals the hand without first returning the cards to the deck.
            App.cardList.shuffleTheDeckOfCards();
            App.cardList.dealHand(NUMBER_OF_CARDS_TO_BE_DEALT_TO_THE_HAND);
                    }
        else {
            // Deals the hand after returning the cards in hand to the deck
            // returns hand to deck, shuffle, then deal new hand.
            App.cardList.unDealHand(NUMBER_OF_CARDS_TO_BE_DEALT_TO_THE_HAND);
            App.cardList.shuffleTheDeckOfCards();
            App.cardList.dealHand(NUMBER_OF_CARDS_TO_BE_DEALT_TO_THE_HAND);
        }
        //Used to update the window after pressing the dealHandButton.
        Parent root = FXMLLoader.
                load((getClass().getClassLoader().getResource("MainView.fxml")));

        Stage window = (Stage) dealHandButton.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));

    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listOfPlayingCardsString = FXCollections.observableArrayList(new ArrayList<>());
        for (PlayingCard card : App.cardList.getCurrentHand()) {
            listOfPlayingCardsString.add(card.toString());
        }

        listOfCards.setItems(listOfPlayingCardsString);

        sumOfCardsInHandMethod();
        listOfHeartsMethod();
        gotFlushMethod();
        gotQueenOfSpadesMethod();
    }
}
