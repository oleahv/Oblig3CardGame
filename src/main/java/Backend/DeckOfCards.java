package Backend;

import java.util.*;

public class DeckOfCards {

    private List<PlayingCard> collectionOfAllTheCards = new ArrayList<>();
    private List<PlayingCard> currentHand = new ArrayList<>();
  //  private Backend.PlayingCard[] collectionOfAllTheCards;


    //private final int DECK_SIZE = 52;

    private static final int deckOfCardsSizeLimit = 52;

    // shuffling method needed(?)
    //private static final int NUMBER_OF_SHUFFLES = 100;



    // will need this to get the next index
    //private int indexOfCardToBeDealtNext;


    //private int randomSeed;

    // Generate a random number
  //  private Random randomNumberGenerator;








    //Spades, Hearts, Diamonds and Cloves
    private final char[] suits = { 'S', 'H', 'D', 'C' };

    //Ace =1, Knight=11, Queen=12 and King=13.
    private final int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    //constructor which initialize 52 cards
    public DeckOfCards() {


        int cardIndex = 0;
     //   collectionOfAllTheCards = new ArrayList<Backend.PlayingCard>();

         int i = 0;
        for (char suit : suits) {
            for (int face : faces) {
                PlayingCard playingCard = new PlayingCard(suit, face);
                collectionOfAllTheCards.add(playingCard);
                cardIndex++;
            }
        }
    }

    //TODO: shuffle method. Make sure that it is randomised enough. Use a while loop if not, 500 times should do.
    /** use the shuffle method to randomise the cards. Then take the top 5 cards of the deck as a hand..?*/

    public void shuffleTheDeckOfCards(){
        Collections.shuffle(collectionOfAllTheCards);
    }


    // TODO: dealing method
   // List<PlayingCard> cardsDealtToHand = new ArrayList<>();
    public List<PlayingCard> dealHand(int n_numberOfRandomCards) {
        Random random = new Random();
        // list to hold playingCards dealt to the hand.

        //TODO; check what it precisely does. Removing then adding removed cards?
        for (int index=0; index<n_numberOfRandomCards; index++) {
            PlayingCard playingCard = this.collectionOfAllTheCards
                    .remove(random.nextInt(this.collectionOfAllTheCards.size()));
            currentHand.add(playingCard);
        }
        return currentHand;
    }



// use collection to find the cards that need to be changed
    /*public Backend.PlayingCard[] dealHand (int n_randomCards){

        // 52 cards with correct stuff
        System.out.println(collectionOfAllTheCards.length);

        for (Backend.PlayingCard cardThatWillBeDealt: collectionOfAllTheCards) {
            // if the card should be transferred to another list
        }
         return null;
    } */
/*
    public List<Backend.PlayingCard> dealHand(int n_randomCards) {
        n_randomCards = 5;
        Random random = new Random();
        List<Integer> listOfRandomIntegers = new ArrayList<>();
        List<Backend.PlayingCard> cardsOnHand = new ArrayList<>();
        Collections.shuffle(listOfRandomIntegers);
        //TODO: check
        if (n_randomCards > collectionOfAllTheCards.size() || n_randomCards < 0){
            n_randomCards = collectionOfAllTheCards.size();
    }
    while (listOfRandomIntegers.size() <= n_randomCards) {
        int randomStuff = random.nextInt(collectionOfAllTheCards.size());
        if (!listOfRandomIntegers.contains(randomStuff)){
            listOfRandomIntegers.add(randomStuff);
            Backend.PlayingCard firstElementInTheCollection = collectionOfAllTheCards.listIterator();
            cardsOnHand.add(collectionOfAllTheCards.get(randomStuff));
        }
    }
    return cardsOnHand;
    }*/





/*

            int rand = random.nextInt(deck.size());
            if (!randomIntegers.contains(rand)) {
                randomIntegers.add(rand);
                randomCards.add(deck.get(rand));
            }
        }
        return randomCards;
    }
 */















        //ArrayList<Integer> listOfRandomNumbers = new ArrayList<>();
/*
        Backend.PlayingCard[] playingCardsHandCollection = new Backend.PlayingCard[n_randomCards];

        Random random = new Random();
        for (int index = 0; index<collectionOfAllTheCards.length; index++) {
            int randomNumber = random.nextInt(collectionOfAllTheCards.length);
            listOfRandomNumbers.add(randomNumber);
        }
        ListIterator iteratorRemoval =  collectionOfAllTheCards.listIterator();
        for (Backend.PlayingCard playingCard: collectionOfAllTheCards) {
            Arrays.stream(collectionOfAllTheCards).sorted(listOfRandomNumbers)
            iteratorRemoval.remove(collectionOfAllTheCards.get(listOfRandomNumbers);
        }*/






   // ArrayList<Backend.PlayingCard> cardArrayList = new ArrayList<Backend.PlayingCard>();




    public void showAllCards(){
        System.out.println(collectionOfAllTheCards);
        System.out.println(collectionOfAllTheCards.size());
    }

    public List<PlayingCard> getCollectionOfAllTheCards() {
        return collectionOfAllTheCards;
    }



    public List<PlayingCard> getCurrentHand() {
        return currentHand;
    }


    /*this.cards = new Card[52];
        for (int i = 0; i < ; i++) {
        Card card = new Card(...); //Instantiate a Card
        this.cards[i] = card; //Adding card to the Deck
    }
    // int randomNumber = random.nextInt(52);
    // randomNumber+=1;
   */
    //TODO: liste med tilfeldige tall, bruk den til å adde og gjerne.





    //TODO:
    //collectionOfAllTheCards (the collection which holds all 52 cards)

    // HashMap<String, String> stringHashMap = new HashMap<String, String>();



//52 cards in the list

    public void addCards(){
        //  stringHashMap.put("H1", "1 of hearts");
        //   System.out.println(stringHashMap);

        //   Arrays.asList(stringHashMap);

    }


 /*
            int cardIndex = 0;
            for (char suit : suits) {
                for (int face : faces) {
                    collectionOfAllTheCards[cardIndex] = new Backend.PlayingCard(suit, face);
                    cardIndex++;
                }
            }
        }*/



    /*

     */



/*
    public void testingAll52Cards(){
        stringHashMap.put("H1", "1 of hearts");
        stringHashMap.put("H2", "2 of hearts");
        stringHashMap.put("H3", "3 of hearts");
        stringHashMap.put("H4", "4 of hearts");
        stringHashMap.put("H5", "5 of hearts");
        stringHashMap.put("H6", "6 of hearts");
        stringHashMap.put("H7", "7 of hearts");
        stringHashMap.put("H8", "8 of hearts");
        stringHashMap.put("H9", "9 of hearts");
        stringHashMap.put("H10", "10 of hearts");
        stringHashMap.put("H11", "11 of hearts");
        stringHashMap.put("H12", "12 of hearts");
        stringHashMap.put("H13", "13 of hearts");
        stringHashMap.put("S1", "1 of spades");
        stringHashMap.put("S2", "2 of spades");
        stringHashMap.put("S3", "3 of spades");
        stringHashMap.put("S4", "4 of spades");
        stringHashMap.put("S5", "5 of spades");
        stringHashMap.put("S6", "6 of spades");
        stringHashMap.put("S7", "7 of spades");
        stringHashMap.put("S8", "8 of spades");
        stringHashMap.put("S9", "9 of spades");
        stringHashMap.put("S10", "10 of spades");
        stringHashMap.put("S11", "11 of spades");
        stringHashMap.put("S12", "12 of spades");
        stringHashMap.put("S13", "13 of spades");
        stringHashMap.put("D1", "1 of diamonds");
        stringHashMap.put("D2", "2 of diamonds");
        stringHashMap.put("D3", "3 of diamonds");
        stringHashMap.put("D4", "4 of diamonds");
        stringHashMap.put("D5", "5 of diamonds");
        stringHashMap.put("D6", "6 of diamonds");
        stringHashMap.put("D7", "7 of diamonds");
        stringHashMap.put("D8", "8 of diamonds");
        stringHashMap.put("D9", "9 of diamonds");
        stringHashMap.put("D10", "10 of diamonds");
        stringHashMap.put("D11", "11 of diamonds");
        stringHashMap.put("D12", "12 of diamonds");
        stringHashMap.put("D13", "13 of diamonds");
        stringHashMap.put("C1", "1 of clovers");
        stringHashMap.put("C2", "2 of clovers");
        stringHashMap.put("C3", "3 of clovers");
        stringHashMap.put("C4", "4 of clovers");
        stringHashMap.put("C5", "5 of clovers");
        stringHashMap.put("C6", "6 of clovers");
        stringHashMap.put("C7", "7 of clovers");
        stringHashMap.put("C8", "8 of clovers");
        stringHashMap.put("C9", "9 of clovers");
        stringHashMap.put("C10", "10 of clovers");
        stringHashMap.put("C11", "11 of clovers");
        stringHashMap.put("C12", "12 of clovers");
        stringHashMap.put("C13", "13 of clovers");

    }*/


}


