package hw4;

import api.IStatefulComponent;
import api.Pin;

public class Counter extends AbstractComponent implements IStatefulComponent {

	private int currentState;
	private boolean isEnabled;
	private int size;
	
	public Counter(int size) {
		super(0, size);
		this.currentState = 0;
		this.size = size;
	}


	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setEnabled(boolean enabled) {
		isEnabled = enabled;
		
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

}
