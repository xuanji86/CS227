package hw4;

import api.IStatefulComponent;
import api.Pin;

/**
 * @author Anji Xu
 *
 */
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
		if(isEnabled() && inputsValid()){
			invalidateOutputs();
			currentState++;
			// TODO Auto-generated method stub
		}
		
	}


	@Override
	public void clear() {
		for(int i = 0; i< outputs().length;i++){
			outputs()[i].set(0);// TODO Auto-generated method stub
		}
		
	}


	@Override
	public void setEnabled(boolean enabled) {
		isEnabled = enabled;
		
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

}
