package lab6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumberer {
	 public static void main(String[] args) throws FileNotFoundException
	  {
	    File file = new File("C:\\cs227\\stuff\\story.txt");
	    Scanner scanner = new Scanner(file);
	    int lineCount = 1;
	    
	    while (scanner.hasNextLine())
	    {
	    	int numOfWord = 0;
	    	String line = scanner.nextLine();
	    	Scanner s = new Scanner(line);
	    	while(s.hasNext()) {
	    		numOfWord++;
	    		String temp = s.next();
	    	}
	    	System.out.println(lineCount + " " + numOfWord);
	    	lineCount += 1;
	    }
	    scanner.close();
	  }
}
