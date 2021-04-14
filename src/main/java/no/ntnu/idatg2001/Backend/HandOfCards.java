package no.ntnu.idatg2001.Backend;

import java.util.*;
import java.util.stream.Collectors;
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

    public ArrayList<PlayingCard> printAllHeartsInTheHand() {
        ArrayList<PlayingCard> playingCardArrayListHearts = new ArrayList<>();
        deckOfCards.getCurrentHand().stream().filter(playingCard -> playingCard.getAsString()
                .contains("H")).forEach(playingCardArrayListHearts::add);

        return playingCardArrayListHearts;
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

    //TODO: check if it can be removed
  public int checkForNumberOfHeartsInHandStream(){
      char characterHeart = 'H';

      //deckOfCards.getCurrentHand().stream().filter(number -> number.equals('H').count();

      System.out.println(deckOfCards.getCurrentHand()
              .stream().filter(card -> card.toString()== "H").mapToInt(card -> card.getSuit())
              .sum() + " -gg");
      System.out.println(Collections.frequency(deckOfCards.getCurrentHand(), characterHeart+1));
      return 0;
  }

    //testing purposes
    public void showAllCardsInHand(){
        System.out.println(deckOfCards.getCurrentHand());
        System.out.println(deckOfCards.getCurrentHand().size());
    }




}
