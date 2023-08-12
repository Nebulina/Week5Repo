package Week6Project;


//Card Class

//	1	Fields (hand, score, name)
//	2	Methods (describe, flip, draw, incrementScore)


import java.util.ArrayList;
import java.util.List;

public class Player 
	{
	
	List<Card> hand = new ArrayList<Card>(); //Fields, this one is creating a list of the hand
	
	 int score;
	
	 String name;
	
	 
    public Player(String name) { //Constructor 
        hand = new ArrayList<Card>();
        this.score = 0;
        this.name = name;
    }

    
	 
	 public int getScore() { //gets score
		 return score;
		 
	 }
	 
	 public String getName() { //gets name
		 return name;
	 
 }
		
		
	 public List<Card> getHand() { // gets the hand
		 return hand;
}


	 public void setHand(List<Card> hand) { //sets the hand
	     this.hand = hand;
}


		public Card flipCard()  { //removes and returns the top card of the Hand
			return hand.remove(0);
		}
		
		
		public void draw(Deck d) { //calls the draw method on the deck, adding the returned Card to the hand
			 d.draw();
			
		}
		
		public void incrementScore()  { //increments the score by 1
			score += 1;
			
		}
		
		 public void describe() { //
		       
		        for (Card card : hand) {
		            card.describe();
		        }
		        
		    }
		
		
	}
	
