package Backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Will represent a hand of cards
public class HandOfCards {

    DeckOfCards deckOfCards;


    public HandOfCards(DeckOfCards deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    //TODO: remove extra code.
    // checks the 5 cards for their face value. Then add them all together




    public int theTotalSumOfAllCardsInHandStream(){
        System.out.println(deckOfCards.getCurrentHand()
                .stream().mapToInt(card -> card.getFace())
                .sum());
        return deckOfCards.getCurrentHand()
                .stream().mapToInt(card -> card.getFace())
                .sum();
    }


    public long checkForNumberOfHeartsInHand(){
        System.out.println(deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count());

        return deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count();
    }
  /*  public int checkForNumberOfHeartsInHandStream(){
        char characterHeart = 'H';
        System.out.println(deckOfCards.getCurrentHand()
                .stream().filter(card -> card.toString()== "H").mapToInt(card -> card.getSuit())
                .sum() + " -gg");
        return deckOfCards.getCurrentHand()
                .stream().filter(card -> card.getAsString().contains(characterHeart))
                .mapToInt(card -> card.getSuit())
                .sum();
    }*/



//str.chars().filter(num -> num == '$').count()
  public int checkForNumberOfHeartsInHandStream(){
      char characterHeart = 'H';

      //deckOfCards.getCurrentHand().stream().filter(number -> number.equals('H').count();

      System.out.println(deckOfCards.getCurrentHand()
              .stream().filter(card -> card.toString()== "H").mapToInt(card -> card.getSuit())
              .sum() + " -gg");
      System.out.println(Collections.frequency(deckOfCards.getCurrentHand(), characterHeart+1));
      return 0;
  }





    //TODO: fix it to check for flush
    Boolean gotFlush = false;
    public Boolean checkForFlush(){

        if (deckOfCards.getCurrentHand().size()==5){
            System.out.println("Size -> 5");
            //return true;
        }
        else {
            System.out.println("Size =/= 5");
           // return false;
        }
        return null;
    }
    public void showAllCardsInHand(){
        System.out.println(deckOfCards.getCurrentHand());
        System.out.println(deckOfCards.getCurrentHand().size());
    }


/*
    // cards in hand
    private List<PlayingCard> collectionOfCardsInHand = new ArrayList<>();

    DeckOfCards deckOfCards = new DeckOfCards();

    //String cardsThatAreInHand = deckOfCards.dealHand(5).toString();
    //TODO: May not be needed
    public static final int HAND_SIZE_LIMIT = 5;


    public HandOfCards(List<PlayingCard> collectionOfCardsInHand) {
        this.collectionOfCardsInHand = collectionOfCardsInHand;
    }

    @Override
    public String toString() {
        String cardsInHandStringFormat = "[";
        for (int index= 0; index < HAND_SIZE_LIMIT;index++) {
            if (index == (HAND_SIZE_LIMIT - 1)){
                cardsInHandStringFormat +=collectionOfCardsInHand.toString();
            }
            else{
                cardsInHandStringFormat += collectionOfCardsInHand +", ";
            }
        }
        cardsInHandStringFormat += "]";
        return cardsInHandStringFormat;
    }

    public int sumOfAllCardsInTheHand() {

      //  collectionOfCardsInHand.get(0).getAsString();
        return deckOfCards.cardsDealtToHand.size();
    }





    public HandOfCards() {


    }*/
/*
    //TODO: check for randomness.
    public void cardsInHandMethod(){
        deckOfCards.dealHand(5).get(0);
        deckOfCards.dealHand(5).get(0);
        deckOfCards.dealHand(5).get(1);
        deckOfCards.dealHand(5).get(2);
        deckOfCards.dealHand(5).get(3);

        System.out.println(deckOfCards.dealHand(5).get(4));
    }
    */


}
