package lab6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class removeDuplicates {
	public static void main(String[] args) {
		String [] newlist = {"1", "1", "2","2", "3","3"};
		for(String s:newlist) {
		System.out.print(s + " ");

		}
		System.out.print("\n");
		String[] result = removeDuplicates(newlist);
		for(String s:result) {
		System.out.print(s + " ");
			
		}
	}
	
	public static String[] removeDuplicates(String[] words) {
		ArrayList<String> myList = new ArrayList<String>();
		for(String s:words) {
			if(!myList.contains(s)) {
				myList.add(s);
			}
		}
		String[] theArray = myList.toArray(new String[] {});
		return theArray;
		
	}
	
	
	
}
