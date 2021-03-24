
import java.util.Random;


public class DeckOfCards {

     private PlayingCard[] collectionOfAllTheCards;
    //private final int DECK_SIZE = 52;

    private final int deckOfCardsSizeLimit = 52;



    //Spades, Hearts, Diamonds and Cloves
    private final char[] suits = { 'S', 'H', 'D', 'C' };

    //Ace =1, Knight=11, Queen=12 and King=13.
    private final int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    //constructor which initialize 52 cards
public DeckOfCards() {
    collectionOfAllTheCards = new PlayingCard[deckOfCardsSizeLimit];

    int cardIndex = 0;
    for (char suit : suits) {
        for (int face : faces) {
            collectionOfAllTheCards[cardIndex] = new PlayingCard(suit, face);
            cardIndex++;
        }
    }
    }

    public void showAllCards(){
        System.out.println(collectionOfAllTheCards.length);
    }
    /*this.cards = new Card[52];
        for (int i = 0; i < ; i++) {
        Card card = new Card(...); //Instantiate a Card
        this.cards[i] = card; //Adding card to the Deck
    }*/




    //TODO:
    //collectionOfAllTheCards (the collection which holds all 52 cards)

   // HashMap<String, String> stringHashMap = new HashMap<String, String>();

    //ArrayList<String> cardArrayList = new ArrayList<String>();

//52 cards in the list

    public void addCards(){
      //  stringHashMap.put("H1", "1 of hearts");
     //   System.out.println(stringHashMap);

     //   Arrays.asList(stringHashMap);

    }
    //Name of the arrayList is array atm.

    public void dealHand (int n){
        Random random = new Random();
        //stringHashMap.get(random.nextInt());
    }


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

