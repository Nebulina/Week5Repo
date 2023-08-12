package Week6Project;

// App Class-Main Method

//a.    Instantiate a Deck and two Players, call the shuffle 
//		method on the deck.

//b.  Using a traditional for loop, iterate 52 times calling 
//	  the Draw method on the other player each iteration using the 
//	  Deck you instantiated.

//c.  Using a traditional for loop, iterate 26 times and 
//	  call the flip method for each player.

//d.  Compare the value of each card returned by the two 
//	  player’s flip methods. Call the incrementScore method on the 
//    player whose card has the higher value.

//e.  After the loop, compare the final score from each 
//	  player.

//f.  Print the final score of each player and either 
//	  “Player 1”, “Player 2”, or “Draw” depending on which score is 
//	  higher or if they are both the same.

public class App {

	public static void main(String[] args) {
	
// the instantiation of a deck
		Deck deck = new Deck();
		

		//shuffles the deck 
		System.out.println("\n" + " --- Shuffle Deck --- " + "\n");
		deck.shuffle();
		deck.describe();
		
		//Create the players
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		
		
		//Deal the cards
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.getHand().add(deck.draw());
			} else {
				player2.getHand().add(deck.draw());
		}

	}

		
		//beginning of rounds/start of the game
int round = 1;
		
		for (int i = 0; i < 26; i++) {
			System.out.println("\n" + "----Round "  + round + " of 26 ----" + "\n");
			round++;
		    Card player1Card = player1.flipCard();
		    Card player2Card = player2.flipCard();

		    System.out.print(player1.getName() + " plays: ");
		    player1Card.describe();
		    System.out.print(player2.getName() + " plays: ");
		    player2Card.describe();
		    
		    //calling the incrementScore method the the player with the higher value 
		    //printing the winner of each turn
		    if (player1Card.getValue() > player2Card.getValue()) {
		        player1.incrementScore();
		        System.out.println("\n" + player1.getName() + " wins!");
		    } else if (player1Card.getValue() < player2Card.getValue()) {
		        player2.incrementScore();
		        System.out.println("\n" + player2.getName() + " wins!");
		    } else {
		    	System.out.println("It's a draw!");
		    }
		    
		    //prints the current score per round showing game progression
		System.out.println("\n" + "Player 1 current score: " + player1.score);
		System.out.println("\n" + "Player 2 current score: " + player2.score);
		
		}
		
		//variables for the total scores
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		//prints the total scores and the winner
		System.out.println("---------------------------------------");
	    System.out.println("\n" + "Ending Score: Player 1~ " + player1Score);
	    System.out.println("\n" + "Ending Score: Player 2~ " + player2Score);
		
	    if(player1Score == player2Score) {
	    	System.out.println("\n" + "--- It's a draw! ---");
	    
	    } else if (player1Score > player2Score) {
	    	
	    	System.out.println("\n" + "--- Player 1 wins the game of war! ---");
	    } else {
	    	System.out.println("\n" + "--- Player 2 wins the game of war! ---");
	    }
	}


	}


