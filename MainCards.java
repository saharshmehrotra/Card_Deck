/*
Saharsh Mehrotra
22070126093
AIML B1
*/
public class MainCards
{
    public static void main(String args[])
    {
        Deck deck = new Deck();
        deck.createDeck();
        deck.printDeck();
        deck.shuffleDeck();
        deck.printDeck();
        deck.dealCard();
        deck.sameSuit();
        deck.compareCard();
        deck.findCard("Hearts","Queen");
    }
}
