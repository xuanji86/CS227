package lab6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumberer1 {
	 public static void main(String[] args) throws FileNotFoundException{
		 File file = new File("C:\\cs227\\Lab5\\src\\lab5\\SimpleLoops.java");
		 Scanner scanner = new Scanner(file);
		 while (scanner.hasNextLine())
		    {
		      String line = scanner.nextLine();
		      System.out.println(line);
		    }
		    scanner.close();
	 }
}
