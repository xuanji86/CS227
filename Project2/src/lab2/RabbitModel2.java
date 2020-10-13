package lab2;

public class RabbitModel2 {
	private int population;
	// TODO - add instance variables as needed
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel2()
  {
	  population = 500;// TODO
	  
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
	  population = population/2;
    // TODO

  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    population = 500 ;
// TODO
  }
}
