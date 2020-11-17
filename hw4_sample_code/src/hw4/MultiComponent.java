package hw4;

import api.IComponent;

public class MultiComponent extends CompoundComponent implements IComponent{

	public MultiComponent(IComponent[] components) {
		super(components[0].inputs().length * components.length, components.length);

	}

}
