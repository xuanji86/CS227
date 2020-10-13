package mini1;

/**
 * Loop practice problems
 */
public class LoopInMySoup
{
  
  /**
   * Private constructor disables instantiation.
   */
  private LoopInMySoup() {}

  /**
   * Counts the number of positions in a pair of strings that have matching characters.
   * The strings need not be the same length.
   * For example, countMatchingChars("abcde", "xbydzzzzz") returns 2.
   * 
   * @param s
   *   any string
   * @param t
   *   any string
   * @return
   *   number of positions in which the characters match in the two strings
   */
  public static int countMatchingChars(String s, String t)
  {
    // TODO
    return 0;
  }
  
  /**
   * Determines the number of iterations of Newton's method
   * required to approximate the square root of x within
   * the given bound.  Newton's method starts out by 
   * setting the initial approximate <em>answer</em> to x.  
   * Then in each iteration, <em>answer</em> is replaced by 
   * the quantity <em>(answer + x / answer) / 2.0</em>.
   * The process stops when the difference between 
   * x and <em>(answer * answer)</em> is strictly less than
   * the given bound <code>err</code>.  The method
   * returns the number of iterations required.
   * The given value x must be non-negative.
   * <p>
   * For example, given x = 10 the first three iterations
   * of Newton's method produce the approximate values 
   * 5.5, 3.66, and 3.20. Those three values squared are
   * 30.29, 13.39, and 10.21, respectively.
   * Therefore <code>newtonCount(10, 1.0)</code>
   * returns 3, since it takes 3 iterations to get the result 10.21
   * that is within 1.0 of x.  
   * On the other hand, <code>newtonCount(10, 200)</code> returns 0,
   * since 10 * 10 = 100 is already within 200 units of x = 10.
   * @param x
   *   value whose square root is to be approximated
   * @param err
   *   given bound for the approximation
   * @return
   *   number of iterations required to get an approximation
   *   whose square is within the given bound of x
   */   
  public static int newtonCount(double x, double err)
  {
    // TODO
    return 0;
  }

  /**
   * Determines whether the given string of text represents a 
   * "Fibonacci-type" sequence, where the given text consists of integer
   * values separated by arbitrary whitespace.  A Fibonacci-type sequence
   * is any sequence of numbers in which each value (other than
   * the first and second) is the sum of the previous two values.
   * An example would be "-2 1 -1 0 -1 -1 -2 -3 -5 -8".
   * This method always returns true if the sequence has fewer than 3 numbers.
   * The behavior is undefined if the provided string contains any non-numeric
   * values.
   * @param text
   *   string of text (possibly empty) containing numbers separated by whitespace
   * @return
   *   true if the given sequence of numbers is a Fibonacci-type sequence, 
   *   false otherwise
   */
  public static boolean isFibonacciTypeSequence(String text)
  {
    // TODO
    return false;
  }

  
  /**
   * Returns a string similar to the given string with all 
   * runs of consecutive, repeated characters removed.  For example,
   * <ul>
   * <li>given <code>"apple"</code>, returns <code>"aple"</code>
   * <li>given <code>"banana"</code>, returns <code>"banana"</code>
   * <li>given <code>"baaannannnnaa"</code>, returns <code>"banana"</code>
   * <li>given an empty string, returns an empty string
   * </ul>
   * @param s given string
   * @return
   *   string created from s by removing runs of the same character
   */
  public static String removeRuns(String s)
  {
    // TODO
    return null;
  }
    
  /**
   * Returns a run of characters in s, 
   * starting at position <code>start</code> and continuing
   * as long as the characters match.  For example,
   * getRun("abbbbbcbc", 2) returns "bbbb", and 
   * getRun("abbbbbcbc", 0) returns "a".
   * @param s
   *   given string
   * @param start
   *   index at which to start looking for a run
   * @return
   */
  public static String getRun(String s, int start)
  {
    // TODO
    return null;
  }
   
  
  /**
   * Counts the number of times that one string occurs as a substring in
   * another, optionally allowing the occurrences to overlap.  For
   * example:
   * <ul>
   * <li><code>countSubstrings("aa", "aaaaa", false)</code> returns 2
   * <li><code>countSubstrings("aa", "aaaaa", true)</code> returns 4
   * <li><code>countSubstrings("aa", "ababab", true)</code> returns 0
   * </ul>
   * 
   * @param t
   *   string we are looking for ("target")
   * @param s
   *   string in which we are looking ("source")
   * @param allowOverlap
   *   true if occurrences of t are allowed to overlap
   * @return
   *   number of times t occurs in s as a substring
   */
  public static int countSubstrings(String t, String s, boolean allowOverlap)
  {
    // TODO
    return 0;
  }
  
  /**
   * Merges two strings together, using alternating characters from each,
   * except that runs of the same character are kept together.  For example,
   * <ul>
   * <li><code>mergeWithRuns("abcde", "xyz")</code> returns "axbyczde"</li>
   * <li><code>mergeWithRuns("abbbbcde", "xyzzz")</code> returns "axbbbbyczzzde"</li>
   * </ul>
   * Either or both of the strings may be empty.  If the first string
   * is nonempty, its first character will be first in the returned string.
   * @param t
   *   first string
   * @param s
   *   second string
   * @return
   *   string obtained by merging characters from t and s, preserving runs
   */
  public static String mergeWithRuns(String t, String s)
  {
    // TODO
    return null;
  }

}
