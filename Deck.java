import java.util.*;
public class Deck
{
    ArrayList<Card> cards = new ArrayList<Card>();  
    public void createDeck(){
        String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] suit = {"Spades","Diamonds","Clubs","Hearts"};
        for(String s:suit) {
            for(String v:values) {
                cards.add(new Card(s,v));
            }
        }
    }
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
    public void printDeck() {
        for(Card card:cards)
        {
            System.out.println(card);
        }
    }
    public void dealCard() {
        shuffleDeck();
        System.out.println("Dealing 5 cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
    }
    public void sameSuit() {
        shuffleDeck();
        System.out.println("Randomly dealing 5 cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
        Random random = new Random();
        int index1 = random.nextInt(cards.size());
        int index2 = random.nextInt(cards.size());

        Card card1 = cards.get(index1);
        Card card2 = cards.get(index2);

        System.out.println("Randomly selected Card 1: " + card1);
        System.out.println("Randomly selected Card 2: " + card2);
        System.out.println("Same suit comparison: " + sameSuit(card1, card2));
    }
    private boolean sameSuit(Card card1, Card card2) {
        return card1.getSuit().equals(card2.getSuit());
    }
    public void compareCard() {
        shuffleDeck();
        System.out.println("Randomly dealing 5 cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
        Random random = new Random();
        int index1 = random.nextInt(cards.size());
        int index2 = random.nextInt(cards.size());

        Card card1 = cards.get(index1);
        Card card2 = cards.get(index2);

        System.out.println("Randomly selected Card 1: " + card1);
        System.out.println("Randomly selected Card 2: " + card2);
        System.out.println("Same value comparison: " + compareCard(card1, card2));
    }
    public boolean compareCard(Card card1, Card card2) {
        return card1.getValue().equals(card2.getValue());
    }
    public int findCard(String suit, String value) {
    for (int i = 0; i < cards.size(); i++) {
        Card card = cards.get(i);
        
        if (card.getSuit().equals(suit) && card.getValue().equals(value)) {
            return i;
        }
    }
    return -1; // Card not found
    }

    // findCard() : enter suit & value to find index of the card
    // identifyCard() : select random card and tell if it's a face or number card
}
