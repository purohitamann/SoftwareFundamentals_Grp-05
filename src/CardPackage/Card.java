package CardPackage;

/**
 * Starter code for the Card class. To be used in Week 4.
 * provided by prof Ronak Sheth
 * @author purohiam 
 */
public class Card {

    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, JOKER
    }
    
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
