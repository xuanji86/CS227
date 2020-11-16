package hw4;

public class NotGate extends AbstractComponent{

	public NotGate() {
		super(1,1);
	}
	@Override
	public void propagate() {
		if (inputsValid()) {
			int newValue = 0;
			if(inputs()[0].getValue() == 0) {
				newValue = 1;
			}else if(inputs()[0].getValue() == 1) {
				newValue = 0;
			}
			outputs()[0].set(newValue);
		}
	}


}
