
public class neuron {
	private double weight;
	private double bias;
	
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
}
