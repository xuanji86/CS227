package library;

import java.util.Date;

public abstract class libraryItem implements Item{
	public String title;
	public Date dueDate;
	public Patron checkedOutTo;

	
	
	public libraryItem(String givenTitle, Date givenDueDate, Patron givenCheckedOutTo) {
		title = givenTitle;
		dueDate = givenDueDate;
		checkedOutTo = givenCheckedOutTo; 
	}
	
	public void checkOut(Patron p, Date now) {
		
	}
	
	public void checkIn() {
		
	}
	
	public void renew(Date now) {
		
	}
	
	public Patron getPatron() {
	    return checkedOutTo;
		
	}
	

	public boolean isCheckedOut() {
	    return dueDate != null;
		
	}
	public boolean isOverdue(Date now) {
	    if (!isCheckedOut())
	    {
	      return false;
	    }
	    return now.after(dueDate);
		
	}
	public Date getDueDate() {
		return dueDate;
		
	}
	public String getTitle() {
		return title;
		
	}

	public int compareTo(Item other){
	    return title.compareTo(other.getTitle());
	}
}
