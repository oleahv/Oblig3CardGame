package no.ntnu.idatg2001.Backend;

import java.util.*;
import java.util.stream.Stream;

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

        //TODO: make this return the hearts cards
    public long checkForNumberOfHeartsInHand(){
        System.out.println(deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count());
       /* System.out.println(deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")));*/


        return deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count();
    }



    public Stream<PlayingCard> printAllHeartsInTheHand(){
        if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count()>0){
            System.out.println("there are hearts in the hand");
            deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                    .contains("H")).forEach(card -> System.out.println(card));
            return deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                    .contains("H"));

        }
        else
        {
            System.out.println("there are no hearts in the hand");
            return null;
        }
    }



    public long checkForQueenOfSpadesInHand(){
        System.out.println(deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("S12")).count());

        return deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("S12")).count();
    }


    public boolean checkForFlush(){

        if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("S")).count() == 5){
            System.out.println("flush of spades");
            return true;
        }

        if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("H")).count() == 5){
            System.out.println("flush of hearts");
            return true;
        }

        if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("D")).count() == 5){
            System.out.println("flush of diamonds");
            return true;
        }

        if (deckOfCards.getCurrentHand().stream().filter(card -> card.getAsString()
                .contains("C")).count() == 5){
            System.out.println("flush of cloves");
            return true;
        }

        else {
            System.out.println("no flush");
            return false;
        }
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
