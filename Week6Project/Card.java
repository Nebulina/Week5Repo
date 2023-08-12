package Week6Project;


//Card Class

//	1	Fields (value, name)
//	2	Methods (getters and setters, describe)


public class Card {

	private int value; //contains numbers 2-14 & represents card value
	private String name; // contains card name
	
	//Getters and Setters 
	
	public int getValue() { //returns numerical value 
		return value;
		
	}

	public String getName() { //returns name of card name
		return name;
	}
	
	public void setValue(int v) { //sets numerical value 
		this.value = v;
	}
	
	public void setName(String n) { //sets name of the card
		this.name= n;
	}
	
	public void describe() {
        System.out.println( name );// prints the name of the card
    }
	



}
