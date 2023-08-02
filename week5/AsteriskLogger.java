package week5;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String asterisks = "*".repeat(error.length() + 6);
		System.out.println(asterisks);
		System.out.println("***" + error + "***");
		System.out.println(asterisks);
	}

}
