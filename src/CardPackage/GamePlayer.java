package CardPackage;

/**
 * A class to handle the user interaction for the Card project. Contains a main method that generates a card hand and
 * then iterates over it to print its contents to the console.
 * Base Code provided by Prof Ronak Sheth
 * @author  purohiam
 */
public class GamePlayer {

    public static void main(String[] args) {

        Card[] cardHand = CardHandGenerator.generateHand(7);
        for (Card card : cardHand) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
        
    }

}
