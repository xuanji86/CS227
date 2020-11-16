package hw4;

public class OrGate extends AbstractComponent{

	public OrGate() {
		super(2, 1);
	}
	@Override
	public void propagate() {
		if (inputsValid()) {
			int newValue = 0;
			if (inputs()[0].getValue() == 1 || inputs()[1].getValue() == 1) {
				newValue = 1;
			}
			outputs()[0].set(newValue);
		}
	}
}
