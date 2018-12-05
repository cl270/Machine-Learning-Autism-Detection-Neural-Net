import java.util.ArrayList;
import java.util.List;

public class neuron {
	private double weight;
	private double bias;
	private List<Double> inputs;
	private double output;
	
	neuron(double weight, double bias){
		this.weight = weight;
		this.bias = bias;
		this.output = 0;
		this.inputs = new ArrayList<Double>();
	}
	
	public void changeWeight(double input) {	this.weight = input;	}
	
	public void changeBias(double input) {	 this.bias = input;	}
	
	public double getWeight() {	  return this.weight;	}
	
	public double getBias() {	return this.bias;	}
	
	public double getOutputAxon() {   return this.output;	}
	
	public void inputsComplete() {	 decideOutput();	}
	
	public void addInputDendrite(neuron N) {
		double w = N.getWeight();
		double a = N.getOutputAxon();
		this.inputs.add(w*a);
	}
	
	private void decideOutput() {
		for(int i = 0; i<this.inputs.size(); i++) {
			this.output += inputs.get(i);
		}
		
		this.output += this.bias;
		
		sigmoidFunction s = new sigmoidFunction(this.output);
		this.output = s.getSig();
	}
}
