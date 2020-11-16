package hw4;

import api.IComponent;
import java.util.ArrayList;

/**
 * @author Anji Xu
 *
 */
public class CompoundComponent extends AbstractComponent{
	
	protected ArrayList<IComponent> components;

	public CompoundComponent(int numInputs, int numOutputs) {
		super(numInputs, numOutputs);
		components = new ArrayList<>();
	}
	
	public void addComponent​(IComponent c) {
		components.add(c);
	}
	
	public ArrayList<IComponent> getComponents(){
		return components;
		
	}
	@Override
	public void propagate() {
		for(IComponent c: components) {
			if(c.inputsValid()) {
				
			}
		}
	}
}
