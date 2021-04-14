package no.ntnu.idatg2001.Backend;

import java.util.ArrayList;

/**
 * The type Hand of cards.
 */
// Will represent a hand of cards
public class HandOfCards {


    /**
     * The Deck of cards.
     */
    DeckOfCards deckOfCards;


    /**
     * Instantiates a new Hand of cards.
     *
     * @param deckOfCards the deck of cards
     */
    public HandOfCards(DeckOfCards deckOfCards) {
        this.deckOfCards = deckOfCards;
    }


    /**
     * The total sum of all cards in hand stream int.
     *
     * @return the int
     */
//The sum of all the cards in the hand
    public int theTotalSumOfAllCardsInHandStream(){

        return deckOfCards.getCurrentHand()
                .stream().mapToInt(card -> card.getFace())
                .sum();
    }


    /**
     * Check for number of hearts in hand long.
     *
     * @return the long
     */
//Used for checking if there is any hearts in the hand. Might be redundant.
    public long checkForNumberOfHeartsInHand(){
        System.out.println(deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count());

        return deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count();
    }


    /**
     * Print all hearts in the hand array list.
     *
     * @return the array list
     */
    public ArrayList<PlayingCard> printAllHeartsInTheHand() {
        ArrayList<PlayingCard> playingCardArrayListHearts = new ArrayList<>();
        deckOfCards.getCurrentHand().stream().filter(playingCard -> playingCard.getAsString()
                .contains("H")).forEach(playingCardArrayListHearts::add);

        return playingCardArrayListHearts;
    }


    /**
     * Check for queen of spades in hand long.
     *
     * @return the long
     */
    public long checkForQueenOfSpadesInHand(){

            return deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("S12")).count();
    }


    /**
     * Check for if the hand got a flush, and if it does, return what kind.
     * NOTE: This method only return ONE flush, even if you increase the hand size.
     *
     * @return the type of flush the player got in a string format. If there is no flush, then returns 'No flush'
     */
    public String checkForFlushType(){

        if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("S")).count() == 5){
                 return "Flush of spades";
        }
        else if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count() == 5){
            return "Flush of hearts";
        }
        else if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("D")).count() == 5){
            return "Flush of diamonds";
        }
        else if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("C")).count() == 5){
            return "Flush of cloves";
        }
        else {
            return "No flush";
        }
    }


    /**
     * Show all cards in hand. Used for testing purposes
     */
//testing purposes
    public void showAllCardsInHand(){
        System.out.println(deckOfCards.getCurrentHand());
        System.out.println(deckOfCards.getCurrentHand().size());
    }
}
