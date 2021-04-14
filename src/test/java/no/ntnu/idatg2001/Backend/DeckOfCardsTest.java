package no.ntnu.idatg2001.Backend;

import no.ntnu.idatg2001.run.App;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {

    DeckOfCards deckOfCards = new DeckOfCards();


        @Test
    @DisplayName("Check if 52 cards are generated when creating a deck")
    void getCollectionOfAllTheCards() {
        System.out.println(deckOfCards.getCollectionOfAllTheCards().size());

        assertTrue(App.cardList.getCollectionOfAllTheCards().size() == 52);
    }



    @Test
    @DisplayName("Checks if the hand size increases by 5 when dealing a hand")
    void dealHand() {
        System.out.println(deckOfCards.getCurrentHand().size());
        deckOfCards.dealHand(5);
        System.out.println(deckOfCards.getCurrentHand().size());
        assertTrue(deckOfCards.getCurrentHand().size() == 5);
        deckOfCards.dealHand(5);

        assertTrue(deckOfCards.getCurrentHand().size() == 5);
        assertTrue(deckOfCards.getCollectionOfAllTheCards().size() == 47);

    }

    @Test
    @DisplayName("Checks if the hand size decreases by 5 when dealing a hand")
    void unDealHand() {
        System.out.println(deckOfCards.getCurrentHand().size());
        deckOfCards.dealHand(5);
        System.out.println(deckOfCards.getCurrentHand().size());
        deckOfCards.unDealHand(5);
        System.out.println(deckOfCards.getCurrentHand().size());

        assertTrue(deckOfCards.getCurrentHand().size() == 0);
        assertTrue(deckOfCards.getCollectionOfAllTheCards().size() == 52);
        }

}