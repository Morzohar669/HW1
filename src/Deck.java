import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Deck {

    ArrayList<Card> deck;

    public Deck(boolean bool) {
        if (bool) {
            // set a new deck of cards
            // 52 cards total
            // 4 types and 13 numbers each
            // order: SPADES -> DIAMONDS -> CLUBS -> HEARTS

            this.deck = new ArrayList<Card>(52);

            for (int shape_i = 0; shape_i <= 3; shape_i++) {
                Shape shape = Shape.values()[shape_i];
                for (int i = 1; i <= 13; i++) {
                    Card card = new Card(i, shape);
                    deck.add(card);
                }
            }

        } else {
            // deck stays empty
            this.deck = new ArrayList<Card>(0);
        }
    }


    public void addCard(Card card) {
        // add a new card to the top of the deck
        deck.add(card);
    }

    public void print() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }

    public Card removeTopCard() {
        // remove last card from deck and get it back
        Card topCard = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return topCard;
    }

    public boolean isEmpty() {
        // return true if the deck is empty
        if (deck.size() == 0) {
            return true;
        }
        return false;
    }

    public void shuffle() {
        // loop 50 times, random 2 indexes of arr will switch values.
        // uses rnd in main.
        for (int i = 0; i < 50; i++) {
            int randomInteger1 = (int) (52.0 * Math.random());
            int randomInteger2 = (int) (52.0 * Math.random());
            Collections.swap(deck, randomInteger1, randomInteger2);
        }
    }

}
