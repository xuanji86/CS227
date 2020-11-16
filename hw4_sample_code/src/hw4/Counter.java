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
			String binary = Integer.toBinaryString(currentState);

            char c = ' ';
            int num = 0;

            for (int i = 0; i < Math.min(binary.length(), size); i++) {
                c = binary.charAt(binary.length() - i - 1);
                num = Character.getNumericValue(c);
                outputs()[i].set(num);
            }
		}
		
	}


	@Override
	public void clear() {
		for(int i = 0; i< outputs().length;i++){
			outputs()[i].set(0);
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
