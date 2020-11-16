package hw4;

import api.IComponent;
import java.util.ArrayList;

public class HalfAdder extends CompoundComponent{

	public HalfAdder() {
		super(2, 2);
		IComponent andGate = new AndGate();
		IComponent andGate2 = new AndGate();
		IComponent orGate = new OrGate();
		IComponent notGate = new NotGate();
		addComponent​(andGate);
		addComponent​(andGate2);
		addComponent​(orGate);
		addComponent​(notGate);
		
		inputs()[0].connectTo(andGate.inputs()[0]);
		inputs()[1].connectTo(andGate.inputs()[1]);
		inputs()[0].connectTo(orGate.inputs()[0]);
		inputs()[1].connectTo(orGate.inputs()[1]);
		
		orGate.outputs()[0].connectTo(andGate2.inputs()[0]);
		andGate.outputs()[0].connectTo(notGate.inputs()[0]);
		notGate.outputs()[0].connectTo(andGate.inputs()[1]);
		
		andGate2.outputs()[0].connectTo(outputs()[0]);
		andGate.outputs()[0].connectTo(outputs()[1]);
		
	}

}
