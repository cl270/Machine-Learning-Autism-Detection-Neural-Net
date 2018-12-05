import java.util.ArrayList;

public class neuron {
	private double weight;
	private double bias;
	private ArrayList inputs;
	private double output;
	
	
	neuron(double weight, double bias){
		this.weight = weight;
		this.bias = bias;
	}
	
	public void changeWeight(double input) {
		this.weight = input;
	}
	
	public void changeBias(double input) {
		this.bias = input;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getBias() {
		return this.bias;
	}
	
	public void addInputDendrite(neuron N) {
		double w = N.getWeight();
		double a = N.getOutputAxon();
		this.inputs.add(w*a);
	}
	
	public double getOutputAxon() {
		return this.output;
	}
}
