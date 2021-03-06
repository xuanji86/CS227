package lab6;
import plotter.Plotter;
import plotter.Polyline;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Checkpoint3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Polyline> list = readFile("c://cs227//stuff//hello.txt");
		Plotter plotter = new Plotter();
		for (Polyline p : list)
	    {
	      plotter.plot(p);
	    }
//		Plotter plotter = new Plotter();
//	    Polyline p = parseOneLine("red 100 100 200 100 200 200 100 200 100 100");
//	    plotter.plot(p);
//	    
//	    p = parseOneLine("2 blue 250 100 400 350 100 350 250 100");
//	    plotter.plot(p);

	}
	  
	private static Polyline parseOneLine(String line){
		Scanner scan = new Scanner(line);
		int width;
		if(scan.hasNextInt()) {
			width = scan.nextInt();
		}else {
			width = 1;
		}
		String color = scan.next();
		Polyline p1 = new Polyline(color,width);
		while(scan.hasNextInt()) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			p1.addPoint(new Point(x,y));
		}
		scan.close();
		return p1;
	  }	 
	  
	private static ArrayList<Polyline> readFile(String filename) throws FileNotFoundException{
		Plotter plotter = new Plotter();
		File file = new File("c://cs227//stuff//hello.txt");
		Scanner scan1 = new Scanner(file);
		ArrayList<Polyline> p1 = new ArrayList<Polyline>();
		String line = scan1.nextLine();
		line = scan1.nextLine();
		while(scan1.hasNextLine()) {
			line = scan1.nextLine();
			p1.add(parseOneLine(line));
			plotter.plot(parseOneLine(line));
		}
		scan1.close();
		
		return p1;
		 
	 }
}
