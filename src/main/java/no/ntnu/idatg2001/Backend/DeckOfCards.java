package no.ntnu.idatg2001.Backend;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The type DeckOfCards.
 */
public class DeckOfCards {


    /** List holding all the cards in the deck */
    private List<PlayingCard> collectionOfAllTheCards = new ArrayList<>();


    /** List holding all the cards in the hand */
    private List<PlayingCard> currentHand = new ArrayList<>();


    /** fixed sized array to hold the cards suits.
     * NOTE: Spades, Hearts, Diamonds and Cloves */
    private final char[] suits = { 'S', 'H', 'D', 'C' };


    /** fixed sized array to hold the cards face value.
     * NOTE: Ace =1, Knight=11, Queen=12 and King=13 */
    private final int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};


    /**
     * Instantiates a new DeckOfCards.
     * The deck contains 52 cards where each one is unique.
     */
    public DeckOfCards() {

        for (char suit : suits) {
            for (int face : faces) {
                PlayingCard playingCard = new PlayingCard(suit, face);
                collectionOfAllTheCards.add(playingCard);
            }
        }
    }


    /**
     * Shuffle the deck of cards.
     * NOTE: pseudorandom.
     */
    public void shuffleTheDeckOfCards(){
        Collections.shuffle(collectionOfAllTheCards);
    }


    /**
     * Deals the cards to the hand
     * *
     * @param n_numberOfRandomCards the n number of random cards to be dealt to the hand.
     * NOTE: (n is given in MainViewController)
     * @return the list of cards in the players hand
     */
    public List<PlayingCard> dealHand(int n_numberOfRandomCards) {
        Random random = new Random();

        for (int index=0; index<n_numberOfRandomCards; index++) {
            PlayingCard playingCard = this.collectionOfAllTheCards
                    .remove(random.nextInt(this.collectionOfAllTheCards.size()));
            currentHand.add(playingCard);
        }
        return currentHand;
    }


    /**
     * return the cards from the hand to the deck (unDeal).
     *
     * @param n_numberOfRandomCards the n number of random cards to be returned to the deck
     * @return the list of all cards in the deck
     */
    public List<PlayingCard> unDealHand(int n_numberOfRandomCards) {
        Random random = new Random();

        for (int index=0; index<n_numberOfRandomCards; index++) {
            PlayingCard playingCard = this.getCurrentHand()
                    .remove(random.nextInt(this.getCurrentHand().size()));
            collectionOfAllTheCards.add(playingCard);
        }
        return collectionOfAllTheCards;
    }


    /**
     * Show all cards. Used for testing purposes
     */
    public void showAllCards(){
        System.out.println(collectionOfAllTheCards);
        System.out.println(collectionOfAllTheCards.size());
    }


    /**
     * Gets collection of all the cards in the deck
     *
     * @return the collection of all the cards in the deck
     */
    public List<PlayingCard> getCollectionOfAllTheCards() {
        return collectionOfAllTheCards;
    }


    /**
     * Gets current hand.
     *
     * @return the current hand
     */
    public List<PlayingCard> getCurrentHand() {
        return currentHand;
    }

}


