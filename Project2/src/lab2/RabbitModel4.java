package lab2;

public class RabbitModel4 {
	private int population;
	private int yearbefore;
	private int lastyear;
	// TODO - add instance variables as needed
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel4()
  {
	  population = 1;// TODO
	  yearbefore = 0;
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {// TODO - returns a dummy value so code will compile

    return population + yearbefore;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	int lastyear = population;
    population = population + yearbefore;
    yearbefore = lastyear;// TODO
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    population = 1 ;
    yearbefore = 0;// TODO
  }
}
