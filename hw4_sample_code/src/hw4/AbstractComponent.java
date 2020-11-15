package hw4;

import api.IComponent;
import api.Pin;

/**
 * @author Anji Xu
 *
 */
public abstract class AbstractComponent implements IComponent {
	
	protected Pin[] inputs;
	protected Pin[] outputs;
	
	/**
	 * @param in The number of inputs
	 * @param out The number of outputs
	 */
	public AbstractComponent(int in, int out) {
		inputs = new Pin[in];
		outputs = new Pin[out];
		
		for(int i = 0;i < inputs.length;i++) {
			inputs[i] = new Pin(this);
		}
		for(int j = 0; j<outputs.length;j++) {
			outputs[j] = new Pin(this);
		}
	}
	@Override
	public void invalidateInputs() {
		for(Pin p : inputs) {
			if(p.isValid()) {
				p.invalidate();
			}
		}
	}
	@Override
	public void invalidateOutputs() {
		for(Pin p: outputs) {
			if(p.isValid()) {
				p.invalidate();
			}
		}
	}
	@Override
	public boolean inputsValid() {
		for(Pin p : inputs) {
			if(!p.isValid()) {
				return false;
			}
		}
		return true;
		
	}
	@Override
	public boolean outputsValid() {
		for(Pin p : outputs) {
			if(!p.isValid()) {
				return false;
			}
		}
		return true;
	}
	@Override
	public Pin[] inputs() {
		return inputs ;
	}
	@Override
	public Pin[] outputs() {
		return outputs;
		
	}
	@Override
	public void propagate() {
		
	}
}
