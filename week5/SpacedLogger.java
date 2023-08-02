package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		for(int index = 0; index < log.length(); index++) { 
	 String space = " ";
			System.out.print(log.charAt(index) + space );
		}
	System.out.println();
		
	}

	@Override
	public void error(String error) {
		System.out.print( "ERROR: " );
		for(int index = 0; index < error.length(); index++) { 
			 String space = " ";
			 System.out.print( error.charAt(index) + space);	
				}
	}

}
