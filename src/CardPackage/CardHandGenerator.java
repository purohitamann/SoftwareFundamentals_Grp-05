package CardPackage;

import CardPackage.Card.Suit;
import CardPackage.Card.Rank;
import java.util.Random;

/**
 * Base Code Provided by Prof Ronak Sheth 
 * during Week 04
 * @author purohiam
 */

public class CardHandGenerator {

    /**
     * Generates a hand of a given size, passed as parameter 
     */
       public static Card[] generateHands(int num) {
      
         Card[] hand =new Card[num];
        Random random = new Random();
        System.out.println("Computer Generated: ");
        for (int i = 0;i<hand.length;i++){
            Card.Rank rank = Card.Rank.values()[random.nextInt(14)];
            Card.Suit suit;
            if (rank == Card.Rank.values()[13]){
                 suit = Card.Suit.values()[4];
            }else{
             suit = Card.Suit.values()[(random.nextInt(4))];
            }
           
            Card CardforGuess =new Card(rank,suit);
            hand[i]=CardforGuess; 
            System.out.printf("\t Position: %3s \n\t\t Rank: %8s \n\t\t Suit: %8s \n\t\n" ,i+1,CardforGuess.getRank(),CardforGuess.getSuit());     
            
        }
        return hand;
    }
}
