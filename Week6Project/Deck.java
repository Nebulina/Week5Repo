package Week6Project;


//Deck Class

//	1	Fields (list of cards)
//	2	Methods (shuffle, draw, describe)


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck  {

	private List<Card> cards = 	new ArrayList<Card>();//list of cards
	
	
	public Deck() {
		
		String[] suits= {"Clubs", "Diamonds", "Hearts", "Spades"}; //array for suits
		String[] titles= {"Two", "Three", "Four", "Five", "Six", "Seven", //array for titles
				        "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
		
		System.out.println("\n" + "--- A new deck has been made ---" + "\n"); 
		
		
	for(String suit : suits ) { //creating the card and attaching suit, title and value
		
		int count = 2; //starting card value
		 
		for(String title : titles ) {
		
			
			Card card = new Card(); //creates the card and sets properties

		String str = (title + " " + "of" + " " + suit); //creates a String str of card title and suit
		card.setName(str); //sets card name
		card.setValue(count); //sets card value
		
		System.out.println( str);
		this.cards.add(card); //adds card to the list
		count++; // proceeds to next card value
		}
	
	}
	
}
	
	public void describe() { //describe method for card
		for (Card card : this.cards) {
			card.describe();
		}
		
	}

	public void shuffle() { //randomizes the order of the cards
		
	Collections.shuffle(cards);
	}
	
	public Card draw() { //removes and returns the top card of the Cards field
		
		 Card card = cards.remove(0); 
				return card;
	}
	


}
