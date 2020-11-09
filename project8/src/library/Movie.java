package library;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A Movie is a library item that can be checked out for 7 days and cannot be renewed.
 * If overdue, the fine is 3.00 plus .50 per day,
 * up to a maximum equal to the item's replacement cost.
 */
public class Movie implements Item
{
  /**
   * Title of this item.
   */
  private String title;
  
  /**
   * Due date for this item.  This value is null when not checked out.
   */
  private Date dueDate;
  
  /**
   * Patron to whom this item is checked out.  This value is null when not checked out.
   */
  private Patron checkedOutTo;
  
  /**
   * Replacement cost for this DVD.
   */
  private double replacementCost;
  
  /**
   * Duration of this DVD, in minutes.
   */
  private int duration;

  /**
   * Constructs a Movie with the given title, replacement cost, and duration.
   * @param givenTitle
   *   title for this item
   * @param givenCost
   *   replacement cost for this item, in dollars
   * @param givenDuration
   *   duration of this item, in minutes
   */
  public Movie(String givenTitle, double givenCost, int givenDuration)
  {
    title = givenTitle;
    dueDate = null;
    checkedOutTo = null;
    replacementCost = givenCost;
    duration = givenDuration;
  }
  
  /**
   * Returns the duration of this Movie.
   * @return
   *   duration of this Movie
   */
  public int getDuration()
  {
    return duration;
  }
  
  @Override
  public void checkOut(Patron p, Date now)
  {
    if (!isCheckedOut())
    {
      int checkOutDays = 7;
      
      // use a GregorianCalendar to figure out the Date corresponding to
      // midnight, 7 days from now
      GregorianCalendar cal = new GregorianCalendar();
      cal.setTime(now);
      cal.add(Calendar.DAY_OF_YEAR, checkOutDays);
      
      // always set to 11:59:59 pm on the day it's due
      cal.set(Calendar.HOUR_OF_DAY, 23);
      cal.set(Calendar.MINUTE, 59);
      cal.set(Calendar.SECOND, 59);     
      
      // convert back to Date object
      dueDate = cal.getTime();
      
      checkedOutTo = p;      
    }
  }

  @Override
  public void checkIn()
  {
    if (isCheckedOut())
    {
      checkedOutTo = null;
      dueDate = null;
    }
  }

  @Override
  public void renew(Date now)
  {
    // cannot be renewed
  }

  @Override
  public double getFine(Date now)
  {
    if (isCheckedOut() && isOverdue(now))
    {
      // how late is it, in milliseconds
      double elapsed = now.getTime() - dueDate.getTime();
      
      // how late is it, in days
      int millisPerDay = 24 * 60 * 60 * 1000;
      int daysLate = (int) Math.ceil(elapsed / millisPerDay);
      
      // compute the fine
      double fine = 3 + daysLate * .50;
      return Math.min(fine, replacementCost);    }
    else
    {
      return 0;
    }
  }

  @Override
  public boolean isOverdue(Date now)
  {
    if (!isCheckedOut())
    {
      return false;
    }
    return now.after(dueDate);
  }

  @Override
  public int compareTo(Item other)
  {
    return title.compareTo(other.getTitle());
  }

  @Override
  public String getTitle()
  {
   return title;
  }

  @Override
  public boolean isCheckedOut()
  {
    return dueDate != null;
  }

  @Override
  public Date getDueDate()
  {
    return dueDate;
  }

  @Override
  public Patron getPatron()
  {
    return checkedOutTo;
  }
}
