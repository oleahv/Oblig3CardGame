package Backend;

import java.util.ArrayList;
import java.util.List;

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

/*    public int theTotalSumOfAllCardsInHand(){
        deckOfCards.getCurrentHand() theTotalSumOfAllCardsInHand

                Function<List<Node>, Function<Integer, Integer>> getSum =
                (list) ->
                        (parentId) -> list.stream()
                                .filter(x-> x.parentId.equals(parentId)) //with required parentIds
                                .mapToInt(y-> y.getValue()) //
                                .sum()

        return 0;
    }*/



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
