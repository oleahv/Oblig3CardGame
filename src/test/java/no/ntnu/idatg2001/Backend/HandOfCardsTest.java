package no.ntnu.idatg2001.Backend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandOfCardsTest {

    DeckOfCards deckOfCards = new DeckOfCards();
    HandOfCards handOfCards = new HandOfCards(deckOfCards);

    /**Note that this cards is not in the deck to not create complication with other tests.*/
    @BeforeEach
    @DisplayName("Create a hand with predictable cards")
    void populateTheHandWithCards() {


        //WARNING: Do not use deckOfCards.getCollectionOfAllTheCards() for anything duo to the cards
        // not having been removed from the list.

        PlayingCard playingCardH1 = new PlayingCard('H',1);
        PlayingCard playingCardS4 = new PlayingCard('S',4);
        PlayingCard playingCardS3 = new PlayingCard('S',3);
        PlayingCard playingCardH10 = new PlayingCard('H',10);
        PlayingCard playingCardC13 = new PlayingCard('S',12);
        deckOfCards.getCurrentHand().add(playingCardH1);
        deckOfCards.getCurrentHand().add(playingCardS4);
        deckOfCards.getCurrentHand().add(playingCardS3);
        deckOfCards.getCurrentHand().add(playingCardH10);
        deckOfCards.getCurrentHand().add(playingCardC13);

    }

    @Test
    @DisplayName("checks the total sum of the hand")
    void theTotalSumOfAllCardsInHandStream() {
        handOfCards.showAllCardsInHand();
        int a = 1;
        int b = 4;
        int c = 3;
        int d = 10;
        int e = 13;
        int sumInt = a +b + c + d+ e;
        System.out.println("Sum expected " + sumInt);

        assertEquals(31, handOfCards.theTotalSumOfAllCardsInHandStream());
    }

    @Test
    @DisplayName("Checks the hand for the number of hearts in the hand")
    void checkForNumberOfHeartsInHand() {
        handOfCards.showAllCardsInHand();

        assertEquals(2,handOfCards.checkForNumberOfHeartsInHand());
    }



    @Test
    @DisplayName("Checks if the hand got a queen of spades")
    void checkForQueenOfSpadesInHandPositive() {
        handOfCards.showAllCardsInHand();

        assertEquals(1, handOfCards.checkForQueenOfSpadesInHand());
    }


    @Test
    @DisplayName("Checks if the hand got a flush (hearts in this case)")
    void checkForFlushType() {
        deckOfCards.getCurrentHand().clear();
        PlayingCard playingCardH1 = new PlayingCard('H',1);
        PlayingCard playingCardH4 = new PlayingCard('H',4);
        PlayingCard playingCardH3 = new PlayingCard('H',3);
        PlayingCard playingCardH10 = new PlayingCard('H',10);
        PlayingCard playingCardH13 = new PlayingCard('H',12);
        deckOfCards.getCurrentHand().add(playingCardH1);
        deckOfCards.getCurrentHand().add(playingCardH4);
        deckOfCards.getCurrentHand().add(playingCardH3);
        deckOfCards.getCurrentHand().add(playingCardH10);
        deckOfCards.getCurrentHand().add(playingCardH13);

        assertEquals("Flush of hearts", handOfCards.checkForFlushType());
    }

}