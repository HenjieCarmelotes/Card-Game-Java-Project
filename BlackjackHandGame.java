package oop;

import java.util.Scanner;

/**
 * Creates random blackjack hands, with 2 to 6 cards,
 * and prints out the blackjack value of each hand.
 * The user decides when to stop.
 */

public class BlackjackHandGame {
	
	public static void main(String[] args) {
		   
	      Deck deck;            // A deck of cards.
	      Card card;            // A card dealt from the deck.
	      BlackjackHand hand;   // A hand of from two to six cards.
	      int cardsInHand;      // Number or cards in the hand.
	      boolean again;        // Set to true if user wants to continue.
	      Scanner stdin = new Scanner(System.in);
	      deck = new Deck();    // Create the deck.
	      deck.shuffle(); //not shuffling it will arrange the deck in order. 

	      do {
	         //deck.shuffle(); //always shuffle to renew all the cards on the table if not, reshuffle it when the deck is less than 6.
	         hand = new BlackjackHand(); 
	         cardsInHand = 2 + (int)(Math.random()*5); //possible cards in hand can be 2 to 6.
	         System.out.println();
	         System.out.println();
	         System.out.println("Hand contains:");
	         for ( int i = 1; i <= cardsInHand; i++ ) {
	                // Get a card from the deck, print it out,
	                //   and add it to the hand.
	            card = deck.dealCard();
	            hand.addCard(card);
	            System.out.println("    " + card);
	         }
	         System.out.println("Value of hand is " + hand.getBlackjackValue());
	         System.out.println();
	         System.out.print("Again? ");
	         again = stdin.nextBoolean(); //answer must be a valid boolean.. true or false.
	         
	         if (deck.cardsLeft() < 6)  
	             deck.shuffle();
	         
	      } while (again == true); 
	    
	      
	      System.out.print("Thank you for playing, goodbye! ");
	      
	   } //end of main
	   
	
	

} //end BlackjackHandGame class
