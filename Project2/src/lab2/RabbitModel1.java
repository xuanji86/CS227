package lab2;

public class RabbitModel1 {
	private int population;
	// TODO - add instance variables as needed
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel1()
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
    
    return population %5;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
    population = population + 1;
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
