package hw4;

import api.IComponent;

/**
 * @author Anji Xu
 *
 */
public class MultiComponent extends CompoundComponent implements IComponent{

	public MultiComponent(IComponent[] components) {
		super(components[0].inputs().length * components.length, components.length);

	}
	
	@Override
	public void propagate() {
		for(IComponent c : getComponents()) {
			c.propagate();
		}
	}

}
