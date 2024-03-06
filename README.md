# Card_Deck

# MainCards README

## Overview

The `MainCards` Java program is a simple demonstration of a deck of cards manipulation. It utilizes the `Deck` class to perform various card-related operations such as creating a deck, shuffling it, dealing a card, checking for cards of the same suit, comparing cards, and finding a specific card within the deck.

### Running the Program

1. Clone the repository or download the `MainCards.java` and `Deck.java` files.
2. Open a terminal or command prompt in the directory containing the files.
3. Compile the Java files:

   ```bash
   javac MainCards.java
   ```

4. Run the program:

   ```bash
   java MainCards
   ```

## Program Execution

1. **Deck Creation:**
   - A deck of cards is created using the `Deck` class.
   - The `createDeck` method is called to initialize the deck with all standard 52 playing cards.

2. **Print Deck:**
   - The `printDeck` method is called to display the initial state of the deck.
   - The deck is printed in the order in which the cards were initially created.

3. **Shuffle Deck:**
   - The `shuffleDeck` method is called to shuffle the deck, randomizing the order of cards.

4. **Print Shuffled Deck:**
   - The `printDeck` method is called again to display the shuffled deck.

5. **Deal Card:**
   - The `dealCard` method is called to simulate dealing a card from the top of the deck.
   - Information about the dealt card is printed.

6. **Same Suit:**
   - The `sameSuit` method is called to check and print if there are any cards of the same suit in the deck.

7. **Compare Cards:**
   - The `compareCard` method is called to compare two randomly selected cards and print the result.

8. **Find Card:**
   - The `findCard` method is called to search for and print information about a specific card in the deck (e.g., "Hearts" and "Queen").

## Sample Output

An example output might look like this:

```
Initial Deck:
2 of Hearts
3 of Hearts
...
Ace of Spades

Shuffled Deck:
7 of Diamonds
King of Hearts
...
2 of Clubs

Dealing Card: 7 of Diamonds

Checking for Same Suit:
No cards of the same suit.

Comparing Cards: King of Hearts and 2 of Clubs
King of Hearts is greater than 2 of Clubs.

Finding Card: Queen of Hearts
Card found: Queen of Hearts, Hearts
```

Feel free to explore and modify the code to suit your needs or integrate it into a larger card game project.
