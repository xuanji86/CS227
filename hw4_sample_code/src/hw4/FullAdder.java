package hw4;

import api.IComponent;

public class FullAdder extends CompoundComponent {
	
	private IComponent halfAdder1;
	private IComponent halfAdder2;
	private IComponent orGate;
	
	public FullAdder() {
		super(3, 2);
		
		halfAdder1 = new HalfAdder();
		halfAdder2 = new HalfAdder();
		orGate = new OrGate();
		
		addComponent​(halfAdder1);
		addComponent​(halfAdder2);
		addComponent​(orGate);
		
	}
	

}
