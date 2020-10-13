package lab2;
import java.util.Random;

public class RabbitModel3 {
	private int population;
	// TODO - add instance variables as needed
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel3()
  {
	  population = 0;// TODO
	  
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {// TODO - returns a dummy value so code will compile
    return population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	  Random rand = new Random();
	  population = population + rand.nextInt(10);
    // TODO

  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    population = 0 ;
// TODO
  }
}
