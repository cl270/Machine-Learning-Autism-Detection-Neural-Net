import java.util.stream.Stream;

public class characteristicNeuron extends neuron {
	String[] demographicArray;
	
	// special neuron that exists only in inputlayer
	// specifically to process demographics data
	// (ethnicity, nationality, gender, etc).
	characteristicNeuron(double weight, double bias, String[] ethnicity, String[] nationality, String[] gender) {
		super(weight, bias);
		this.demographicArray = (String[])Stream.of(ethnicity, nationality, gender).flatMap(Stream::of).toArray(); 
	}
	
	
	public void addInitialInput(String s) {
		double val = (double) findIndex(s, this.demographicArray);
		this.inputs.add(val);
	}
	
	private int findIndex(String s, String[] arr) {
		for(int i = 0; i< arr.length; i++) {
			if(s.equals(arr[i])) { return i*5;}
		}
		
		return -1;
	}
	
}
