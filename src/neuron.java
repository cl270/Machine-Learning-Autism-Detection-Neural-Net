
public class neuron {
	private double weight;
	private double bias;
	private double[] inputs;
	private double output;
	
	
	neuron(double weight, double bias, int inputsize){
		this.weight = weight;
		this.bias = bias;
		this.inputs = new double[inputsize];
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
}
