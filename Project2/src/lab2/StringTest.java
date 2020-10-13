package lab2;

public class StringTest {
	public static void main(String[] args) {
		String message = "Hello world!";
		int theLength = message.length();
		System.out.println(theLength);
		
		char theChar = message.charAt(1);
		System.out.println(theChar);
		String theChar1 = message.toUpperCase();
		System.out.println(theChar1);
		String theChar2 = message.substring(0, 5);
		System.out.println(theChar2);
	}
}
