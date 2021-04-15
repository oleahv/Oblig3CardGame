package no.ntnu.idatg2001.Backend;

import java.util.ArrayList;

/**
 * The type Hand of cards.
 */
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
    public int theTotalSumOfAllCardsInHandStream(){

        return deckOfCards.getCurrentHand()
                .stream().mapToInt(card -> card.getFace())
                .sum();
    }


    /**
     * Check for number of hearts in hand.
     *
     * @return the number of hearts in hand
     */
    public long checkForNumberOfHeartsInHand(){

        return deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count();
    }


    /**
     * Method to sort the hand for cards of hearts.
     *
     * @return the array list containing the hearts in hand
     */
    public ArrayList<PlayingCard> printAllHeartsInTheHand() {
        ArrayList<PlayingCard> playingCardArrayListHearts = new ArrayList<>();
        deckOfCards.getCurrentHand().stream().filter(playingCard -> playingCard.getAsString()
                .contains("H")).forEach(playingCardArrayListHearts::add);

        return playingCardArrayListHearts;
    }


    /**
     * Check for queen of spades in hand.
     *
     * @return the number of queen of spades in hand
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
    public void showAllCardsInHand(){
        System.out.println(deckOfCards.getCurrentHand());
        System.out.println(deckOfCards.getCurrentHand().size());
    }
}
